import java.util.*;
public class SimpleInterest
{
	public static void main(String args[])
	{
		Interest interest=new Interest();
		interest.input_values();
		interest.show_interest();	

	}
}

class Interest
{
	double amount,rate,time,interest;
         public void input_values()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Amount: ");
		amount = reader.nextDouble();
		System.out.println("Interest: ");
		rate = reader.nextDouble();
		System.out.println("Time: ");
		time = reader.nextDouble(); 
		compute_interest();           
	}

	public double compute_interest()
	{
		return (amount*rate*time)/100;
	}
	
	public void show_interest()
	{
		System.out.println("Principal amount: "+amount);
		System.out.println("Interest rate: "+rate);
		System.out.println("Time: "+time);
		System.out.println("Simple Interest: "+interest);
		System.out.println("Total Amount: "+(amount+interest));
	}
}