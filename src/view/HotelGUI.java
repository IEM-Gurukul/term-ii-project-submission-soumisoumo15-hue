package view;

import Service.HotelService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelGUI extends JFrame {

    private HotelService hotel = new HotelService();

    private JTextField roomField, typeField, customerField;
    private JTextArea outputArea;

    public HotelGUI() {

        setTitle("Hotel Booking System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input Fields
        add(new JLabel("Room No:"));
        roomField = new JTextField(15);
        add(roomField);

        add(new JLabel("Room Type:"));
        typeField = new JTextField(15);
        add(typeField);

        add(new JLabel("Customer Name:"));
        customerField = new JTextField(15);
        add(customerField);

        // Buttons
        JButton addBtn = new JButton("Add Room");
        JButton viewBtn = new JButton("View Rooms");
        JButton bookBtn = new JButton("Book Room");
        JButton cancelBtn = new JButton("Cancel Booking");

        add(addBtn);
        add(viewBtn);
        add(bookBtn);
        add(cancelBtn);

        // Output Area
        outputArea = new JTextArea(10, 40);
        add(new JScrollPane(outputArea));

        // Button Actions

        addBtn.addActionListener(e -> {
            int room = Integer.parseInt(roomField.getText());
            String type = typeField.getText();

            hotel.addRoom(room, type);
            outputArea.setText("Room added\n");
        });

        viewBtn.addActionListener(e -> {
            outputArea.setText("");

            hotel.viewRooms(); // still prints in console
            outputArea.append("Check console for room list\n");
        });

        bookBtn.addActionListener(e -> {
            int room = Integer.parseInt(roomField.getText());
            String name = customerField.getText();

            hotel.bookRoom(room, name);
            outputArea.setText("Room booked\n");
        });

        cancelBtn.addActionListener(e -> {
            int room = Integer.parseInt(roomField.getText());

            hotel.cancelBooking(room);
            outputArea.setText("Booking cancelled\n");
        });

        setVisible(true);
    }
}
