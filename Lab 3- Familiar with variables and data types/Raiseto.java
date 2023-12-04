//Take two inputs. Eg 3 and 4. Find the value of 3^4 i.e. 3 raised to 4. You cannot use Math.pow() method.

package practicals;

import java.util.Scanner;

public class Raiseto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter a power: ");
		int p=sc.nextInt();
		
		int mul=1;
		for(int i=1; i<=p; i++) {
			
			mul=mul*a;	
		}
		System.out.println("Value of "+a+"^"+p+"= "+mul);
	}

}
