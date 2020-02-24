package databasedemo;
import java.sql.*;

	public class BatchSend {

		public static void main(String[] args)throws Exception {
			
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url="jdbc:mysql://localhost:3306/JDBC";
	String username="root";
	String password="passwordsql";
	Connection con=DriverManager.getConnection(url,username,password);


	PreparedStatement p=null;
	ResultSet rs=null;
	Statement st=con.createStatement();
	ResultSetMetaData rsmd=null;


	try{

	String sql1="create table emp1(emp_id smallint not null primary key,emp_name varchar(30));";
	String sql2="insert into emp(emp_id,emp_name) values('144','serin');";
	String sql3="delete from emp where emp_id=144";
	String sql4="select *from emp where emp_id=? and emp_name=?";
	String sql5="insert into emp values(?,?)";
	String sql6="insert into emp values('3','bhargav')";
	String sql7="insert into emp values('4','Gone')";
	String sql8="insert into emp values('8','Srinivas')";


	long starttime=System.currentTimeMillis();

	st.addBatch(sql6);
	st.addBatch(sql7);
	st.addBatch(sql8);
	st.executeBatch();
	long endtime=System.currentTimeMillis();
	System.out.println("Added to a database as a Batch");
	System.out.println(endtime-starttime);
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		if(rs!=null||p!=null||con!=null){
			st.close();
			con.close();
			System.out.println("Connection closed");
	}

	}


		}

	}

