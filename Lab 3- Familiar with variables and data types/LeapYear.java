/*Write a program to find whether a given year is a leap year or not.
Leap year--> exactly divisible by 4 except for century year.
*/
package practicals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any year: ");
		int yr=sc.nextInt();
		
		if(yr%4==0) {
			
			if(yr%100==0) {
				
				if(yr%400==0) {
					
					System.out.println("This is a leap year!!!");
				}
				else {
					
					System.out.println("This is not a leap year!!!");
				}
			}
			else {
				System.out.println("This is leap year!!!");
			}
		}
		else {
			
			System.out.println("This is not a leap year!!!");
		}
	}

}
