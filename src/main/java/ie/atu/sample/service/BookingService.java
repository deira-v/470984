package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;

import java.util.List;

public class BookingService {
    private final BookingRepository repository;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository repository, RoomRepository roomRepository) {
        this.repository = repository;
        this.roomRepository = roomRepository;
    }

    public List<Booking> getBookings() {
        return repository.findAll();
    }

    public Booking reserveRoom(Booking booking) {
        booking.setId(null);
        return repository.save(booking);
    }

}
