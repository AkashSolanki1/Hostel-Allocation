package controller;


import model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sevice.RoomService;

import java.util.Optional;

@Controller
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/rooms";
    }

    @GetMapping("/rooms")
    public String viewRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }

    @GetMapping("/add-room")
    public String addRoomForm(Model model) {
        model.addAttribute("room", new Room());
        return "add-room";
    }

    @PostMapping("/add-room")
    public String addRoom(@ModelAttribute Room room) {
        roomService.addRoom(room);
        return "redirect:/rooms";
    }

    @GetMapping("/allocate")
    public String allocateForm() {
        return "allocate";
    }

    @PostMapping("/allocate")
    public String allocateRoom(
            @RequestParam int students,
            @RequestParam boolean needsAC,
            @RequestParam boolean needsWashroom,
            Model model) {

        Optional<Room> room = roomService.allocateRoom(students, needsAC, needsWashroom);

        model.addAttribute("result",
                room.map(r -> "Allocated Room: " + r.getRoomNo())
                        .orElse("No room available"));

        return "allocate";
    }
}
