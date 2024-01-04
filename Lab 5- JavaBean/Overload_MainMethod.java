package zpracticals.lab5;

//Write a program to show if main method can be overloaded or not.

public class Overload_MainMethod {

	public static void main(String[] args) {
		
	        System.out.println("This is the main method.");
	        
	        Overload_MainMethod o=new Overload_MainMethod();
	    	o.main();
	    	o.main(5);      
	} 
	
	public static void main() {
        System.out.println("Overloading main method with no parameter");
        
    }
	
	public static void main(int num) {
        System.out.println("Overloading main method with int parameter: " + num);
    }
}

/*
-->The standard main method signature that Java expects when you run a program is
	public static void main(String[] args){}
	ONLY This method recognized as the entry point of the program when you run it from the command line or an IDE.
	
-->Yes, we can overload main method but it's worth noting that you can overload the main method by creating 
   additional methods with the same name (main) but with different parameter lists. 
	 
-->These overloaded methods are just like any other methods except main method in your program. It's just a another 
	method with 'main' name. It doesn't work like standard entry level main method, therefore there is no use of 
	overloading main method.
 */
