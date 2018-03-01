package com.autowireEx;

public class A {

	B b;
	
	A(){
		System.out.println("A is cretaed...!!!");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print(){
		System.out.println("Hello A...!!!");
	}
	
	void display(){  
	    print();  
	    b.print();  
	}  


}

