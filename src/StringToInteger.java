
public class StringToInteger {
	public static void main(String args[])
	{
		String str = "1234";
	 int decimalExample = Integer.parseInt(null);
     int signedPositiveExample = Integer.parseInt("+20");
     int signedNegativeExample = Integer.parseInt("-20");
     int radixExample = Integer.parseInt("20",16);
     int stringExample = Integer.parseInt("geeks",29);

     // Uncomment the following code to check
     // NumberFormatException

     //   String invalidArguments = "";
     //   int emptyString = Integer.parseInt(invalidArguments);
     //   int outOfRangeOfInteger = Integer.parseInt("geeksforgeeks",29);
     //   int domainOfNumberSystem = Integer.parseInt("geeks",28);
     System.out.println(Integer.valueOf(str));
     System.out.println(decimalExample);
     System.out.println(signedPositiveExample);
     System.out.println(signedNegativeExample);
     System.out.println(radixExample);
     System.out.println(stringExample);
}
}
