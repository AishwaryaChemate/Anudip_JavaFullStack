package zpracticals.lab5;

/*Create a Trainer class having instance variables:- trainerId, trainerName, subject, officeLocation.
Make getter setters in this class.
*/

class Trainer {
	
	//Below we create instance variables
	int trainerId;
	String trainerName;
	String subject;
	String officeLocation;

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public void display() {
		System.out.println("*********Trainers Info*********");
		System.out.println("Trainer's Name: "+trainerName);
		System.out.println("Trainer's ID: "+trainerId);
		System.out.println("Specialize subject: "+subject);
		System.out.println("Office Location: "+officeLocation);
	}
	
}
public class TrainerTest {

	public static void main(String[] args) {
		
		Trainer t1=new Trainer();
		t1.setTrainerName("Shital Ma'am");
		t1.setTrainerId(246745);
		t1.setSubject("DBMS");
		t1.setOfficeLocation("Kothrud");
		
		t1.display();  //Displaying info about trainer1
		
		Trainer t2=new Trainer();
		t2.setTrainerName("Debina Raut");
		String name=t2.getTrainerName();
		System.out.println("\n****** Partial Trainer Info*******");
		System.out.println("Name of trainer : "+name);
	}
}
