package com.CI;

public class Triangle {
    private int age;
    private String country;
    
    public Triangle(String country, int age, String name)
    {
        this.age=age;
        this.country=country;
        System.out.println("1st called");
    }
    
    public Triangle(String country, int age)
    {
        this.age=age;
        this.country=country;
        System.out.println("1st called");
    }
    
    public Triangle(int age, String country)
    {
       
        this.age=age;
        this.country=country;
        System.out.println("2nd called");
    }
    
    public String toString() {
    	return age + " years old, living in " + country;
    }
}