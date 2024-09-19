
// Name: Siyuan Liu
// Date: 2024/09/12
// AndrewID: sliu5

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {

        // Question 6
        Sensor temperature = new Sensor(0.0, 120.0, 68.0, 1.0, "kitchen", "temperature", 1);
        Device extinguisher = new Device("fire extinguisher", "kitchen", 1);
        Room kitchen = new Room(12.0, 15.0, "kitchen", 1);
        Alarm bell = new Alarm("Ding! Ding!", 1);

        System.out.println(temperature.toString());
        System.out.println(extinguisher.toString());
        System.out.println(kitchen.toString());
        System.out.println(bell.toString());

        // Question 7
        System.out.println("Welcome to the kitchen!");
        System.out.println(kitchen.toString());

        // Question 8
        // if they want to enter a new value
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Do you want to enter a new value for the room? (Y/N)");
            String answer = scanner.next();
            if (answer.equals("N")){
                break;
            }

            System.out.println("The current temperature is: " + temperature.getCurrentValue());
            System.out.println("Enter a new temperature: ");
            double newTemperature = scanner.nextDouble();
            temperature.setCurrentValue(newTemperature);

            if (temperature.trip()){
                extinguisher.actuate();
                bell.soundTheAlarm();
                temperature.setCurrentValue(68.0);
            }
        }
    }
}

// (a.) why you decided on this organization,
// I decided on this organization because each class has its own data and methods. Warpping them in their own class makes it easier to manage and more flexible to modify.

// (b.) how the communication in main's loop would occur -
// which object/method would main call
// which object/method would that call, to get all the same work done.

// The communication in the main's loop would occur as follows:
// 1. The loop would first ask the user if they want to enter a new value for the room. If the user enters "Y", the loop would continue. If the user enters "N", the loop would break.
// 2. Then it would call the Scanner object to get the user's input.
// 3. The loop would then call the Sensor object to get the current temperature.
// 4. If the temperature is out of range, the loop would call the Device object to actuate the fire extinguisher.
// 5. Then it would call the Alarm object to sound the alarm.
// 6. Finally, the loop would set the temperature back to the default value.
