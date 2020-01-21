package factorialspackage;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Type in a integer that is 2 or larger than 2 and press Enter: ");
			int integer = input.nextInt();
			if (integer < 2) // use input.hasNextInt() in an expression
			{
				System.out.print("WRONG!  Please enter an integer or retake math class.");
				input.close();
				return; // exit the program immediately
			}
	
			for (; integer<100; integer = integer * 2)
		      {
		         System.out.print(integer + " "); // print on same line with a blank space
		      } 

	}

}
