package sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exmp1 {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","chumma");
	Statement st=con.createStatement();
	//String sql="create table emp(id int,name varchar(25),sal int)";
	//String sql="insert into emp values(1,'anil',15000),(2,'sam',3200)";
	String sql="select * from emp";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
	}
    //st.execute(sql);
    con.close();
    System.out.println("Done");

	}

}
