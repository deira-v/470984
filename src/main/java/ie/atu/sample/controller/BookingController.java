package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService service;
    public BookingService bookingService;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Booking> getBookings() {
        return service.getBookings();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking reserveRoom(@RequestBody Booking booking) {
        return service.reserveRoom(booking);
    }

}
