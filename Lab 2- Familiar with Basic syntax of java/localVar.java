/*
Write a program to demonstrate local variable.
Print the local variable on console.
*/
package practicals;

public class localVar {
	
	public void display(){
		char grade='A';
		System.out.println("Grade is: "+grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		localVar L=new localVar();
		L.display();
	}

}
