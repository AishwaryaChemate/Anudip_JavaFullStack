//Write a program switch for taking a user input for an icecream flavour and print the cost of that icecream.

package practicals;

import java.util.Scanner;

public class FlavourCost {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***********Welcome to Aish's Ice-Cream Parlor***********");
		System.out.println("Choose 1 for Vanilla flavour\nChoose 2 for Mango flavour\nChoose 3 for Chocolate flavour\nChoose 4 for Butterscotch flavour\nChoose 5 for Pista flavour");
		System.out.print("\nChoose flavour you want: ");
		int flavour=sc.nextInt();
		
		switch(flavour) {
		
			case 1: System.out.println("You Choose Vanilla Flavour...\nThe cost is Rs.20");
				break;
			case 2: System.out.println("You Choose Mango Flavour...\nThe cost is Rs.40");
				break;
			case 3: System.out.println("You Choose Chocolate Flavour...\nThe cost is Rs.25");
				break;
			case 4: System.out.println("You Choose Butterscotch Flavour...\nThe cost is Rs.50");
				break;
			case 5: System.out.println("You Choose Pista Flavour...\nThe cost is Rs.30");
				break;
		
			default: System.out.println("Dear customer, Please choose appropriate flavour...");
		}

	}

}
