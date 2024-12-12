import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PigMarketSystem {
    private static List<User> users = new ArrayList<>(); 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to PiggInnovations!");
        System.out.println("Empower your Farm, Elevate your Profits");
        System.out.println("---------------------------------------");

        Pig[] pigs = { new Pig("001", "Yorkshire", 150.0), new Pig("002", "Landrace", 180.0) };
        users.add(new Farmer("John Doe", "123-456-7890", "Farmville", pigs));
        users.add(new Buyer("Jane Smith", "098-765-4321", "Buyertown"));

        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View Farmers");
            System.out.println("2. View Buyers");
            System.out.println("3. Registration");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();
            try {
                int choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    displayUsers(Farmer.class, scanner);
                    break;
                case 2:
                    displayUsers(Buyer.class, scanner);
                    break;
                case 3:
                    registerUser(scanner);
                    break;
                case 4:
                    exitSystem = true;
                    System.out.println("Thank you for using PiggInnovations! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\"Invalid input! Please enter a number between 1 and 4.");
        }
    }
        scanner.close();
    }

    private static void displayUsers(Class<?> userType, Scanner scanner) {
        System.out.println("\nDisplaying " + (userType == Farmer.class ? "Farmers" : "Buyers") + ":");
        for (User user : users) {
            if (userType.isInstance(user)) {
                user.displayInfo();
            }
        }

        System.out.println("\nType 'exit' to return to the main menu.");
        String input;
        do {
            System.out.print("Your input: ");
            input = scanner.nextLine().trim().toLowerCase();
        } while (!input.equals("exit"));
    }

    private static void registerUser(Scanner scanner) {
        while (true) {
            System.out.println("\nAre you a Farmer or a Buyer? (Type 'exit' to return to the main menu.)");
            String userType = scanner.nextLine().trim().toLowerCase();

            if (userType.equals("exit")) {
                return;
            }

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your contact info: ");
            String contactInfo = scanner.nextLine();
            System.out.print("Enter your location: ");
            String location = scanner.nextLine();

            if (userType.equals("farmer")) {
                System.out.print("Enter the number of pigs you have: ");
                int numPigs = scanner.nextInt();
                scanner.nextLine();
                Pig[] pigs = new Pig[numPigs];
                for (int i = 0; i < numPigs; i++) {
                    System.out.print("Enter pig " + (i + 1) + " ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter pig " + (i + 1) + " breed: ");
                    String breed = scanner.nextLine();
                    System.out.print("Enter pig " + (i + 1) + " price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    pigs[i] = new Pig(id, breed, price);
                }
                users.add(new Farmer(name, contactInfo, location, pigs));
                System.out.println("Farmer registered successfully!");
            } else if (userType.equals("buyer")) {
                users.add(new Buyer(name, contactInfo, location));
                System.out.println("Buyer registered successfully!");
            } else {
                System.out.println("Invalid user type! Please enter 'Farmer' or 'Buyer'.");
            }

            System.out.println("\nDo you want to register another user? (yes/no)");
            String continueRegistration = scanner.nextLine().trim().toLowerCase();
            if (!continueRegistration.equals("yes")) {
                break;
            }
        }
    }
}
