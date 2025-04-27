package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.model.User;
import org.acme.repository.UserRepository;

import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserRepository userRepository;

    @POST
    @Path("/create")
    public Response createUser(User user) {
        userRepository.createUser(user);
        return Response.status(Response.Status.CREATED).entity("User created successfully!").build();
    }

    @GET
    @Path("/all")
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
