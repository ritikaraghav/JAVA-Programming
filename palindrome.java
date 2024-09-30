import java.util.Scanner;
class palindrome 
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		int number,m,rev=0,rem,i;
		System.out.print("enter a number:");
		number=num.nextInt();
		m=number;
		for(i=0;number!=0;i++)
		{
			rem=number%10;
			number=(number-rem)/10;
			rev=rev*10+rem;
		}
		if (rev==m)System.out.println("the number is palindrome");
		else System.out.println("the number is not palindrome");
	}
}