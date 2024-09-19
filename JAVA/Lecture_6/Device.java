// Class Device. Data: type, location – String; id – int. 
// Methods: void actuate( ). This method prints the formatted data (that is, it prints toString() ) in ALL CAPS.

public class Device {
    private String type;
    private String location;
    private int id;

    // default constructor
    public Device(){
        this.type = "";
        this.location = "";
        this.id = 0;
    }

    // overloaded constructor
    public Device(String type, String location, int id) {
        this.type = type;
        this.location = location;
        this.id = id;
    }

    //getters
    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void actuate() {
        System.out.println(this.toString().toUpperCase());
    }

    @Override
    public String toString() {
        return "type: " + type + "\nlocation: " + location + "\nid: " + id;
    }
}
