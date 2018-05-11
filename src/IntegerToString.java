
public class IntegerToString {
	public static void main(String args[])
	{
		String a = "1234";
		int b = -1234;
		Integer str1 = Integer.parseInt(a);
		String str2 = Integer.toString(b);
		System.out.println("String str1 = " + str1); 
		System.out.println("String str2 = " + str2);

		String str3 = String.valueOf(1234);
		System.out.println("String str3 = " + str3);
		
		Integer str4 = Integer.valueOf(1234);
		System.out.println("String str4 = " + str4);
	}
}
