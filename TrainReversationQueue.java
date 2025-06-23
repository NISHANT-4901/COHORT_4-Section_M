import java.util.*;

public class TrainReversationQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Seat available:");
        int availableSeat = scanner.nextInt();
        scanner.nextLine(); 

        while (availableSeat > 0) {

            System.err.println("Select menu");
            System.out.println("1. Book Ticket ");
            System.err.println("2. Seat Left ");
            System.err.println("3. exit ");
            System.out.println("Enter choice:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Ticket booked.");
                    availableSeat--;
                    break;

                case "2":
                    System.err.println("Seats left: " + availableSeat);
                    break;
                case "3":
                availableSeat=-1;

                break;
                

                default:
                    System.out.println("Invalid choice");
                    
            }

            if (availableSeat == 0) {
                System.err.println("No seat available.");
                break;
            }
        }

        
    }
}
