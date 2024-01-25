class Student
{
	int maxrollno = 100;
}
class SchoolStudent extends Student
{
	int maxrollno = 80;
}
class Collegestudent extends SchoolStudent
{
	int maxrollno = 700;
}
class Universitystudent extends Collegestudent
{
	int maxrollno = 1000;
}

public class DynamicMethodDispatch
{
	public static void main(String args[])
	{
		Student obj1 = new Universitystudent();
		SchoolStudent obj2 = new Collegestudent();
		Student obj3 = new SchoolStudent();

		System.out.println(obj1.maxrollno);
		System.out.println(obj2.maxrollno);
		System.out.println(obj3.maxrollno);
	}
}