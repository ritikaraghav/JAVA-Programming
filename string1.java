class string1
{
	public static void main(String args[])
	{
		String S1 = "Computer";
		String S2 = new String("IT");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println("the length of string 1 = "+S1.length());
		System.out.println("the length of string 2 = "+S2.length());
		System.out.println(S1 + S2);
		System.out.println(S1.concat(S2));
		System.out.println(S1.charAt(0));
		System.out.println(S2.compareTo(S1));
		System.out.println(S1.contains("e"));
		System.out.println(S2.indexOf("T"));
		//S2=S1.reverse();
		System.out.println(S1.replace("C","D"));
		System.out.println(S1.toUpperCase());
		System.out.println(S2.toLowerCase());
		System.out.println(S1.trim());
		
		
	}
}