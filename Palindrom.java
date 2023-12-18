import java.util.*;
public class Palindrom
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=reader.nextInt();
		int numcopy=num;
		int reversenum=0;
		while(num >0)
		{
			reversenum=reversenum*10 + num%10;
			num=num/10;
		}
		if(reversenum == numcopy)
		{
			System.out.println("Is a Palindrome !");
		}
		else
		{
			System.out.println("Is not a palindrome .");
		}
	}
}