import java.util.Scanner;
class if1
{
    public static void main(String args[])
    //checking if the number user entered is even or odd!!  
    {   
        Scanner num=new Scanner (System.in);
        System.out.print("enter a number");
         int a=num.nextInt();
        if (a%2==0)System.out.println("the number you entered is an even number");
        else System.out.println("the number you haave entered is an odd number");
    }
}