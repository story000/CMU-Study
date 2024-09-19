// Lab3
// Your name: Siyuan Liu
// Your Andrew id: sliu5

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// class IOSTuff
// Tests some issues of input and output

public class IOStuff {
    private static Scanner input_scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName, lastName;
        String id;
        int age;
        double salary;
        String ageString, salaryString;
        String category = null;
    
        /*
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter id: ");
        id = scanner.nextLine();

        try {
            System.out.print("Enter age: ");
            ageString = scanner.nextLine();
            age = Integer.parseInt(ageString);

            System.out.print("Enter salary: ");
            salaryString = scanner.nextLine();
            salary = Double.parseDouble(salaryString);
        }catch (NumberFormatException e ) {
            System.out.println(e);
            age = 0;
            salary = 0.0;
        }
        */

        /*
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Age = " + age);
        System.out.println("ID = " + id);
        System.out.println("Salary = " + salary);
        */

        System.out.printf("%12s %12s %12s %12s %12s %12s%n", "First Name", "Last Name", "ID", "Age", "Salary", "Category");
        try{
        File file = new File("employee.csv");
        Scanner file_scanner = new Scanner(file);
        while (file_scanner.hasNextLine()) {
                String line = file_scanner.nextLine();
                String[] data = line.split(",");
                if (Double.parseDouble(data[4]) > 150000 || Double.parseDouble(data[4]) < 0) 
                    category = "Error";
                else if(Double.parseDouble(data[4]) >= 0 && Double.parseDouble(data[4]) < 35000)
                    category = "Low";
                else if(Double.parseDouble(data[4]) >= 35000 && Double.parseDouble(data[4]) < 70000)
                    category = "Medium";
                else
                    category = "High";

                System.out.printf("%12s %12s %12s %12s %12s %12s%n", data[0], data[1], data[2], Integer.parseInt(data[3]), Double.parseDouble(data[4]), category);

        }
        }catch (FileNotFoundException e ) {
            System.out.println( "Wrong File");
        }
        // System.out.printf("%12s %12s %12s %12d %12.2f%n", firstName, lastName, id, age, salary);
        
    }
}
