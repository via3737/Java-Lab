import java.util.*;

public class ReverseNum
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = reader.nextInt();
		int numcopy=num;
		int reversenum=0;
		while(num>0)
		{
			reversenum=reversenum*10 + num%10;
			num=num/10;
			//System.out.print(num);
		}
		System.out.print("Reverse num : "+reversenum);
		
	}
}