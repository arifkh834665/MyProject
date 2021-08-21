package method;
//Another example of super is used to invoke parent class constructor.
//this time invoked implicitly when super is provide by compiler.
class Animal{
	Animal(){
		System.out.println("Animal constructor invoked");
	}
}

class Dog extends Animal{
	
	Dog(){
		System.out.println("Dog object created");
	}
	void work() {
		System.out.println("Hi");
	}
}
public class SuperConstructor1 {


	
	public static void main(String[] args) {
		/*
		 * SuperConstructor1 s = new SuperConstructor1(); Dog d =s.new Dog(); d.work();
		 */
		
		Dog d =new Dog();
		
	}

}
