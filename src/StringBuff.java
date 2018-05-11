

import java.io.*;
public	class StringBuff
{
	public static void main (String[] args)
	{
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = new String("Ram");
		String s4 = new String("Ram");
		String s5 = "Shyam";
		String nulls1 = null;
		String nulls2 = null;

		System.out.println(" Comparing strings with equals:");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));

		System.out.println(" Comparing strings with ==:");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);

		System.out.println(" Comparing strings with compareto:");
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s5));


		String x = "Geeks";
		System.out.println(x.toString());
		System.out.println(x.hashCode());
		String x1 = "Geeks";
		String x2 = new String("Geeks");

		if (x.equals(x2)){
			System.out.println("Geeks Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		//		
		//		String str = new String("very");
		//		str = "good";   
		//		String str1 = new String("very");
		//		String str2 = "very";
		//		if (str==str1){
		//			System.out.println("Equal");
		//		}
		//		else if (str2==str1){
		//			System.out.println(" new Not Equal");
		//		}
		//		

		//		StringBuffer s=new StringBuffer("GeeksforGeeks");
		//		s.replace(5,8,"are");
		//		System.out.println(s.length());
		//		System.out.println(s.capacity());
		//		System.out.println(s); //returns GeeksareGeeks
	}
}