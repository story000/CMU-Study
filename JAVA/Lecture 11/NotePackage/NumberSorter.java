package NotePackage;

import java.util.Comparator;

public class NumberSorter implements Comparator<Note> {
    @Override
    public int compare(Note note1, Note note2) {
        return Integer.compare(note1.getNoteNumber(), note2.getNoteNumber());
    }
}
