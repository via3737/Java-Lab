import java.util.Scanner;

public class FirstnNatural
	{
		public static void main(String args[])
		{
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the total numbers: ");
			int number = reader.nextInt();

			System.out.println("First n natural numbers are : ");
			for (int i = 1; i <= number; i++)
				{
					System.out.println(i);
				}
		}

	}