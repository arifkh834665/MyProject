package covarient;



public class StringTest {
	


	public static void main(String[] args) {
	
		StringTest s = new StringTest();
		String s1 = new String("This is String object");
		 
		String s2 = new String("This is String object");
		String s3 ="hi";
		String s4 ="hi";
		
	
		if (s1==s2) {
			System.out.println("string are equal");
			
		}else {
			System.out.println("string are not equal");
			System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));
			System.out.println(s2.getClass().getName() + "@" + Integer.toHexString(s2.hashCode()));
			System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
			System.out.println(System.identityHashCode( s1 ));
			System.out.println(System.identityHashCode( s2 ));
			System.out.println(System.identityHashCode( s3 ));
			System.out.println(System.identityHashCode( s4 ));
			
		}
		

	}

}
