import NotePackage.Note;
import NotePackage.NoteCollection;
import NotePackage.NoteDisplayer;
import NotePackage.NumberSorter;
import NotePackage.SizeSorter;
import java.util.Scanner;
// Driver for Lab9
public class MakeANote {

    // Keyboard scanner for user input
    private static Scanner keyboard = new Scanner(System.in);

    // String values for the main menu - title first
    private static final String[] mainMenu = {"Main Menu", "Create a new Note",
            "Display existing Note(s)", "Quit"};

    // String  values for the create sub-menu - title first
    private static final String[] createMenu = {"Note Creation", "Create a Memo",
            "Create a Timed Memo", "Create a Polite Memo", "Return to previous menu"};

    // String values for the display sub-menu - title first
    private static final String[] displayMenu = {"Display Options", "Display all Notes",
            "Display Note by Number", "Display Notes by Name", "Sort by Name", "Sort by Number", "Sort by Size", "Return to previous menu"};

    // getMenuChoice(String[] menu)
    //      Displays menu[]
    //      Prompts the user for a choice
    //      Returns choice without error checking
    private static int getMenuChoice(String[] menu) {
        int choice;
        System.out.println(menu[0]);
        // Display the menu, whatever its size is
        for (int i = 1; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(keyboard.nextLine());
        return choice;
    }

    // main()
    //      Display the main menu, get a choice
    //      Create: get information for a new Memo
    //      Submenus: tbd
    public static void main(String[] args) {

        // Create an empty NoteCollection
        NoteCollection noteCollection = new NoteCollection();
        // Menu choice
        int choice;
        // Memo values
        String name = null, body = null, from = null, to = null;
        // Note object to be new-ed up below
        Note note = null;
        // Submenu choic
        int subchoice;

        // Loop until the user chooses quit
        do {
            // Get the main menu choice
            choice = getMenuChoice(mainMenu);

            // What did they choose?
            switch (choice) {

                // Create a new Note
                case 1:
                    
                    // Loop until the user chooses quit
                    do {

                        // Get the create submenu choice
                        subchoice = getMenuChoice(createMenu);

                        // For now, create only a Memo
                        if (subchoice == 1 || subchoice == 2 || subchoice == 3) {
                            System.out.print("Enter memo name: ");
                            name = keyboard.nextLine();
                            System.out.print("Enter memo body: ");
                            body = keyboard.nextLine();
                            System.out.print("Enter who this is from: ");
                            from = keyboard.nextLine();
                            System.out.print("Enter who this is to: ");
                            to = keyboard.nextLine();

                        }
                        switch (subchoice) {
                            // Create a Memo
                            case 1:
                                // Your code here: create a Memo object and add
                                // it to the Notecollection
                                //Use createNote( ) in main( ) in the places you previously new'd up notes
                                note = NoteCollection.createNote("Memo", name, body, from, to);
                                noteCollection.add(note);
                                System.out.print(note.toString());
                                break;


                            // Create a TimedMemo
                            case 2:
                                note = NoteCollection.createNote("TimedMemo", name, body, from, to);
                                noteCollection.add(note);
                                System.out.print(note.toString());
                                break;

                            // Create a PoliteTimedMemo
                            case 3:
                                note = NoteCollection.createNote("PoliteTimedMemo", name, body, from, to);
                                noteCollection.add(note);
                                System.out.print(note.toString());
                                break;

                            // Quit
                            case 4:
                                break;
                            
                            // Default Option
                            default:
                                NoteDisplayer.displayErrorMessage("Invalid choice");
                                break;
                        }
                    } while (subchoice != 4);

                // Display Notes
                case 2:
                    // Loop until the user chooses quit
                    do {

                        // Get the display submenu choice
                        subchoice = getMenuChoice(displayMenu);
                        switch (subchoice) {

                            // Display all notes
                            case 1:
                                // Your code here: display all notes
                                for (Note n : noteCollection.getAllNotes()){
                                    if (n != null) {
                                        NoteDisplayer.displayNoteFancy(n);
                                    } else {
                                        NoteDisplayer.displayErrorMessage("No Note exists");
                                    }
                                }

                                break;

                            // Display a note by number
                            case 2:
                                System.out.print("Enter a note number: ");
                                String num = keyboard.nextLine();
                                int noteNumber = 0;
                                try {
                                    noteNumber = Integer.parseInt(num);
                                } catch (NumberFormatException e) {
                                    NoteDisplayer.displayErrorMessage("Invalid number");
                                    break;
                                }
                                Note n = noteCollection.getNoteByNumber(noteNumber);
                                if (n != null) {
                                    NoteDisplayer.displayNote(n);
                                } else {
                                    NoteDisplayer.displayErrorMessage("No Note exists");
                                }
                                
                                break;

                            // Display a note by name
                            case 3:
                                System.out.print("Enter a note name: ");
                                String note_name = keyboard.nextLine();
                                for (Note noteByName : noteCollection.getNoteByName(note_name)){
                                    if (noteByName != null) {
                                        NoteDisplayer.displayNote(noteByName);
                                    } else {
                                        NoteDisplayer.displayErrorMessage("No Note exists");
                                    }
                                }
                                // TBD in part 2
                                break;
                            
                            
                            // Sort by name
                            case 4:
                                noteCollection.sortByName();
                                break;
                            
                            // Sort by number
                            case 5:
                                noteCollection.sortByNumber(noteCollection.getAllNotes(), new NumberSorter());
                                break;

                            case 6:
                                noteCollection.sortBySize(noteCollection.getAllNotes(), new SizeSorter());
                                break;

                            // Quit
                            case 7:
                                System.out.println("Returning to main menu");
                                break;
                        }
                    } while (subchoice != 7);
            }

        } while (choice != 3);
    }
}
