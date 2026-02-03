package sevice;


import model.Room;
import org.springframework.stereotype.Service;
import repository.RoomRepository;

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

    // 🔥 Allocation Logic
    public Optional<Room> allocateRoom(int students, boolean needsAC, boolean needsWashroom) {

        return roomRepository.findAll()
                .stream()
                .filter(r -> r.getCapacity() >= students)
                .filter(r -> r.isHasAC() == needsAC)
                .filter(r -> r.isHasAttachedWashroom() == needsWashroom)
                .min(Comparator.comparingInt(Room::getCapacity));
    }
}
