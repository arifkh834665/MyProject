package method;
// This is method overloading using argument change
public class MethodOverloading {

	int add(int a,int b) {
		
		return  a+b;
	}
	
	int add(int a,int b,int c) {
		
		return  a+b+c;
	}	
	
	public static void main(String[] args) {
		MethodOverloading m =new MethodOverloading();
		System.out.println(m.add(30, 50));
		System.out.println(m.add(100, 200, 300));
		

	}

}
