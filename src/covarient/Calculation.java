package covarient;


public class Calculation {
	
	int addValues(int a,int b) {
		  int c=a+b;
		return c;
	}	
	
	int mulValues(int a,int b) {
		  int c=a*b*2;
		return c;
	}	
	
	
	int mulValuesScneario2(int a,int b) {
		  int c=a*b;
		return c;
	}	

		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();

		
		int addvalues =cal.addValues(2,2);
		System.out.println(addvalues);
		
		addvalues =cal.mulValues(5, 5);
		System.out.println(addvalues);
		
		
		addvalues =cal.mulValuesScneario2(5, 5);
		addvalues = addvalues*2;
		System.out.println(addvalues);

	}

}
