// Citation Class

////////////////////////////////////////
// Data members:
// String typeOfOffense: Offense Type
// String description: Description of the offense
// int number: the key of the citation, unique
// String date: Time of Citation
// Person person: Person who received the citation
////////////////////////////////////////

public class Citation {
    private String typeOfOffense;
    private String description;
    private int number;
    private String date;
    private Person person;

    // Default Constructor
    public Citation() {
        this.number = 0;
        this.typeOfOffense = "Undefined";
        this.description = "Undefined";
        this.date = "Undefined";
        this.person = new Person();
    }

    // Constructor
    public Citation(int number, String typeOfOffense, String description,   String date, Person person) {
        this.typeOfOffense = typeOfOffense;
        this.description = description;
        this.number = number;
        this.date = date;
        this.person = person;
    }

    // Getters and Setters
    public String getTypeOfOffense() {
        return typeOfOffense;
    }

    public void setTypeOfOffense(String typeOfOffense) {
        this.typeOfOffense = typeOfOffense;     
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;    
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number; 
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // toString method
    // Display the citation information
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Citation #").append(number).append("\n");
        sb.append("Type Of Offense: ").append(typeOfOffense).append("\n");
        sb.append("Description: ").append(description).append("\n");
        sb.append("Date: ").append(date).append("\n");
        return sb.toString();
    }

    // toCSV method
    // Convert the citation information to CSV format
    public String toCSV() {
        return number + "," + typeOfOffense + "," + description + "," + date + "," + person.toCSV();
    }
}