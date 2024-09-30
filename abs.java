abstract class bank
{
  abstract void finance();
  abstract void loan();
}

class SBI extends bank 
{
   void finance(){System.out.println("finance");}
   void loan(){System.out.println("loan");}
   void data(){System.out.println("data");}
}


class abs
{
	public static void main(String args[])
	{
       SBI obj = new SBI();
       obj.finance();
       obj.data();
       obj.loan();
	}
}