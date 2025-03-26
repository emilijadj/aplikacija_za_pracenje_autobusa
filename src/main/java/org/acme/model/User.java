package org.acme.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private List<TicketPurchase> ticketPurchases;

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.ticketPurchases = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TicketPurchase> getTicketPurchases() {
        return ticketPurchases;
    }

    public void addTicketPurchase(TicketPurchase ticketPurchase) {
        this.ticketPurchases.add(ticketPurchase);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ticketPurchases=" + ticketPurchases +
                '}';
    }

}
