package covarient;

public class DrawTree {

	public static void main(String args[]) {

		int row = 5;
		int i, j;
		
		for(i=1;i<row;i++) {
			for(j=i;j<=row;j++) {
				System.out.print("  ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}

			
			  for(j=1;j<i;j++) { System.out.print("* "); }
			 
		
			System.out.println();
		}
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(j=i;j<=row;j++) {
				System.out.print("* ");
			}

			
			  for(j=i;j<row;j++) { System.out.print("* "); }
			 
		
			System.out.println();
		}
	}
	}