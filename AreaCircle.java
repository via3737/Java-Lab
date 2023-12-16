import java.util.*;
public class AreaCircle
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double radius=reader.nextDouble();
		double area=3.14*radius*radius;
		System.out.print("Area: "+area);
	}
}