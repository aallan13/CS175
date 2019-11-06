package Hw3;

import java.util.Scanner;

public class E511 {
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        final int BOIL_TEMPERATURE_AT_CELSIUS = 100;
        final int SOLID_TEMPERATURE_AT_CELSIUS = 0;
        final int BOIL_TEMPERATURE_AT_FAHRENHEIT = 212;
        final int SOLID_TEMPERATURE_AT_FAHRENHEIT = 32;
        
        System.out.println("Please enter temperature: ");
        int temperature = in.nextInt();
        
        System.out.println("Please enter C for Celsius or F for Fahrenheit: ");
        char letter = in.next().toUpperCase().charAt(0);

        if (letter == 'C') {
            if (temperature < 0) {
                System.out.println("Solid");
            }
            else if (temperature >= SOLID_TEMPERATURE_AT_CELSIUS
                    && temperature <= BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Liquid");
            }
            else if (temperature > BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Gaseous");
            }
        }
        else if (letter == 'F') {
            if (temperature <= SOLID_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Solid");
            }
            else if (temperature > SOLID_TEMPERATURE_AT_FAHRENHEIT
                    && temperature < BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Liquid");
            }
            else if (temperature >= BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Gaseous");
            }
        }

        
    }

}
