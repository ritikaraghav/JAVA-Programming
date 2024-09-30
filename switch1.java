import java.util.Scanner;
class switch1
{
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        System.out.print("enter the number of current month:");
        int A = number.nextInt();
        switch(A)
        {
            case 1 :System.out.println("Present month is JANUARY!!");
            break;
            case 2 :System.out.println("Present month is FEBRUARY!!");
            break;
            case 3 :System.out.println("Present month is MARCH!!");
            break;
            case 4 :System.out.println("Present month is APRIL!!");
            break;
            case 5 :System.out.println("Present month is MAY!!");
            break;
            case 6 :System.out.println("Present month is JUNE!!");
            break;
            case 7 :System.out.println("Present month is JULY!!");
            break;
            case 8 :System.out.println("Present month is AUGUST!!");
            break;
            case 9 :System.out.println("Present month is SEPTEMBER!!");
            break;
            case 10 :System.out.println("Present month is OCTOBER!!");
            break;
            case 11 :System.out.println("Present month is NOVEMBER!!");
            break;
            case 12 :System.out.println("Present month is DECEMBER!!");
            break;
            default :System.out.println("INVALID :(");
            break;
            
        }
    }
}