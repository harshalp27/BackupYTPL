
public class OverrideTest {

	int x;
	
	
	    public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

		public static class superclass
	    {
	       static void print()
	        {
	    	   
	            System.out.println("print in superclass.");
	        }
	       
	          static void print(int i)
	        {
	            System.out.println("print in superclass.");
	        }
	    }
	    public static class subclass extends superclass
	    {
	        static void print()
	        {
	            System.out.println("print in subclass.");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	       Employee e = new Employee();
	       e.id=5;
	       Emp e2 = new Emp();
	      e2.salary= 5000;
	    	final  superclass A = new superclass();
	      // A= new subclass();
	        superclass B = new subclass();
	        A.print();
	        B.print();
	    }
	}

