//Write a program to take a number from user. Check if the number is positive or negative.

package practicals;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println(num+" is negative number.");
		}
		else {
			System.out.println(num+" is positive number.");
		}

	}

}
