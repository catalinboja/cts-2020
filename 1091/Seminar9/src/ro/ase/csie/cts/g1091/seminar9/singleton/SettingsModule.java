package ro.ase.csie.cts.g1091.seminar9.singleton;

public class SettingsModule {
	
	DBConnection con;
	
	public SettingsModule() {
		//con = DBConnection.getConnection();
		con = DBConnection.getConnection("10.0.0.1","Settings", "dev");
	}

}
