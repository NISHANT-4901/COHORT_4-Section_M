import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        boolean continueBooking = true;

        
        try (Scanner scanner = new Scanner(System.in)) {
            while (continueBooking) {
                
                System.out.println("Please enter the movie genre (e.g., Action, Comedy, Drama):");
                String movieGenre = scanner.nextLine().trim();

               
                System.out.println("Please enter seat type (gold/silver):");
                String seatType = scanner.nextLine().toLowerCase().trim();

               
                System.out.println("Would you like snacks? (yes/no):");
                String snackPreference = scanner.nextLine().toLowerCase().trim();

               
                switch (movieGenre.toLowerCase()) {
                    case "action":
                        System.out.println("You selected an Action movie.");
                        break;
                    case "comedy":
                        System.out.println("You selected a Comedy movie.");
                        break;
                    case "drama":
                        System.out.println("You selected a Drama movie.");
                        break;
                    default:
                        System.out.println("Other genre selected.");
                        break;
                }

               
                if (seatType.equals("gold")) {
                    System.out.println("You have chosen a Gold seat. Premium seating!");
                } else if (seatType.equals("silver")) {
                    System.out.println("You have chosen a Silver seat. Standard seating!");
                } else {
                    System.out.println("Invalid seat type selected, defaulting to standard seating.");
                }

                
                if (snackPreference.equals("yes")) {
                    System.out.println("Snacks added to your order.");
                } else if (snackPreference.equals("no")) {
                    System.out.println("No snacks added.");
                } else {
                    System.out.println("Invalid input for snacks, assuming no snacks.");
                }

               
                System.out.println("Would you like to book another ticket? (yes/no):");
                String continueResponse = scanner.nextLine().toLowerCase().trim();

                if (continueResponse.equals("no")) {
                    continueBooking = false;
                }
            }

            System.out.println("Thank you for using the Movie Ticket Booking App!");
        } // Scanner is closed automatically here
    }
}