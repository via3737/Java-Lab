import java.util.Scanner;

public class Pattern
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Iteration of patterns: ");
		int n = reader.nextInt();
		for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}