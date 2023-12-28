import java.util.*;
class VariableLenArg
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to display the variable lenght Arguments passing ....\n");
		VariableArg va = new VariableArg();
		System.out.print("\nOnly one Arguments ------\n");
		va.print_arguments("Via");
		System.out.print("\nMultiple Arguments ------\n");
		va.print_arguments("Vishnu\n", "Priya\n", "T\n");

	}
}

class VariableArg
{
	void print_arguments(String... str)
	{
		for(String s:str)
			{
				System.out.print(s);
			}
	}
}