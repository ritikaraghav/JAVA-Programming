import java.util.*;
class langvector
{
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
    	Vector<String> list = new Vector <String> ();
    	int length = 5,i=0;
    	String arr[]= new String[10];
    	System.out.println("Enter the known programming languages :");
    	//for(int i=0;i<6;i++)
    	while(i<length)
    	{
    		arr[i]=input.nextLine();
    		i++;
    	}

    	for(i=0;i<length;i++)
    	{
    		list.addElement(arr[i]);
    	}

        System.out.println("the data entered in the Vector:");
        System.out.println(list);
         System.out.println(""); 
        System.out.println("the size of Vector is = "+list.size());
         System.out.println(""); 
        System.out.println("the data entered at location 3 in the Vector:" +list.elementAt(3));
        
        System.out.println("adding more data in the Vector");
        list.addElement("Ritika");
        System.out.println(list);
         System.out.println(""); 
        System.out.println("making a array of recently made vector by copying");
        String listarray[] = new String[list.size()];
        list.copyInto(listarray);
         System.out.println("the array of the vector");
        for(i=0;i<length;i++)
    	{
    		 System.out.println(listarray[i]);
    	}
    	 System.out.println(""); 
        System.out.println("removing  the Vector"); 
        list.removeElementAt(5);
        
         System.out.println("after removing the last element from the vector list");
          System.out.println(list);
    }
}