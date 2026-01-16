package main;
import main.Reservation;
import main.Cancellation;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Login login = new Login();

        if (login.authenticate()) {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Reservation");
                System.out.println("2. Cancellation");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("Please enter a valid number");
                    sc.next();
                    choice = 0;
                }

                switch (choice) {
                    case 1:
                        Reservation res = new Reservation();
                        res.bookTicket();
                        break;
                    case 2:
                        Cancellation cancel = new Cancellation();
                        cancel.cancelTicket();
                        break;
                    case 3:
                        System.out.println("Thank you for using the system");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3);
        }
    }
}
