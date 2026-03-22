package Model;

public class Booking {

    private Room room;
    private Customer customer;

    public Booking(Room room, Customer customer) {
        this.room = room;
        this.customer = customer;
    }

    public String getBookingDetails() {
        return "Room " + room.getRoomNumber() + " booked by " + customer.getName();
    }
}
