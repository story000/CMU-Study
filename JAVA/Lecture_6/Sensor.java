//Sensor. Data: minimum, maximum, currentValue, interval – double; location, type – String; id – int.
//Methods: boolean trip( ). This method returns true if the currentValue is less than minimum or greater than maximum and returns false otherwise

public class Sensor {
    private double minimum;
    private double maximum;
    private double currentValue;
    private double interval;
    private String location;
    private String type;
    private int id;

    // default constructor
    public Sensor(){
        this.minimum = 0;
        this.maximum = 0;
        this.currentValue = 0;
        this.interval = 0;
        this.location = "";
        this.type = "";
        this.id = 0;
    }

    // overloaded constructor
    public Sensor(double minimum, double maximum, double currentValue, double interval, String location, String type, int id) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.currentValue = currentValue;
        this.interval = interval;
        this.location = location;
        this.type = type;
        this.id = id;
    }

    //getters
    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getInterval() {
        return interval;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    //setters
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean trip() {
        return currentValue < minimum || currentValue > maximum;
    }

    @Override
    public String toString() {
        return "minimum: " + minimum + "\nmaximum: " + maximum + "\ncurrentValue: " + currentValue + "\ninterval: " + interval + "\nlocation: " + location + "\ntype: " + type + "\nid: " + id;
    }
}