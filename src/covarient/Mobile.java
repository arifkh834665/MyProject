package covarient;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Brand Name");
		String className=sc.nextLine();
		String clas="covarient."+className;
		// get the Class instance using forName method
	     Class c1 = Class.forName(clas);
	     MobileFactory m=(MobileFactory) c1.newInstance();
	    System.out.println(c1); 
	    System.out.println(m);
	    m.calling();
	    m.cameraClick();
	    m.connectWifi();
	    
	    System.out.println(m instanceof Samsung);
	    if (m instanceof Samsung) {
	    	
	    	((Samsung) m).samsungPay();
	    }
	   
	        
		

	}

}
