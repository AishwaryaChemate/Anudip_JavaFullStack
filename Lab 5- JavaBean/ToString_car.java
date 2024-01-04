package zpracticals.lab5;
/*
 * Create a Car class with instance variables carId, engineType, color, brand. Create toString in this class. 
 * Write the need and use of toString method.
 */

class Car{
	
	//Below we create instance variables
	int carId;
	String engineType;
	String color;
	String brand;
	
	public Car(int carId, String engineType, String color, String brand) {
		
		this.carId=carId;
		this.engineType=engineType;
		this.color=color;
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		return "Car [CarId = " + carId + ", EngineType = " + engineType + ", Color = " + color + ", Brand = " + brand+"]" ;
	}
}

public class ToString_car {

	public static void main(String[] args) {
		
		Car c=new Car(3794, "Four stroke engine", "White", "Honda");
		System.out.println(c);
	}
}
/*
Need and use of toString method:-

1) When you print an object directly using System.out.println(object), java internally calls 'object.toString()'.
   By overriding 'toString' we can provide human readable and understandable output.
   In example:-
	  Car c = new Car();
	  //Here c is the reference variable of the Car object. 
	  //Now We print c.
	  System.out.println(c)
	  
2) You can cutomize the 'toString' method to provide a specific representation of your object.

3) 'toString' method is used to fetch/get all the data in all variables together in desired format.

4) Whenever We print the reference variable of an object toString method is automatically called and 
   We will be able to see all the data stored in the object.

*/
