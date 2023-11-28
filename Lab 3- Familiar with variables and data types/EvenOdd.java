//Write a program to take a number from user. Check if the number is even or odd.

package practicals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println(no+" is an even number.");
		}
		else {
			System.out.println(no+" is an odd number.");
		}

	}

}
