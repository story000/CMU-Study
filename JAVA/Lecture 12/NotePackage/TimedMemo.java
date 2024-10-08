package NotePackage;
/*
 * TimedMemo extends Memo
 * • today: String 
 * • TimedMemo(name, body, from, to): overloaded
constructor. Use java.time.LocalDate.now( ).toString()
to get the current date.
• toString(): override of Memo::toString()
 */

import java.time.LocalDate;

public class TimedMemo extends Memo {
    // instance variables
    private String today;

    // overloaded constructor
    TimedMemo(String name, String body, String from, String to) {
        super(name, body, from, to);
        today = LocalDate.now().toString();
    }

    // get today
    public String getToday() {
        return today;
    }

    // toString()
    @Override
    public String toString() {
        return "Date: " + today + "\n" + super.toString() + "\n";
    }
}