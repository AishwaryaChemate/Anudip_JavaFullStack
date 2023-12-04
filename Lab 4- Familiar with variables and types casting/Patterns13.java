package practicals.patternProgram;
/*
 	*
   ***
  *****
 *******
*********
 */
public class Patterns13 {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
            
            for (int j=1; j<=(5-i); j++) {  //Printing spaces
                
            	System.out.print("  ");
            }
            
            for (int j=1; j<=(2*i-1); j++) { //printing *
                
            	System.out.print("* ");
            }

            System.out.println(); 
        }
	}
}
