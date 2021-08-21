package method;
// Method Overloading: changing data type of arguments
public class Method1 {
	int addr(int a,int b) {
		return a+b;
		
	}
	
	float  addr(float a,float b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		Method1 m =new Method1();
		System.out.println(m.addr(20, 30));
		System.out.println(m.addr(12,40));
		

	}

}
