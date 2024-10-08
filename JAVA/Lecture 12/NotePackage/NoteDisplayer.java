package NotePackage;

public class NoteDisplayer {
    public static void displayNote(Note note) {
        System.out.println(note.toString());
    }

    public static void displayNoteFancy(Note note) {
        System.out.println("********************************");
        System.out.printf("* Number : %-19d *\n", note.getNoteNumber());
        System.out.printf("* Name   : %-19s *\n", note.getName());
        System.out.printf("* From   : %-19s *\n", note.getFrom());
        System.out.printf("* To     : %-19s *\n", note.getTo());
        System.out.println("********************************");
        if (note instanceof TimedMemo) {
            System.out.printf("* Date   : %-19s *\n", ((TimedMemo) note).getToday());
        }
        System.out.println("*");
        System.out.println("* Body:");
        System.out.println(note.getBody());
    }

    public static void displayErrorMessage(String errorMessage){
        System.out.println("Error: " + errorMessage);
    }
}
