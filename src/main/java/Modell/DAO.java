package Modell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class DAO<T> {
	Connection con;

	public DAO() {
		String serveurBD= "jdbc:mysql://127.0.0.1:3306/elearningbd?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
		
		String login = "root";
		String motPasse = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(serveurBD, login, motPasse);

		} catch (

		Exception e) {
			e.printStackTrace();
			System.out.println("Execption");
		}
		this.con = con;
	}

	public Connection getCon() {
		return con;
	}

	public abstract T find(T obj);


}