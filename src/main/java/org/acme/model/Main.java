package org.acme.model;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Marko", "marko@gmail.com", "pass123");
        Bus bus = new Bus(1L, "BG-1234-AA");
        Line line = new Line(1L, "Linija 23");

        TicketPurchase ticket = new TicketPurchase(1L, "Jednokratna", LocalDateTime.now(), user);
        user.addTicketPurchase(ticket);

        BusLocation location = new BusLocation(1L, 44.7866, 20.4489, LocalDateTime.now(), bus);
        bus.addLocation(location);
        bus.addLine(line);

        System.out.println(user);
        System.out.println(bus);
        System.out.println(line);
    }

}
