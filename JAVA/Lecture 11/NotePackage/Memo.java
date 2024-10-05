package NotePackage;
/*
    Memo extends Note
    • from: String, who wrote the memo
• to: String, who the memo is for
• Memo( ) : default constructor
• Memo(name, body, from, to): overloaded constructor;
call super(name, body)
• toString(): override of abstract method
 */

public class Memo extends Note {
    // instance variables
    private String from;
    private String to;

    // default constructor
    public Memo() {
        super();
    }

    // overloaded constructor
    public Memo(String name, String body, String from, String to) {
        super(name, body);
        this.from = from;
        this.to = to;
    }

    // getFrom()
    public String getFrom() {
        return from;
    }

    // getTo()
    public String getTo() {
        return to;
    }

    // toString()
    @Override
    public String toString() {
        return "From: " + from + "\nTo: " + to + "\n" + super.toString() +  "\n" +FOOTER + "\n";
    }

    // display()
    @Override
    public void display() {
        System.out.println(toString());
    }
}
