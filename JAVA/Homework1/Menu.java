import java.util.Scanner;

// Menu Class

////////////////////////////////////////
// Data members:
// String[] menuChoice: Menu choices
////////////////////////////////////////

public class Menu {
    private String[] menuChoice;

    // Default Constructor
    public Menu(){
        this.menuChoice = new String[6];
        this.menuChoice[0] = "1. Display all the Citation data using CitationList.toString()";
        this.menuChoice[1] = "2. Display all Citations by chosen typeOfOffense.";
        this.menuChoice[2] = "3. Search for a Citation by number.";
        this.menuChoice[3] = "4. Search for a Citation by Person last name.";
        this.menuChoice[4] = "5. Add a new Citation.";
        this.menuChoice[5] = "6. Exit the system.";
    }

    // Overloaded Constructor
    public Menu(String[] menuChoiceNew) {
        this.menuChoice = menuChoiceNew;
    }

    // displayMenu Method
    // Display the menu and return the user's choice
    int displayMenu(Scanner scanner) {
        System.out.println("Please choose from the following options:");
        System.out.println(String.join("\n", this.menuChoice));
        System.out.print("Enter your choice: ");
        
        int choice = 0;
        try {
            choice = scanner.nextInt(); 
        } catch (Exception e) {
            System.out.println("Invalid input. Exiting system.");
        }
        
        return choice;
    }

    
}
