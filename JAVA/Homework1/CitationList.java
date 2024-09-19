import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// CitationList Clasee

////////////////////////////////////////
// Data members:
// ArrayList<Citation> listOfCitations: List of citations
// int citationCounter: Counter for the number of citations, unique
// String title: Title of the police
// String authority: Authority of the police
////////////////////////////////////////

public class CitationList {
    private ArrayList<Citation> listOfCitations;
    private int citationCounter;
    private String title;
    private String authority;

    // Default Constructor
    public CitationList() {
        this.title = "Undefined";
        this.authority = "Undefined";
        this.listOfCitations = new ArrayList<>();
        this.citationCounter = 0;
    }

    // overloaded Constructor
    public CitationList(String title, String authority) {
        this.title = title;
        this.authority = authority;
        this.listOfCitations = new ArrayList<>();
        this.citationCounter = 0;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public ArrayList<Citation> getListOfCitations() {
        return listOfCitations;
    }

    // readCitationFile Method
    // Read the file and store the information in the listOfCitations
    public void readCitationFile(String filename) {
        System.out.println("Reading file: " + filename);
        File file = new File(filename);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch(FileNotFoundException e) {}


        while(fileScanner != null && fileScanner.hasNextLine()) {
            String[] values = fileScanner.nextLine().split(",");
            int number = Integer.parseInt(values[0]);
            String typeOfOffense = values[1];
            String description = values[2];
            String date = values[3];
            String firstName = values[4];
            String lastName = values[5];
            String address = values[6];
            String phoneNumber = values[7];

            // Create a new Person & Cication object
            Person person = new Person(firstName, lastName, address, phoneNumber);
            Citation citation = new Citation(number, typeOfOffense, description, date, person);
            listOfCitations.add(citation);

            // Update the citationCounter, always keep the largest number(unique)
            if (number > citationCounter) {
                citationCounter = number;
            }
        }
        fileScanner.close();
    }

    // writeCitationFile Method
    // Write the information in the listOfCitations to a file
    public void writeCitationFile(String filename) {
        System.out.println("Writing file: " + filename);
        File file = new File(filename);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
        } catch(FileNotFoundException e) {}

        for (Citation citation : listOfCitations) {
            writer.println(citation.getNumber() + "," + citation.getTypeOfOffense() + "," + citation.getDescription() + "," + citation.getDate() + "," + citation.getPerson().getFirstName() + "," + citation.getPerson().getLastName() + "," + citation.getPerson().getAddress() + "," + citation.getPerson().getPhoneNumber());
        }
        writer.close();
    }


    public String toString(ArrayList<Integer> selectedArrayList, boolean if_person) {
        StringBuilder sb = new StringBuilder();
        sb.append("Result:\n");
        sb.append("---------------------------------\n");
        sb.append("Citation List\n").append(title).append(" ").append(authority).append("\n\n");

        for (int i = 0; i < selectedArrayList.size(); i++) {
            Citation citation = listOfCitations.get(selectedArrayList.get(i));
            sb.append(citation.toString());
            if (if_person) {
                sb.append(citation.getPerson().toString());
            }
            sb.append("\n");
        }
        sb.append("---------------------------------\n");
        return sb.toString();
    }

    public void displayCitationsAll() {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < listOfCitations.size(); i++) {
            list.add(i);
        }

        System.out.println(toString(list, false));
    }

    // displayCitationsType Method
    // Display the citations that match the type of offense
    public void displayCitationsType(String typeOfOffense) {

        // Use an array to store the citations position 
        ArrayList<Integer> citationsByType = new ArrayList<>();
        for (int i = 0; i < listOfCitations.size(); i++) {
            if (listOfCitations.get(i).getTypeOfOffense().equals(typeOfOffense)) {
                citationsByType.add(i);
            }
        }
        
        System.out.println(toString(citationsByType, false));
    }

    // displayCitationsID Method
    // Display the citations that match the ID
    public void displayCitationsID(int number) {
        ArrayList<Integer> citationsByID = new ArrayList<>();
        for (int i = 0; i < listOfCitations.size(); i++) {
            if (listOfCitations.get(i).getNumber() == number) {
                citationsByID.add(i);
            }
        }
        
        System.out.println(toString(citationsByID, true));
    }

    // displayCitationsLastName Method
    // Display the citations that match the last name
    public void displayCitationsLastName(String lastName){
        ArrayList<Integer> citationsByLastName = new ArrayList<>();
        for (int i = 0; i < listOfCitations.size(); i++) {
            if (listOfCitations.get(i).getPerson().getLastName().equals(lastName)) {
                citationsByLastName.add(i);
            }
        }

        System.out.println(toString(citationsByLastName, true));
    }

    // newCitation Method
    // Create a new citation
    public void newCitation(Scanner scanner) {
        System.out.println("Lets create a new citation!");
        citationCounter++;
        int number = citationCounter;
        
        scanner.nextLine();
        System.out.print("Enter the type of offense: ");
        String typeOfOffense = scanner.nextLine();
        System.out.print("Enter the description: ");
        String description = scanner.nextLine();
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        Person person = new Person(firstName, lastName, address, phoneNumber);
        Citation citation = new Citation(number, typeOfOffense, description,  date, person);

        listOfCitations.add(citation);

        System.out.println("\nCitation created!");
        System.out.println(citation.toCSV() + "\n");
    }


}
