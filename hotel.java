import java.util.Scanner;
import java.util.HashMap;

class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Available - Standard");
        rooms.put(102, "Available - Deluxe");
        rooms.put(103, "Available - Suite");

        
        HashMap<Integer, String> bookings = new HashMap<>();

        System.out.println("Welcome to the Hotel Reservation System!");
        boolean exit = false;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("\nAvailable Rooms:");
                    for (int room : rooms.keySet()) {
                        System.out.println("Room " + room + ": " + rooms.get(room));
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Room Number to Reserve: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (rooms.containsKey(roomNumber) && rooms.get(roomNumber).startsWith("Available")) {
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        rooms.put(roomNumber, "Booked by " + name);
                        bookings.put(roomNumber, name);
                        System.out.println("Room " + roomNumber + " reserved successfully for " + name + "!");
                    } else {
                        System.out.println("Room not available or invalid room number.");
                    }
                    break;

                case 3: 
                    System.out.println("\nBooking Details:");
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings.");
                    } else {
                        for (int room : bookings.keySet()) {
                            System.out.println("Room " + room + ": Reserved by " + bookings.get(room));
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Thank you");
                    exit = true;
                    break;

                default: 
                    System.out.println("Invalid choice.");
            }
        }


    }
}
