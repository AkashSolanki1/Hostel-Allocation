package model;

import jakarta.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNo;
    private int capacity;
    private boolean hasAC;
    private boolean hasAttachedWashroom;

    // getters and setters
}
