//Write a program to create a calculator using switch statement.

package practicals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First number: ");
		float a=sc.nextFloat();
		System.out.print("Enter Second number: ");
		float b=sc.nextFloat();
		
		System.out.println("*************Calculator***************");
		System.out.println("Please type 'add'for addition, 'sub' for subtraction, 'mul' for multiplication, 'div' for division");
		
		System.out.print("Arithmetic operation you want to perform: ");
		String operator=sc.next();
		
		switch (operator) {
		case "add" : System.out.println("Addition of "+a+" & "+b+" = "+(a+b));
			break;
		
		case "sub" : System.out.println("Subtraction of "+a+" & "+b+" = "+(a-b));
			break;
		
		case "mul" : System.out.println("Multiplication of "+a+" & "+b+" = "+(a*b));
			break;
		
		case "div" : System.out.println("Division of "+a+" & "+b+" = "+(a/b));
			break;

		default: System.out.println("Please enter valid Operation!!!");
			break;
		}
		

	}

}
