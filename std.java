package college;

	class std 
	{
		String name ;
		int science;
		int maths;
		int physics ;
        std (int s , int m , int p ,String n)
        {
        	String name = n;
        	int science = s;
        	int maths = m;
        	int physics = p;
        	
        }
       int tm = maths+physics+science;
        void display (){System.out.println("I am "+name+".My total marks in each subject = "+ tm + "and percentage= "+ (tm/100)  );}
	}
