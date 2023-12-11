// prgm to ask the user a number and to print if it's positive or negative 

import java.util.Scanner;

public class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = reader.nextInt();
		if(number>0)
		{
			System.out.println("The number is positive !");
		}
		else if(number<0)     //for multiple conditions 
		{
			System.out.println("The number is negative !");
		}
		else
		{
			System.out.println("The number is neither positive nor negative.");
		}
	}
}

