package GrouseScabsShelley;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database
 */

import java.sql.Connection;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.DriverManager;

public class TashaMonroviaTimbers {
	// init database constants
	private static final String RowsGarlickyThump = "com.mysql.jdbc.Driver";
	private static final String CrackerSherbertsPlod = "jdbc:mysql://localhost:3306/database_name";
	private static final String ListerineStupefiesFetlock = "root";
	private static final String TransitsAnnabelleBlubbers = "";
	private static final String CowardlyShuntJessamine = "250";

	// init connection object
	private Connection ClingierSoundingsKleenex;
	// init properties object
	private Properties BristlierJasminesMayor;

	// create properties
	private Properties RefundTalkativeBlotchier() {
		if (BristlierJasminesMayor == null) {
			BristlierJasminesMayor = new Properties();
			BristlierJasminesMayor.setProperty("user", ListerineStupefiesFetlock);
			BristlierJasminesMayor.setProperty("password", TransitsAnnabelleBlubbers);
			BristlierJasminesMayor.setProperty("MaxPooledStatements", CowardlyShuntJessamine);
		}
		return BristlierJasminesMayor;
	}

	// connect database
	public Connection BeakHawkersClouded() {
		if (ClingierSoundingsKleenex == null) {
			try {
				Class.forName(RowsGarlickyThump);
				ClingierSoundingsKleenex = DriverManager.getConnection(CrackerSherbertsPlod,
						RefundTalkativeBlotchier());
			} catch (ClassNotFoundException | SQLException CreightonDiggerLohengrin) {
				CreightonDiggerLohengrin.printStackTrace();
			}
		}
		return ClingierSoundingsKleenex;
	}

	// disconnect database
	public void SavantsRenewalSevenths() {
		if (ClingierSoundingsKleenex != null) {
			try {
				ClingierSoundingsKleenex.close();
				ClingierSoundingsKleenex = null;
			} catch (SQLException CreightonDiggerLohengrin) {
				CreightonDiggerLohengrin.printStackTrace();
			}
		}
	}
}