package org.acme.repository;

import org.acme.model.LineStops;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LineStopsRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void create(LineStops lineStops) {
        em.persist(lineStops);
    }

    @Transactional
    public void deleteById(Long id) {
        LineStops entity = em.find(LineStops.class, id);
        if (entity != null) {
            em.remove(entity);
        }
    }

    public LineStops findById(Long id) {
        return em.find(LineStops.class, id);
    }
}
