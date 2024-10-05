public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
sb.append("dog");
sb.append(" cat");
sb.insert(3, " hates"); // index 3, not word 3
System.out.println(sb.toString());
// Prints: dog hates cat
sb.reverse();
System.out.println(sb.toString());
    }
}
