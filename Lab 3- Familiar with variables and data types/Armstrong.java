//Check if a given number is an armstrong number.

package practicals;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		//to find length of number
		int t1=n, length=0;
		while(t1>0) {
			
			t1=t1/10;
			length=length+1;
		}
		
		int t2=n, arm=0, rem;
		while(t2>0) {
			
			int mul=1;
			rem=t2%10;
			
			for(int i=1; i<=length; i++) {
				
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		
		if(arm==n) {
			System.out.println("Given number is an Armstrong number!!");
		}
		else {
			System.out.println("Given number is not an Armstrong number");
		}
	}

}
