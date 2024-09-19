// Class Alarm. Data: message – String; id -int. 
// Methods: void soundTheAlarm( ) – displays the message and simulates a 911 call.

public class Alarm {
    private String message;
    private int id;

    // default constructor
    public Alarm(){
        this.message = "";
        this.id = 0;
    }

    // overloaded constructor
    public Alarm(String message, int id) {
        this.message = message;
        this.id = id;
    }

    //getters
    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "message: " + message + "\nid: " + id;
    }

    public void soundTheAlarm() {
        System.out.println(this.message);
        System.out.println("Call 911!");
    }
}