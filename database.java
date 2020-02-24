package databasedemo;

import java.sql.*;
public class database {

	public static void main(String[] args) throws Exception {
		String sql1="create table emp(emp_id smallint not null primary key,emp_name varchar(30))";
		String sql2="insert into emp(emp_id,emp_name) values('6','Dharun2')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","passwordsql");
		Statement st =con.createStatement();
		st.executeUpdate(sql2);
		System.out.println("Table Values updated");
       st.close();
       con.close();
	}

}
