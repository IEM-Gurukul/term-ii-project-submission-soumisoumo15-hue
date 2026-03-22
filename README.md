[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Hotel Booking System

## Problem Statement (max 150 words)

Managing hotel room bookings manually can be inefficient, time-consuming, and prone to errors such as double bookings and inaccurate record keeping. As the number of rooms and customers increases, it becomes difficult for hotel staff to track room availability, maintain booking records, and manage customer details effectively. The proposed Hotel Booking System aims to provide a digital solution to automate and streamline these operations. The system allows users to add and manage rooms, check availability, book and cancel reservations, and associate bookings with customer information. It also incorporates data persistence using file handling to ensure booking records are saved for future use. Additionally, threads are utilized for background processing, such as saving booking data without interrupting the main application flow. By applying Object-Oriented Programming principles and a modular structure, the system improves efficiency, accuracy, and overall management of hotel booking operations.

## Target User

- Hotel reception staff responsible for managing bookings
- Hotel managers overseeing room availability and operations
- Customers booking rooms (via staff interface)
- Small hotel, lodge, or guest house administrators

## Core Features

- Add and manage hotel room details (room number, type)
- View all rooms and check real-time availability status
- Book rooms by associating customer details
- Cancel existing bookings
- Manage customer information linked to each booking
- Store booking records using file handling (data persistence)
- Background saving of booking data using threads
- Display booking and room details through a user-friendly interface (console/GUI)
- Prevent duplicate bookings for already occupied rooms
- Modular and scalable design using OOP principles

## OOP Concepts Used

- Abstraction: Core operations like room management, booking, and cancellation are handled through service classes (e.g., HotelService), hiding internal implementation details from the user.
- Inheritance: Class data (Room, Customer, Booking) is kept private and accessed through getters/setters, ensuring data security and controlled access.
- Polymorphism: Methods like display() or booking operations can be overridden or extended to behave differently for different room types or scenarios.
- Exception Handling: Try–catch blocks are used to handle invalid inputs, booking errors, or file handling issues, ensuring smooth program execution.
- Collections: Java ArrayList is used to store and manage rooms, customers, and booking records dynamically.
- Multithreading (Threads): Threads are used to perform background tasks such as saving booking data to a file without interrupting the main application flow.


## Proposed Architecture Description

The system follows a modular architecture with a structure similar to the Model–View–Controller (MVC) pattern. The model layer includes classes such as Room, Customer, and Booking, which represent the core data of the system. The service layer (HotelService, FileService) handles business logic like room management, booking operations, and data persistence. The view layer (console or Java Swing GUI) provides the user interface for interaction. Additionally, multithreading is used to handle background tasks such as saving booking data without interrupting the main program flow. This separation of concerns improves code organization, maintainability, and scalability of the application.

## How to Run
1. Start the program
2. Initialize room list and customer counter
3. Display menu options
4. Take user choice
- If choice = Add Room → input details and store room
- If choice = View Rooms → display all rooms
- If choice = Book Room → input room & customer, check availability, book room, save data using thread
- If choice = Cancel Booking → input room and cancel booking
- If choice = Exit → stop program
5. End

## Git Discipline Notes
Minimum 10 meaningful commits required.
- git commit -m "Initial project setup with folder structure"
- git commit -m "Added Room class with attributes and methods"
- git commit -m "Added Customer class for user details"
- git commit -m "Implemented Booking class to link room and customer"
- git commit -m "Implemented HotelService with room management functions"
- git commit -m "Added booking and cancellation functionality"
- git commit -m "Implemented file persistence for booking data"
- git commit -m "Added multithreading for background data saving"
- git commit -m "Created menu-driven interface in Main class"
- git commit -m "Developed GUI using Java Swing"
- git commit -m "Improved UI and fixed input handling issues"
- git commit -m "Added README with project description and usage"
