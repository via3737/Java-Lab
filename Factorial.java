import java.util.*;
public class Factorial 
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= reader.nextInt();
		int fact=1;
		if(num==0)
		{
			System.out.println("Factorial of the number is : "+fact);
		}
		else if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("The factorial is : "+fact);
		}
		else
		{
			System.out.println("Wrong number !");
		}
	}
}