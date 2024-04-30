package myfamilyprojec9;

import java.util.Scanner;
public class MAin {
    public static void main(String[] args) {
        FamilyService familyService = new FamilyService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Available commands:");
            System.out.println("1. Fill with test data");
            System.out.println("2. Display the entire list of families");

            System.out.print("Enter command (or 'exit' to quit): ");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            switch (command) {
                case "1":

                    break;
                case "2":
                    familyService.displayAllFamilies();
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
