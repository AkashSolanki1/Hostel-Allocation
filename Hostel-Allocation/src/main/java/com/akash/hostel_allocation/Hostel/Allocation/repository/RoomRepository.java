package com.akash.hostel_allocation.Hostel.Allocation.repository;

import com.akash.hostel_allocation.Hostel.Allocation.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
