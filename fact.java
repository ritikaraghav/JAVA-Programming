import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{   
		int i,fact=1;
		Scanner num = new Scanner(System.in);
		System.out.print("enter a Number to get factorial:");
		int n=num.nextInt();
		for (i=n;i!=0;i--)	fact=fact*i;
       System.out.print("the factorial of " +n+ " is " +fact );
	}
}