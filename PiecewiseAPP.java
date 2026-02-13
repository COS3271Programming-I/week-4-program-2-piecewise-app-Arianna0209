package week4;

import java.util.Scanner;
public class PiecewiseAPP {
	
	// This program inputs x and outputs an f(x) based on the value of x.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		// Declare the variable x:
		Double x;
		Double y;
		
		// Input the number that x represents:
		System.out.print("x = ");
		x = userinput.nextDouble();
		userinput.nextLine();
		
		// Calculate f(x) based on the value of x:
		if (x < 0) {
			y = (x * 3) + 7;}
		else if ((x >= 0) && (x <= 10)) {
			y = (Math.pow(x, 2)) + 8;}
		else {
			y = (Math.pow(x,  3) - (6 *(Math.pow(x, 2))));}

		// Print the result as a decimal if the number is fractional:
		if (Math.round(x) != x) {System.out.format("f(x) = %.2f", y);}
		else {System.out.format("f(x) = %.0f", y);}
	}

}
