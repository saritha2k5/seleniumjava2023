package julybatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demosql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
String url="jdbc:mysql://localhost:3306/julybatch";
String username="root";
String password="saritha";

	//Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from stu");
while(rs.next())
{
	String sid=rs.getString("stuid");
			System.out.println(sid);
	String sname=rs.getString("stuname");
	System.out.println(sname);
	
}

con.close();

	}

}
