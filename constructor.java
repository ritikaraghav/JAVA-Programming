import java.util.Scanner;

class student
{
	String name;
	int roll_no;
	student(){System.out.println("Unknown");}
	
	student(String n , int r)
	{
		name = n;
		roll_no = r;
	}

   void print(){System.out.println(name+ " " + roll_no);}
}


class constructor
{
	public static void main (String[]args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("enter students name :");
        String n = input.nextLine();
        System.out.println("Enter roll_no:");
        int r = input.nextInt();
        student S1 = new student(n,r);
        student S2 = new student();
        S1.print();

	}
}