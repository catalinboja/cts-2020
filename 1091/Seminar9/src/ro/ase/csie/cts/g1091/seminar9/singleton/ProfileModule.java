package ro.ase.csie.cts.g1091.seminar9.singleton;

public class ProfileModule {
	
	DBConnection con;
	
	public ProfileModule() {
		con = DBConnection.getConnection();
		DBConnection localCon = DBConnection.getConnection("10.0.0.1","Settings", "dev");
	}
}
