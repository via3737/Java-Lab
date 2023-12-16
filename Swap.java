import java.util.*;

public class Swap
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int fn=reader.nextInt();
		System.out.println("Enter second number: ");
		int sn=reader.nextInt();
		reader.close();
		int temp=fn;
		fn=sn;
		sn=temp;
		System.out.print("Swapped number is : "+fn+sn);
	}
}