//Write a program to call static variable from some other class.

package practicals;

class Var{
    static int b=68;
}
public class StaticVar {
    
	public static void main(String[] args) {
		
		System.out.println("static variable is: "+Var.b);  //without creating object
		
		Var v=new Var();
		System.out.println("static variable is: "+v.b);   //with creating object
	}

}
