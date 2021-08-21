package constructorExample;

public class ParameterConst {
	String name;
	int id;
	
	ParameterConst(String na,int a){
		 name=na;
		 id=a;
		System.out.println("object created");
		
	}
	
	ParameterConst(){
		System.out.println("object created");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * new ParameterConst("Arif",12); new ParameterConst("ASMA",30);
		 */
		new ParameterConst();
	}

}
