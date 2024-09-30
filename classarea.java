import java.util.Scanner;
class area
{
	int area;
	int breadth;
	int length;
	//initializing a method for parameters of rectangle
	void setdim(int l,int b)
	{ 
		breadth=b;
		length=l;
	}
	void area()
	{
		area=2*(length+breadth);
		System.out.println("area of ractangle= "+area);
	}
}
class classarea
{
	public static void main(String args[])
	{
		area ar=new area();
		Scanner input=new Scanner(System.in);
		System.out.println("enter length:");
		int l = input.nextInt();
		System.out.println("enter breadth:");
		int b = input.nextInt();
        ar.setdim(l,b);
        ar.area();
	}
}