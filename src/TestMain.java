/*
 class Test {
	// filename: Main.jav
	    static int i;
	    int j;
	    static {
	    	
	    	 i = 10;
	 
	        System.out.println("static block 2 called ");
	        
	    }
	    // start of static block 
	    {
	    	System.out.println("initliazer block called ");
	    }
	    {
	    	System.out.println("initliazer block 2 called ");
	    }
	    Test(){
	    	   System.out.println("default constructor block called ");
	    }
	    Test(int i){
	    	   System.out.println("paramter constructor block called ");
	    }
	    static {
	    	
	    	 i = 10;
	 
	        System.out.println("static block called ");
	        
	    }
	    // end of static block 
	}
	 
 public	class TestMain{
	    public static void main(String args[]) {
	 
	        // Although we don't have an object of Test, static block is 
	        // called because i is being accessed in following statement.
	    	Test tm = new Test();
	    	Test tm2 = new Test();
	    	System.out.println(Test.i); 
	    }
	}
*/