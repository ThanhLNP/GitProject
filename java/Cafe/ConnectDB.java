package cafe;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public Connection getConnect() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/cafe";
		String user = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
//	public static void main(String[] args) {
//		ConnectDB connectDB = new ConnectDB();
//		Connection connection = connectDB.getConnect();
//		System.out.println(connection);
//	}
}
