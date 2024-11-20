import java.sql.*;
public class InsertMovie {

	public void insert() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String username = "root";
		String password ="0211";
		String Query ="insert into user values(?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 102);
		pst.setString(2, "shree");
		pst.setInt(3, 24);
		pst.executeUpdate();
		con.close();
		System.out.println("data inserted");
		
	}
	
	
	public static void main(String[] args)throws Exception {
		InsertMovie obj = new InsertMovie();
		obj.insert();
	}
}
