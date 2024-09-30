import college.*;
import java.util.*;
class collegemain
{
	public static void main(String[]args)
	{
       Scanner enter = new Scanner(System.in);
       System.out.print("enter name:");
       String n = enter.nextLine();
       System.out.print("enter marks:");
       int p = enter.nextInt();
       int m = enter.nextInt();
       int s = enter.nextInt();
       college object = new college(p , m , s);
       object.display();
	}
}