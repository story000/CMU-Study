import java.util.Scanner;

// Your name: Siyuan Liu
// Your Andrew id: sliu5

// class RelativeHumidity
// Prompts the user for the temperature and dewpoint in Fahrenheit.
// Converts them to Celsius.
// Computes the saturation for each.
// Computes and displays the relative humidity.
public class RelativeHumidity {

	public static void main(String[] args) {

        // Don't change this code
		RelativeHumidity relativeHumidity = new RelativeHumidity();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = scanner.nextDouble();
		System.out.print("Enter the dewpoint in Fahrenheit: ");
		double dewpoint = scanner.nextDouble();
		System.out.println("You entered:");
		System.out.println("temperature: " + temperature);
		System.out.println("dewpoint: " + dewpoint);
		
        // Convert to Celsius
		double Celsius = 5/9D * (temperature-32) ;
		System.out.println("Celsius temperature: " + Celsius);
		
		
        // Compute the saturations sT (temperature) and sD (dewpoint)
        // Your code goes here
		double sT = Math.exp(17.625 * Celsius / (243.04 + Celsius));
		double sD = Math.exp(17.625 * dewpoint / (243.04 + dewpoint));

        
        // Compute the relative humidity
        // Your code goes here
		double rh = 100 * sD / sT ;
		System.out.println("Relative humidity: " + rh);


	}
	
}
