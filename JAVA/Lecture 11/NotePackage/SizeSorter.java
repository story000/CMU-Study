package NotePackage;

import java.util.Comparator;

public class SizeSorter implements Comparator<Note> {
    @Override
    public int compare(Note note1, Note note2) {
        return Integer.compare(note1.toString().length(), note2.toString().length());
    }
}
