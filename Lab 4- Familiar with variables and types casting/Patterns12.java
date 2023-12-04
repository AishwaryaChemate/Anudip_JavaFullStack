package practicals.patternProgram;
/*
* * * * *
  *       *
    *       *
      *       *
        * * * * *
 */
public class Patterns12 {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<i; j++) {  //printing spaces of starting
				
				System.out.print("  ");
			}
			
			for(int j=1; j<=5; j++) {
				
				if(i==1||i==5) {
					
					System.out.print("* ");
				}
				else if(i==j) {
					
					System.out.print("*       *"); 
				}
			}
			System.out.println();
		}

	}

}
