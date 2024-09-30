import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		int number,sum=0,rev=0,rem,i;
		System.out.print("enter a number:");
		number=num.nextInt();
		for(i=0;number!=0;i++)
		{
			rem=number%10;
			number=(number-rem)/10;
			sum=sum+rem;
		}
		System.out.println(" Sum of the number is " +sum);
	}
}