package Modell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
	static connexion myConnection;
	private Connection conn;

	private connexion() {
		try {
 conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/elearningbd?autoReconnect=true&useSSL=false",
			"root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static connexion getInstance() {
		if (myConnection == null)
			myConnection = new connexion();
		return myConnection;
	}
    public Connection getConn() {
		return conn;
	}

}
