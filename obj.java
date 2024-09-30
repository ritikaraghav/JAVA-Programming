import java.util.Scanner;

class student
{
	String name;
	int roll_no;
	void values(String n , int r)
	{
		name = n;
		roll_no = r;
	}

   void print(){System.out.println(name+ " " + roll_no);}
}


class obj 
{
	public static void main (String[]args)
	{
        Scanner input = new Scanner(System.in);
        student S1 = new student();
        System.out.println("enter students name :");
        String n = input.nextLine();
        System.out.println("Enter roll_no:");
        int r = input.nextInt();
        S1.values(n,r);
        S1.print();

	}
}