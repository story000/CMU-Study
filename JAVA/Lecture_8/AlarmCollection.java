import java.util.ArrayList;

public class AlarmCollection {
    private ArrayList<Alarm> alarms;

    public AlarmCollection() {
        alarms = new ArrayList<Alarm>();
    }

    public void add(Alarm alarm) {
        alarms.add(alarm);
    }

    public void display() {
        for (Alarm alarm : alarms) {
            System.out.println(alarm.toString());
        }
    }
}
