// Person Class

////////////////////////////////////////
// Data members:
// String firstName: First Name
// String lastName: Last Name
// String address: Address
// String phoneNumber: Phone Number
////////////////////////////////////////

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    // Default Constructor
    public Person() {
        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.address = "Undefined";
        this.phoneNumber = "Undefined";
    }

    // Constructor
    public Person(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString method
    // Display the person information
    public String toString() {
        return "Person: " + firstName + " " + lastName + " " + address + " " + phoneNumber + "\n";
    }

    // toCSV method
    // Convert the citation information to CSV format
    public String toCSV() {
        return firstName + "," + lastName + "," + address + "," + phoneNumber;
    }
}
