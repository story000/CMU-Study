// Author: Siyuan Liu
// Andrew ID: sliu5
// Version: 2024-09-12

import java.util.Scanner;

// Main Class
public class hw1Main {
    public static void main(String[] args) {
        // Initialize the CitationList and Menu objects
        CitationList citationList = new CitationList("Chief", "Barrett");
        Menu menu = new Menu();

        // Read the citations from the file
        citationList.readCitationFile("citations.csv");

        // Begin the Citation System
        System.out.println("---------------------------------");
        System.out.println("Welcome to the Citation System!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu and get the user's choice
            int choice = menu.displayMenu(scanner);
            
            //  Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    citationList.displayCitationsAll();
                    break;
                case 2: 
                    System.out.print("Enter the type of offense: ");
                    citationList.displayCitationsType(scanner.next());
                    break;
                case 3:
                    System.out.print("Enter the number: ");
                    citationList.displayCitationsID(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Enter the last name: ");
                    citationList.displayCitationsLastName(scanner.next());
                    break;
                case 5:
                    citationList.newCitation(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (choice == 6) {
                break;
            }
        }
        scanner.close();

        // End the Citation System
        System.out.println("---------------------------------");
        System.err.println("System Closed.");

        // Write the citations to the file
        citationList.writeCitationFile("new_citation.csv");
    }
}
