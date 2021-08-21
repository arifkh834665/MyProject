package constructorExample;

public class CopyConst {

	String abc;
	int xyz;
	
	CopyConst(String a,int b){
	
		abc=a;
		xyz=b;
	}
	
	CopyConst(CopyConst c){
		
		abc=c.abc;
		xyz=c.xyz;
		
	}
	
	   void display(){System.out.println(xyz+abc);}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConst c1= new CopyConst("ASMA",43);
		CopyConst c2= new CopyConst(c1);
		c1.display();
		c2.display();
	}

}
