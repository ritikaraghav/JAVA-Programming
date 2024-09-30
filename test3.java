import java.util.Scanner;
class calc
{
	int a,b;
	void addition(int a,int b)
	{
       System.out.println("sum of "+a+ " and " +b+" is " +(a+b));
	}
	void sub(int a,int b)
	{
       System.out.println("subtraction of "+a+ " and " +b+" is " +(a-b));
	}
	void multi(int a,int b)
	{
       System.out.println("multiply of "+a+ " and " +b+" is " +(a*b));
	}
	void div(int a,int b)
	{
       System.out.println("division of "+a+ " and " +b+" is " +(a/b));
	}
}

class test3
{
	public static void main(String[]args)
	{
      calc rgs = new calc();
	Scanner input = new Scanner(System.in);
    System.out.println("enter numbers");
    int a=input.nextInt();
    int b=input.nextInt();
    rgs.addition(a,b);
    rgs.sub(a,b);
    rgs.multi(a,b);
    rgs.div(a,b);
	}
}