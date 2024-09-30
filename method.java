import java.util.Scanner;

class sum
{
	int number,num,sum=0;
	void values(int r)
	{
		number = r;
	}

   void printsum()
   {
   	 while(number!=0)
   	 {
   	 	num = number % 10;
   	    sum=sum+num;
        number=(number-num)/10;
   	 }
   	 System.out.println("sum of digits of number  ="+sum);
   }
}


class method
{
	public static void main (String[]args)
	{
        Scanner input = new Scanner(System.in);
        sum S1 = new sum();
        System.out.println("Enter number");
        int r = input.nextInt();
        S1.values(r);
        S1.printsum();

	}
}