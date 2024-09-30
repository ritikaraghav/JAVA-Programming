import java.util.Scanner;
class exc
{
	public static void main(String args[])
	{   
      Scanner input = new Scanner(System.in);
       int a,b,c;
       int d;
       System.out.println("enter a,b and c:");
       a = input.nextInt();
       b = input.nextInt();
       c = input.nextInt();

       try
       {
         d = a / (b-c);
         System.out.println(d);

       }

       catch(Exception ArithmeticException)
       {
          d = a / ((b+1)-c); 
           System.out.println(d);

       }

       finally{
         System.out.println("good bye :)");
         
       }
  }
}