package org.acme.resource;

import org.acme.model.BusStop;
import org.acme.model.Line;
import org.acme.model.LineStops;
import org.acme.repository.LineStopsRepository;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/line-stops")
public class LineStopsResource {

    @Inject
    LineStopsRepository repository;

    @Inject
    EntityManager em; // samo za traženje postojećih entiteta

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response createLineStop(LineStops input) {
        Line line = em.find(Line.class, input.getLine().getId());
        if (line == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Line with ID " + input.getLine().getId() + " not found.").build();
        }

        BusStop stop = em.find(BusStop.class, input.getBusStop().getId());
        if (stop == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("BusStop with ID " + input.getBusStop().getId() + " not found.").build();
        }

        LineStops newLink = new LineStops();
        newLink.setLine(line);
        newLink.setBusStop(stop);

        repository.create(newLink);

        return Response.status(Response.Status.CREATED).entity("LineStop created").build();
    }
}
