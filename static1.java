class Student
{
	int roll_no;
	String name;
	static String college = " IIT ";

	Student(int r,String n)
	{
       roll_no = r;
       name = n;
	}
	
	void display()
	{
		System.out.println(roll_no+" "+name+" "+college);
	}
}



public class static1
{
   public static void main(String args[])
   {
   	  Student S1 = new Student(1,"ritika");
   	  Student S2 = new Student(2,"raghav");
   	  S1.display();
   	  S2.display();
   }
}
