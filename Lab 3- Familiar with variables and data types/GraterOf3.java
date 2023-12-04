//Write a program to take three numbers from user. Check which number is the greatest of the three.

package practicals;

import java.util.Scanner;

public class GraterOf3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number: ");
		int l=sc.nextInt();
		
		System.out.print("Enter Second number: ");
		int m=sc.nextInt();
		
		System.out.print("Enter Third number: ");
		int n=sc.nextInt();
		
		if(l>m) {
			
			if(l>n) {
				System.out.println(l+" is the greatest number.");
			}
			else {
				System.out.println(n+" is the greatest number.");
			}
		}
		else {
			if(m>n) {
				System.out.println(m+" is the greatest number.");
			}
			else {
				System.out.println(n+" is the greatest number.");
			}
		}

	}

}
