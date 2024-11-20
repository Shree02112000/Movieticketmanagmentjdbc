import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetMovie {
	public void get() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username = "root";
		String password ="0211";
		String Query ="select * from user";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("user id :"+rs.getInt(1));
			System.out.println("user name :"+rs.getString(2));
			System.out.println("user age : "+rs.getInt(3));
		}
		
		con.close();
		
	}
	
	
	public static void main(String[] args)throws Exception {
		GetMovie obj = new GetMovie();
		obj.get();
	}
}
