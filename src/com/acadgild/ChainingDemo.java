package com.acadgild;

public class ChainingDemo {
	  
	   public ChainingDemo(){
	         System.out.println("Default constructor");
	   }
	   public ChainingDemo(String str){
	         this();
	    	 System.out.println("Parametrized constructor with single param");
	   }
	   public ChainingDemo(String str, int num){
	        
	    	 this("Hello"); 
	    	 System.out.println("Parametrized constructor with double args");
	   }
	   public ChainingDemo(int num1, int num2, int num3){
	   	
	        this("Hello", 2);
	        System.out.println("Parametrized constructor with three args");
	   }
	   public static void main(String args[]){
	       
	        ChainingDemo obj = new ChainingDemo(5,5,15);
	   }
	}