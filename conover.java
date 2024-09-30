class conover
{ 
	int rollno;
	String name;
	int age;
	//constructor
	conover(int r,String n)
	{
        rollno=r;
        name = n;
	}
	conover(int r,String n,int a)
	{
		rollno=r;
		name=n;
		age=a;
	}
void display(){System.out.println(rollno + " " + name+" "+age);}
public static void main(String args[])
  {
  	conover s1 = new conover(5,"Ritika");
  	conover s2 = new conover(10,"Imanica",16);
  	s1.display();
  	s2.display();

 }
}