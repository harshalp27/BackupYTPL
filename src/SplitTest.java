
public class SplitTest {
	 public static void main(String args[])
	    {
	        String str = "geekss@for@geekss";
	        String [] arrOfStr = str.split("s");
	 
	       
	        for (String a : arrOfStr)
	            System.out.println(a);
	        
	      System.out.println("New String");  
	        String str1 = "GeeksforforGeeksfor   ";
	        String [] arrOfStr2 = str1.split("for");
	        System.out.println(arrOfStr2.length);
	        for (String a : arrOfStr2)
	            System.out.println("print " +a);
	    }
}
