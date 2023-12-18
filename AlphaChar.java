import java.util.*;

public class AlphaChar
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter : ");
		char ch = reader.next().charAt(0);
		if((ch >='a' && ch <='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("Alphabet !");
		}
		else
		{
			System.out.print("Not alphabet.");
		}
	}	

}