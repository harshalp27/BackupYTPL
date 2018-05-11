import java.util.Arrays;

public class ReverseString {
	
		 public static String sortString(String inputString)
		    {
		        // convert input string to char array
		        char tempArray[] = inputString.toCharArray();
		         
		        // sort tempArray
		        Arrays.sort(tempArray);
		        System.out.println( tempArray);
		         
		        // return new sorted string
		        return new String(tempArray);
		    }
		     
		    // Driver method
		    public static void main(String[] args)
		    {
		        String inputString = "geeks for geeks";
		        String outputString = sortString(inputString);
		         
		        System.out.println("Input String : " + inputString);
		        System.out.println("Output String : " + outputString);
		        
		        byte[] b_arr = {71, 101, 101, 107, 115};
		        String s_byte =new String(b_arr);
		        
		        System.out.println(s_byte);
		    }
	}
//	{
//		String input = "Geeks For hello";
//		char[] hello = input.toCharArray();
//		System.out.println(hello);
//		List<Character> trial1 = new ArrayList<>();
//
//		for (char c: hello)
//			trial1.add(c);
//
//		Collections.reverse(trial1);
//		ListIterator li = trial1.listIterator();
//		while (li.hasNext())
//			System.out.print(li.next());
//	}

