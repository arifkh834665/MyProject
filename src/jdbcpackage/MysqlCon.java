package jdbcpackage;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//here sonoo is database name, root is username and password  
			/*
			 * Statement stmt1 = con1.createStatement(); ResultSet rs =
			 * stmt1.executeQuery("select * from student"); while (rs.next())
			 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
			 * rs.getString(3));
			 */
			
			/*
			 * PreparedStatement
			 * stmt1=con1.prepareStatement("insert into student values(?,?,?)");
			 * stmt1.setInt(1,102);//1 specifies the first parameter in the query
			 * stmt1.setString(2,"Ratan1"); stmt1.setString(3,"31");
			 * 
			 * int i=stmt1.executeUpdate(); System.out.println(i+" records inserted");
			 * PreparedStatement
			 * stmt2=con1.prepareStatement("update student set name=? where id=?");
			 * stmt2.setString(1,"Asma");//1 specifies the first parameter in the query i.e.
			 * name stmt2.setInt(2,101); int j=stmt2.executeUpdate();
			 * System.out.println(j+" records inserted");
			 */
			  
			PreparedStatement stmt3=con1.prepareStatement("select * from student");  
			ResultSet rs=stmt3.executeQuery();  
			while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
			}  
			
			con1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}