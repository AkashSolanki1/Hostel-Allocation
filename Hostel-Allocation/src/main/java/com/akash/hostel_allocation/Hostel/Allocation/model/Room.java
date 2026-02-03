package com.akash.hostel_allocation.Hostel.Allocation.model;

import jakarta.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNo;
    private int capacity;
    private boolean ac;
    private boolean attachedWashroom;

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isAttachedWashroom() {
        return attachedWashroom;
    }

    public void setAttachedWashroom(boolean attachedWashroom) {
        this.attachedWashroom = attachedWashroom;
    }
}
