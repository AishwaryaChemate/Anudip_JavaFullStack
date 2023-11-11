//Create a method which will calculate the area of circle. Take the radius from user.
// 3.14 * r *r
package practicals;
import java.util.*;

public class AreaofCircle {
	float r;
	float  area;
	
	public float area() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		r=sc.nextFloat();
		
		area=(3.14f*r*r);
		
		System.out.println("Area of Circle= "+area);
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaofCircle a=new AreaofCircle();
		a.area();
	}

}
