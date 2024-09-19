// Lab4
// Your name:
// Your Andrew id:


import java.util.Scanner;

public class IfSwitch {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int feet, inches, new_inches;
        int height;
        String gender;

        System.out.println("Height Comparison");
        System.out.println("You'll be asked for your height as feet and inches");
        System.out.print("Enter the feet part of your height: ");
        feet = scanner.nextInt();
        System.out.print("Enter the inches part of your height: ");
        inches = scanner.nextInt();
        System.out.println("You entered " + feet + " ft " + inches + " inches");

        // Problem 3
        new_inches = feet * 12;
        System.out.println("The feet " + feet + " equals to " + new_inches + " inches");


        // Problem 4
        System.out.print("Enter your gender, M for male and F for female: ");
        gender = scanner.next();
        if (gender.equals("M") && gender.equals("F")) 
            gender = "F";
        
        System.out.println("Your gener is: "+ gender);

        // 6
        if (inches < 21 || inches > 107){
            System.out.print("Inches Error!");
            if (gender.equals("F")) {
                inches = 64;
            }else{
                inches = 69;
            }
        }


        // Problem 5
        if (inches < 64 && gender.equals("F")){
            System.out.println("you're shorter than average");
        } else if (inches >= 64 && gender.equals("F")) {
            System.out.println("you're taller than average.");
        }

        if (inches < 69 && gender.equals("M")){
            System.out.println("you're shorter than average");
        } else if (inches >= 69 && gender.equals("M")) {
            System.out.println("you're taller than average.");
        }

        // 7
        switch (gender) {
            case "F":
                if (inches < 64){
                    System.out.println("you're shorter than average");
                } else if (inches >= 64) {
                    System.out.println("you're taller than average.");
                }break;
            case "M":
                if (inches < 69){
                    System.out.println("you're shorter than average");
                } else if (inches >= 69) {
                    System.out.println("you're taller than average.");
                }break;
            default:
                System.out.println("Gender Type Error");
        }

        //8
        int score;
        double GPA=0.0;
        String grade= null;
        System.out.print("Enter your test score: ");
        score = scanner.nextInt();
        if (score <=100  && score >=90){
            grade = "A";
        } else if (score <90  && score >=80) {
            grade = "B";
        } else if (score <80  && score >=70) {
            grade = "C";
        } else if (score <70  && score >=60) {
            grade = "D";
        } else if (score <60  && score >=0) {
            grade = "F";
        } else {
            System.out.println("Score Error");
        }
        

        switch (grade) {
            case "A": GPA=4.0;break;
            case "B": GPA=3.0;break;
            case "C": GPA=2.0;break;
            case "D": GPA=1.0;break;
            case "F": GPA=0.0;break; 
            default:
                System.out.println("GPA Error");
        }
        System.out.println("Your grade is: "+grade );
        System.out.println("Your GPA is: "+ GPA );




    }
}
