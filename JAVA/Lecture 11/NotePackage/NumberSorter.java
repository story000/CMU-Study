package NotePackage;

public abstract class NumberSorter implements Comparable<Note> {
    private int number;

    public NumberSorter(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static int compare(Note n1, Note n2) {
        return Integer.compare(n1.getNoteNumber(), n2.getNoteNumber());
    }


    
}
