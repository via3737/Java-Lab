
import java.util.Scanner;

public class SumAvg
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int n1 = reader.nextInt();

		System.out.println("Enter 2nd number: ");
		int n2 = reader.nextInt();

		System.out.println("Enter 3rd number: ");
		int n3 = reader.nextInt();

		System.out.println("Enter 4th number: ");
		int n4 = reader.nextInt();

		System.out.println("Enter 5th number: ");
		int n5 = reader.nextInt();

		int sum = n1 + n2 + n3 + n4 + n5;
		float avg = (n1 + n2 + n3 + n4 + n5)/5;
		System.out.println("Sum of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + sum);
		System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + avg);
	}
}
