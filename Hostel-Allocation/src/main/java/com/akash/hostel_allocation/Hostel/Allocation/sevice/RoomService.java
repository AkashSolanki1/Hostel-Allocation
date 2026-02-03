package com.akash.hostel_allocation.Hostel.Allocation.sevice;

import com.akash.hostel_allocation.Hostel.Allocation.model.Room;
import com.akash.hostel_allocation.Hostel.Allocation.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    // 🔥 Smallest suitable room allocation
    public Optional<Room> allocateRoom(int students, boolean needsAC, boolean needsWashroom) {
        return roomRepository.findAll()
                .stream()
                .filter(r -> r.getCapacity() >= students)
                .filter(r -> r.isAc() == needsAC)
                .filter(r -> r.isAttachedWashroom() == needsWashroom)
                .min(Comparator.comparingInt(Room::getCapacity));
    }
}
