package NotePackage;
/*
 * PoliteTimedMemo extends TimedMemo
 * • DEFAULT_GREETING: "Dear"
• DEFAULT_CLOSING: "Yours truly,"
PoliteTimedMemo(name, body, from, to): constructor
toString(): override of TimedMemo::toString()
 */

public class PoliteTimedMemo extends TimedMemo {
    // instance variables
    private static final String DEFAULT_GREETING = "Dear";
    private static final String DEFAULT_CLOSING = "Yours truly,";

    // constructor
    public PoliteTimedMemo(String name, String body, String from, String to) {
        super(name, body, from, to);
    }

    // toString()
    @Override
    public String toString() {
        return "Date: " + getToday() + "\n" + "Name: " + getName() + "\n" + DEFAULT_GREETING + " " + getTo() + ":\n" + getBody() + "\n" + DEFAULT_CLOSING + "\n" + getFrom() + "\n"  + "Note#: " + getNoteNumber() + "\n" + FOOTER + "\n";
    }
}