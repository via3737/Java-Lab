import java.util.Scanner;
import java.lang.Math;

public class FloatingDigit
{
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
	    System.out.print("\nEnter 1st number: ");
	    double n1 = reader.nextDouble();
	    
	    System.out.print("\nEnter 2nd number: ");
	    double n2 = reader.nextDouble();
		reader.close();
	    if (Math.abs(n1 - n2) <= 0.001) {
	        System.out.println("Entered both numbers are same.");
	    }
	    else {
	        System.out.println("Entered numbers are different");
	    }
	}
}