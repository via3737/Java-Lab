import java.util.*;

public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num = reader.nextInt();
		int term1=0;
		int term2=1;
		int temp=0;
		System.out.println("Fibonacci series : ");
		for(int i=1;i<=num;i++)
		{
			System.out.print("\t"+term1);
			temp=term1+term2;
			term1=term2;
			term2=temp;
		}
	}
}