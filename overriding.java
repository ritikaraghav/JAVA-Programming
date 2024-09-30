 class engineering 
{
	void branch()
	{
		System.out.println("branch");
	}
	void fee()
	{
		System.out.println("the fee for the diploma engineering in AMU");
	}
}


class computer extends engineering
{
   void branch()
   {
   	System.out.println("this is computer branch!!");
   }

   void fee()
   {
   	System.out.println("the fee for computer branch is Rs.18000.");
   }
}

class IT extends engineering
{
   void branch()
   {
   	System.out.println("this is IT branch!!");
   }

   void fee()
   {
   	System.out.println("the fee for IT branch is Rs.17000.");
   }
}


class electronics extends engineering
{
   void branch()
   {
   	System.out.println("this is electronics branch!!");
   }

   void fee()
   {
   	System.out.println("the fee for electronics branch is Rs.16500.");
   }
}


class communication extends engineering
{
   void branch()
   {
   	System.out.println("this is communication branch!!");
   }

   void fee()
   {
   	System.out.println("the fee for communication branch is Rs.16000.");
   }
}


class overriding
{
   public static void main(String[]args)
   {
   	 engineering a=new engineering();
     a.branch();
     a.fee();

   	 a = new computer();
   	 a.branch();
   	 a.fee();

   	  a = new IT();
   	 a.branch();
   	 a.fee();

   	  a = new electronics();
   	 a.branch();
   	 a.fee();

   	  a = new communication();
   	 a.branch();
   	 a.fee();
   }
}