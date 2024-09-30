import java.util.*;

class vector1
{
	public static void main(String[]args)
	{
		Vector <Integer> v1 = new Vector <> ();
		Vector  <Integer> v2 = new Vector <> (3);
		Vector  <Integer> v3 = new Vector <> (3,5);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v2.add(100);
		v3.add(100);
		System.out.println(v1);
		System.out.println(v1.capacity() +" "+ v1.size());
	}
}