import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Demo {
	 public static void main(String args[])
		        throws SQLException, ClassNotFoundException
		    {
		        String driverClassName
		            = "sun.jdbc.odbc.JdbcOdbcDriver";
		        String url = "jdbc:sqlserver://ZIL1157\\MSSQLSRVDEV19;databaseName=jdbcdemo";
		        String username = "sa";
		        String password = "perficient@123";
		        String query
		            = "insert into students values(777, 'Pooja')";
		  
		        // Load driver class
		        Class.forName(driverClassName);
		  
		        // Obtain a connection
		        Connection con = DriverManager.getConnection(
		            url, username, password);
		  
		        // Obtain a statement
		        Statement st = (Statement) con.createStatement();
		  
		        // Execute the query
		        int count = ((java.sql.Statement) st).executeUpdate(query);
		        System.out.println(
		            "number of rows affected by this query= "
		            + count);
		  
		        // Closing the connection as per the
		        // requirement with connection is completed
		        con.close();
		    }
		} // class

