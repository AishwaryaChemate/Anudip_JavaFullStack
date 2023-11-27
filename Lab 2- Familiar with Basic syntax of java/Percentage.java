/*
Write a program to calculate the percentage of a student based on the marks
he or she has recieved out of 500.
Take user input for the total marks recieved by student.
*/

package practicals;
import java.util.Scanner;

public class Percentage {
	
	public void totalmarks() {
		
		int marks;
		float percent;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Total marks out of 500: ");
		marks=sc.nextInt();
		
		percent=(marks/500f)*100;
		
		System.out.println("Percentage = "+percent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage P=new Percentage();
		P.totalmarks();
		
	}

}
