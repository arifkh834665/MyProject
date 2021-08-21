package covarient;

public class MobileFactory {
	boolean SIMCard,ExternalMemoryCard;
	String Sim;
	String Sound;
	int InternalMemory;
	String processor;
	String Model;
	String Brand;
	
	
	public void cameraClick() {
		System.out.println("Picture cliked");
		
	}
	
	public void calling() {
		System.out.println("Calling........");
	}
	
	public void msg() {
		System.out.println("msg sent");
	}
	
	public void connectWifi() {
		System.out.println("wifi Connected successfully");
	}
	
}
