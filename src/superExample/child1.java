package superExample;

public class child1  extends Super1 {
 String color ="Blue";
 void printColor() {
	 System.out.println(color);
	 System.out.println(super.color);
 }
	public static void main(String[] args) {
	
        child1  c = new child1();
        c.printColor();
	}

}
