package NotePackage;
/*
 • noteList: ArrayList<Note>
 • add(Note): adds a Note object to noteList
• getAllNotes(): return the ArrayList containing all the
Notes (of all types)
• getNoteByNumber(int): return the Note with the given
number (or null if not found).
• getNoteByName(String name): return only those Notes
with the given name, or an empty list if not found.
 */

import java.util.ArrayList;

public class NoteCollection {
    // instance variables
    private ArrayList<Note> noteList;

    // Add a static factory method in NoteCollection: Note createNote(type, name, body, from, to), where type is one of the concrete note types.
    public static Note createNote(String type, String name, String body, String from, String to) {
        Note note = null;

        switch (type) {
            case "Memo":
                note = new Memo(name, body, from, to);
                break;
            case "TimedMemo":
                note = new TimedMemo(name, body, from, to);
                break;
            case "PoliteTimedMemo":
                note = new PoliteTimedMemo.Buidler().name(name).body(body).from(from).to(to).build();
                break;
            default:
                break;
        }
        return note;
    }

    // default constructor
    public NoteCollection() {
        noteList = new ArrayList<Note>();
    }

    // add(Note)
    public void add(Note note) {
        noteList.add(note);
    }

    // getAllNotes()
    public ArrayList<Note> getAllNotes() {
        return noteList;
    }

    // getNoteByNumber(int)
    public Note getNoteByNumber(int number) {
        for (Note note : noteList) {
            if (note.getNoteNumber() == number) {
                return note;
            }
        }
        return null;
    }

    // getNoteByName(String)
    public ArrayList<Note> getNoteByName(String name) {
        ArrayList<Note> notes = new ArrayList<Note>();
        for (Note note : noteList) {
            if (note.getName().equals(name)) {
                notes.add(note);
            }
        }
        return notes;
    }

    // sortByName( )
    public void sortByName() {
        noteList.sort((n1, n2) -> n1.compareTo(n2));
    }

    public void sortByNumber(ArrayList<Note> noteList, NumberSorter NS)  {
        noteList.sort((n1, n2) -> NS.compare(n1, n2));
    }

    public void sortBySize(ArrayList<Note> noteList, SizeSorter SS) {
        noteList.sort((n1, n2) -> SS.compare(n1, n2));
    }
}
