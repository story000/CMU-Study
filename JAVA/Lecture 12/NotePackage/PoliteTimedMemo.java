package NotePackage;

public class PoliteTimedMemo extends TimedMemo {
    // instance variables
    private static final String DEFAULT_GREETING = "Dear";
    private static final String DEFAULT_CLOSING = "Yours truly,";

    public static class Buidler {
        private String name;
        private String body;
        private String from;
        private String to;

        public Buidler() {
        }

        public Buidler name(String name) {
            this.name = name;
            return this;
        }

        public Buidler body(String body) {
            this.body = body;
            return this;
        }

        public Buidler from(String from) {
            this.from = from;
            return this;
        }

        public Buidler to(String to) {
            this.to = to;
            return this;
        }

        public PoliteTimedMemo build() {
            return new PoliteTimedMemo(name, body, from, to);
        }
    }
    
    // - add a private PoliteTimedMemo constructor taking a Builder as a parameter; it should set this's fields base on the parameters fields. In addition, increment noteCount and set noteNumber to it.
    private PoliteTimedMemo(Buidler buidler) {
        super(buidler.name, buidler.body, buidler.from, buidler.to);
    }

    // package-private constructor
    PoliteTimedMemo(String name, String body, String from, String to) {
        super(name, body, from, to);
    }

    // toString()
    @Override
    public String toString() {
        return "Date: " + getToday() + "\n" + "Name: " + getName() + "\n" + DEFAULT_GREETING + " " + getTo() + ":\n" + getBody() + "\n" + DEFAULT_CLOSING + "\n" + getFrom() + "\n"  + "Note#: " + getNoteNumber() + "\n" + FOOTER + "\n";
    }
}
