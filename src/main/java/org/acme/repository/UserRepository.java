package org.acme.repository;

import org.acme.model.TicketPurchase;
import org.acme.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class UserRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
   public void createUser(User user) {
    if (user.getSoldTickets() != null) {
        for (TicketPurchase ticket : user.getSoldTickets()) {
            ticket.setUser(user);
        }
    }
    em.persist(user);
}

    public List<User> getAllUsers() {
        return em.createQuery("SELECT u FROM User u", User.class)
                 .getResultList();
    }
}
