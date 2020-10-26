import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GeneralDao {
	
	
	
	private static final String password = "123456";
	private static final String username = "root";
	private static final String url = "jdbc:mysql://localhost:3306/first-project";
	
	protected Connection getConnection () throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");		
	Connection con = DriverManager.getConnection(url, username, password);

	return con;
	}
}
