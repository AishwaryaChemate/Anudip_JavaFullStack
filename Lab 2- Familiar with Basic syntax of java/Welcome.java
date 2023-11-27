/*
Write a program to create method which will ask for the name of the student.
Then the method should return the message 
Hello -------------- . Welcome to this java session.
This message should be printed on console
*/

package practicals;
import java.util.*;
public class Welcome {

	public String message() {
		
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Your name : ");
		name=sc.next();
		
		System.out.println("Hello "+name+". Welcome to this java session.");
		return name;
	}
	public static void main(String[] args) {
		
		Welcome w=new Welcome();
		w.message();	
	}

}
