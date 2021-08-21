package superExample;
//This is example for super can be used to invoke parent class method
//condtion is parent class method is same as child class method(Method Overriding).

class Animal {
	void eat() {
		System.out.println("Animal Eating");
	}
}
	class Dog extends Animal{
		void eat() {
			System.out.println("Dog  Eating");
		}
		
		void barking() { 
			System.out.println("dog barking");
		}
		
		void action() { 
			eat();
			super.eat();
			barking();
		}
		
	}

	

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog  d =new Dog();
		d.action();
		
	}

}
