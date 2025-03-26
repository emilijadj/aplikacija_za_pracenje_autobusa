package org.acme.model;

import java.time.LocalDateTime;

public class TicketPurchase {

    private Long id;
    private String ticketType; // "Jednokratna" ili "Mesečna"
    private LocalDateTime purchaseTime;
    private User user;

    public TicketPurchase(Long id, String ticketType, LocalDateTime purchaseTime, User user) {
        this.id = id;
        this.ticketType = ticketType;
        this.purchaseTime = purchaseTime;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(LocalDateTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TicketPurchase{" +
                "id=" + id +
                ", ticketType='" + ticketType + '\'' +
                ", purchaseTime=" + purchaseTime +
                ", user=" + user.getName() +
                '}';
    }

}
