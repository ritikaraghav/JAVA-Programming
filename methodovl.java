class methodovl{
	static int add(int a,int b){return a+b;}
	static double add(double a,double b,int c){return a+b+c;}
    public static void main(String args[]){
    	System.out.println(methodovl.add(1,2));
    	System.out.println(methodovl.add(1,2,3));
    }
}
