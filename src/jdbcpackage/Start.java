package jdbcpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to student management App");
		while(true) {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit Student");
			int c= Integer.parseInt(br.readLine());
			if(c==1) {
				//Add student
				System.out.println("Enter user name:");
				String name = br.readLine();
				System.out.println("Enter user phone:");
				String phone = br.readLine();
				System.out.println("Enter user city:");
				String city = br.readLine();
								Student st =new Student(name,phone,city);
				boolean answer = StudentDao.insertStudentToDB(st);
				
				if (answer) {
				System.out.println("Student is added succesfully");
				}else
				{
					System.out.println("Something went wrong");
				}
				
			}else
			if (c==2) {
				//delete student
				
			}else
			
			if(c==3) {
				//display student
			}else
			if(c==4) {
				//Exit student
				break;
			}else
			{
				
			}
				
		}

		System.out.println("Thank  you for using the Student management app");
		System.out.println("See you Sooon..... Byeee");
	}

}


