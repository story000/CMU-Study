import java.util.Scanner;

public class Lab13Driver {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) throws BadWeekday {
        problem1();

        try {
            problem2();
        } catch (BadWeekday e) {
            System.out.println(e.getMessage());
        }

        problem3();

        try {
            problem4();
        } catch (BadWeekday e) {
            System.out.println(e.getMessage());
        }

        try {
            problem5();
        } catch (BadWeekday e) {
            System.out.println(e.getMessage());
        }

        problem6();
        
    }

    public static void problem1() {
        System.out.println("Problem 1");
        try {
            System.out.println("Enter a weekday: ");
            String weekday = scanner.nextLine();
            if (!BadWeekday.WEEKDAYS.contains(weekday)) {
                throw new BadWeekday();
            } else{
                System.out.println(weekday + "Nice Job!");
            }
        } catch (BadWeekday e) {
            System.out.println("Bad day entered");
        }
    }

    public static void problem2() throws BadWeekday {
        System.out.println("Problem 2");
        System.out.println("Enter a weekday: ");
        String weekday = scanner.nextLine();
        if (!BadWeekday.WEEKDAYS.contains(weekday)) {
            throw new BadWeekday("Bad day entered");
        } else{
            System.out.println("Nice Job!");
        }
    }

    public static void problem3() {
        System.out.println("Problem 3");
        try {
            problem2();
        } catch (BadWeekday e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void problem4() throws BadWeekday {
        System.out.println("Problem 4");
        problem2();
    }

    public static void problem5() throws BadWeekday{
        System.out.println("Problem 5");
        try {
            problem2();
        } catch (BadWeekday e) {
            System.out.println("Caught " +e.getMessage());
            throw e;
        }
    }

    public static void problem6() throws BadWeekday {
        System.out.println("Problem 6");
        problem2();
    }
}
