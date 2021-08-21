package covarient;

public class ButterFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int i, j;
		
		  for (i = 1; i <= n; i++) { for (j = 1; j <= i; j++) { System.out.print("*");
		  }
		  
		  for (j = i; j <= n; j++)
		  { System.out.print(" "); } 
		  System.out.println(); }
		  
		  for (i = 1; i < n; i++) 
		  { for (j = i; j < n; j++) 
		  { System.out.print("*"); 
		  }
		  
		  for (j = 1; j <= i; j++) 
		  { System.out.print(" "); }
		  System.out.println(); }
		 
		
		  for(i=1;i<=n;i++) { for(j=i;j<=n;j++) { System.out.print(" "); }
		  
		  for(j=1;j<=i;j++) { System.out.print("*"); }
		  
		  System.out.println(); }
		  
		  for(i=1;i<=n;i++) { for(j=1;j<=i;j++) { System.out.print(" "); }
		  
		  for(j=i;j<=n;j++) { System.out.print("*"); }
		  
		  System.out.println(); }
		 
	}

}
