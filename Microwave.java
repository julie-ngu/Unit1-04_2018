/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program tells the user how long it will take to microwave a sub, 
 *     pizza or soup according to the portions they choose
 *
 ****************************************************************************/

import java.util.Scanner;

public class Microwave {
	
	public static void main(String[] arg) {
		
		double time = 0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Are you heating a sub, a pizza or soup? ");
		String userFood = userInput.nextLine();
		
		if (userFood.equalsIgnoreCase("sub") || userFood.equalsIgnoreCase("pizza") || userFood.equalsIgnoreCase("soup")) {
			System.out.print("How many " + userFood + "s are you heating? ");
			int userPortion = userInput.nextInt();
			
			if (userPortion == 1 && userFood.equalsIgnoreCase("sub")) {
				time  = 1;
				System.out.print("Your " + userPortion + " " + userFood + " will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 1 && userFood.equalsIgnoreCase("pizza")) {
				time  = 0.75;
				System.out.print("Your " + userPortion + " " + userFood + " will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 1 && userFood.equalsIgnoreCase("soup")) {
				time  = 1.75;
				System.out.print("Your " + userPortion + " " + userFood + " will take " + time + " minutes to heat.");
			
			} 
			else if (userPortion == 2 && userFood.equalsIgnoreCase("sub")) {
				time  = 1 * 1.5;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 2 && userFood.equalsIgnoreCase("pizza")) {
				time  = 0.75 * 1.5;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 2 && userFood.equalsIgnoreCase("soup")) {
				time  = 1.75 * 1.5;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			
			} 
			else if (userPortion == 3 && userFood.equalsIgnoreCase("sub")) {
				time  = 1 * 2;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 3 && userFood.equalsIgnoreCase("pizza")) {
				time  = 0.75 * 2;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			} 
			else if (userPortion == 3 && userFood.equalsIgnoreCase("soup")) {
				time  = 1.75 * 2;
				System.out.print("Your " + userPortion + " " + userFood + "s will take " + time + " minutes to heat.");
			}
			
		else {
			System.out.print("Invalid choice.");
			
		}
	}

}
}