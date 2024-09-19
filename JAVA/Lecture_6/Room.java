// Class Room. Data: length, width– double; name – String; id – int. 
// Methods: double getArea( ). This method computes and returns the room's area.

public class Room {
    private double length;
    private double width;
    private String name;
    private int id;

    // default constructor
    public Room(){
        this.length = 0;
        this.width = 0;
        this.name = "";
        this.id = 0;
    }

    // overloaded constructor
    public Room(double length, double width, String name, int id) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.id = id;
    }

    //getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return length * width;
    }

    // setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "length: " + length + "\nwidth: " + width + "\nname: " + name + "\nid: " + id;
    }
}
