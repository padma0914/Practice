//String concatenation 
//String is a class but not data type but can be used to store String values with in "";
package javabasics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a =100;
	int b=200;
	String a1="Hello";
	String a2="World";

	System.out.println(a+b+a1+a2); //--> 300 Hello world
	
	System.out.println(a1+a2+a+b); //--> Helloworld100200
	
	System.out.println(a1+a+a2+b); // -->Hello100world200
	
	System.out.println(a1+a2+(a+b)); //--> Helloworld300
	
	}

}
