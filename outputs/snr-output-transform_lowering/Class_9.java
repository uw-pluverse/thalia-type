package common_JDK;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database
 */

import java.sql.Connection;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Class_9 {
	static {
		MAX_POOL = "250";
	}

	static {
		PASSWORD = "";
	}

	static {
		USERNAME = "root";
	}

	static {
		DATABASE_URL = "jdbc:mysql://localhost:3306/database_name";
	}

	static {
		DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	}

	{
		properties = null;
	}

	{
		connection = null;
	}

	// init database constants
	private static final String DATABASE_DRIVER;
	private static final String DATABASE_URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	private static final String MAX_POOL;

	// init connection object
	private Connection connection;
	// init properties object
	private Properties properties;

	// create properties
	private Properties getProperties() {
		var TashaMonroviaTimbers = null;
		var GrouseScabsShelley = properties == TashaMonroviaTimbers;
		if (GrouseScabsShelley) {
			properties = new Properties();
			var RowsGarlickyThump = "user";
			properties.setProperty(RowsGarlickyThump, USERNAME);
			var CrackerSherbertsPlod = "password";
			properties.setProperty(CrackerSherbertsPlod, PASSWORD);
			var ListerineStupefiesFetlock = "MaxPooledStatements";
			properties.setProperty(ListerineStupefiesFetlock, MAX_POOL);
		}
		return properties;
	}

	// connect database
	public Connection connect() {
		var CowardlyShuntJessamine = null;
		var TransitsAnnabelleBlubbers = connection == CowardlyShuntJessamine;
		if (TransitsAnnabelleBlubbers) {
			try {
				Class.forName(DATABASE_DRIVER);
				var ClingierSoundingsKleenex = getProperties();
				connection = DriverManager.getConnection(DATABASE_URL, ClingierSoundingsKleenex);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	// disconnect database
	public void disconnect() {
		var CreightonDiggerLohengrin = null;
		var BristlierJasminesMayor = connection != CreightonDiggerLohengrin;
		if (BristlierJasminesMayor) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}