// Name: Siyuan Liu
// AndrewID: sliu5

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Lab7Main {
    // - a File object named myfile, set to null;
    // - a Scanner object named fileScanner, set to null
    // - an ArrayList<YearPop> named data to hold the file data, set to null

    File myfile = null;
    Scanner fileScanner = null;
    ArrayList<YearPop> data = null;

    public boolean openFile(String filename) {
        myfile = new File(filename);
        try {
            fileScanner = new Scanner(myfile);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        return true;
    }

    public YearPop makeData(String line) {
        String[] parts = line.split(",");
        int year = Integer.parseInt(parts[0]);
        double pop = Double.parseDouble(parts[1]);
        return new YearPop(year, pop);
    }

    public void createList() {
        data = new ArrayList<YearPop>();
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            YearPop yp = makeData(line);
            data.add(yp);
        }
    }

    public double findYear(int year) {
        for (YearPop yp : data) {
            if (yp.getYear() == year) {
                return yp.getPop();
            }
        }
        return -1.0;
    }

    public static int computeFibonacci(int first, int second, int n){
        if (n == 0){
            return first;
        }
        if (n == 1){
            return second;
        }
        return computeFibonacci(second, first + second, n - 1);
    }
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Lab7Main lab = new Lab7Main();
        lab.openFile("paPop.csv");
        lab.createList();

        System.out.println("Fibonacci #10 = "+computeFibonacci(0, 1, 7));
        
        while (true) { 
            System.out.print("Year: ");
            int year = key.nextInt();
            double pop = lab.findYear(year);

            if (pop == -1.0) {
                System.out.println("Year not found");
            } else {
                System.out.println("Population density: " + pop);
            }

            System.out.print("Do you want to look up another (use Y or N)?");
            String answer = key.next();
            if (answer.equals("N")) {
                break;
            }
        }

    }
}