import java.util.Scanner;
public class if2
{
	public static void main(String[]args)
	{
		int num=5;
		Scanner input= new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = input.nextInt();
		if (num1==num)System.out.println("entered number is equal to 5");
		else System.out.println("entered number is not equal to 5 but it is equal to "+num1);
	}
}
