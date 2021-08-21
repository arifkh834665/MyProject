package method;
//This the method oever riding example
//Bike extend clas vahicle and override  run() method
public class Bike extends Vahicle{

	public void run() {
		System.out.println("Bike is running");
	}
	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();

	}

}
