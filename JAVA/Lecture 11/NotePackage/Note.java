package NotePackage;
// Note (abstract) 
/* • name: String, note name
• body: String, the text of the note or
memo
• noteCount: static int, count of the
number of notes created (i.e. number
of times Note constructor is called);
initially 0.
• noteNumber: int
• FOOTER: static String "*****
Powered by Make-A-Note *****"

• Note( ): default constructor
• Note(name, body): overloaded constructor; besides
settting name and body, increment noteCount and set
noteNumber to noteCount's new value.
• getNoteNumber(): returns noteNumber
• toString(): return a formatted String containing the
name, body, and noteNumber
• abstract void display(): display the note
*/

public abstract class Note implements Comparable<Note> {
    // instance variables
    private String name;
    private String body;
    private static int noteCount = 0;
    private int noteNumber;
    public static final String FOOTER = "***** Powered by Make-A-Note *****";

    // default constructor
    public Note() {
        noteCount++;
        noteNumber = noteCount;
    }

    // overloaded constructor
    public Note(String name, String body) {
        this();
        this.name = name;
        this.body = body;
    }

    // getName()
    public String getName() {
        return name;
    }

    // getNoteNumber()
    public int getNoteNumber() {
        return noteNumber;
    }

    // get body
    public String getBody() {
        return body;
    }

    // toString()
    @Override
    public String toString() {
        return "Name: " + name + "\nBody: " + body + "\nNote# " + noteNumber;
    }

    // abstract display()
    public abstract void display();

    // Implement compareTo() method
    @Override
    public int compareTo(Note other) {
        return this.name.compareTo(other.getName());
    }
}


