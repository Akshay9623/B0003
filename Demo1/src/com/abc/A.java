package com.abc;

public class A {
 double multiplication1( int a , double b){
		 
		 b=6;
		 double result = a * b ;
		 return result ; 
		 }
		 public static void main(String [] args){
			 A a = new A();
		 double x=a.multiplication1(10 , 5.5);
		 System.out.println(x);
		 }
}
