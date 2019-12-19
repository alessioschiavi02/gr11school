package alessioTemp;
import java.util.*;

public class alessioTemp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you converting to Celsius or Fahrienheit? (C/F)");
		String unit = input.nextLine();
		
		System.out.println("Please input the temperature");
		double temp = input.nextDouble();
		tempConv(unit, temp);


	}
	
	public static void tempConv(String unit, double temp) {
		
		if (unit.equalsIgnoreCase("f")) {
			double ftemp = (temp*9)/5+32;
			System.out.println(temp + " Degrees Celcius is " + ftemp + " degrees fahrienheit");			System.out.println("Thank you for using my software. Goodbye");

			
		}
		
		else if (unit.equalsIgnoreCase("c")) {
			double ftemp = (temp-32)*5/9;
			System.out.println(temp + " Degrees Fahrienheit is " + ftemp + " degrees celcius");
			
			
		}
		
	}

}
