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
}
