package Service;

import Model.Room;
import Model.Customer;
import Model.Booking;

import java.util.ArrayList;

public class HotelService {

    private ArrayList<Room> rooms = new ArrayList<>();
    private int customerCounter = 1;

    public void addRoom(int roomNumber, String type) {

        Room room = new Room(roomNumber, type);

        rooms.add(room);

        System.out.println("Room added successfully");
    }

    public void viewRooms() {

        if(rooms.isEmpty()) {
            System.out.println("No rooms available");
            return;
        }

        for(Room r : rooms) {
            r.display();
        }
    }

    public void bookRoom(int roomNumber, String customerName) {

        for(Room r : rooms) {

            if(r.getRoomNumber() == roomNumber && !r.isBooked()) {

                Customer customer = new Customer(customerCounter++, customerName);

                Booking booking = new Booking(r, customer);

                r.bookRoom();

                System.out.println("Room booked successfully");

                SaveThread thread =
                        new SaveThread(booking.getBookingDetails());

                thread.start();

                return;
            }
        }

        System.out.println("Room not available");
    }

    public void cancelBooking(int roomNumber) {

        for(Room r : rooms) {

            if(r.getRoomNumber() == roomNumber && r.isBooked()) {

                r.cancelBooking();

                System.out.println("Booking cancelled");

                return;
            }
        }

        System.out.println("Booking not found");
    }
}
