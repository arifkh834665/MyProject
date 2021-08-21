package method;
//Super example for super is used to invoke parent class constructor.
class Human{
	Human(){
		System.out.println("Parent class constructor invoke");
	}
}

class Men extends Human{
	Men(){
		super();
		System.out.println("Child class constructor invoked");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Men m =new Men();
		
	}

}
