package org.acme.model;

import java.time.LocalDateTime;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
@Entity
public class TicketPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String ticketType; 
    @Column(nullable = false)
    private LocalDateTime purchaseTime;
    @ManyToOne
@JoinColumn(name = "user_id")
    private User user;

    public TicketPurchase(int id, String ticketType, LocalDateTime purchaseTime, User user) {
        this.id = id;
        this.ticketType = ticketType;
        this.purchaseTime = purchaseTime;
        this.user = user;
    }

    public TicketPurchase() {
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
