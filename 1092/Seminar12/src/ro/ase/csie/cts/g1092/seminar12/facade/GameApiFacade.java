package ro.ase.csie.cts.g1092.seminar12.facade;

public class GameApiFacade {
	
	String databaseIP;
	String databaseCredentials;
	
	
	public GameApiFacade(String databaseIP, String databaseCredentials) {
		super();
		this.databaseIP = databaseIP;
		this.databaseCredentials = databaseCredentials;
	}

	//version based on static methods
	public static void accessForum() {
		ConexiuneBazaDate connection = new ConexiuneBazaDate();
		connection.connect();
		Login login = new Login();
		login.login("player", "1234");
		Profil profile = new Profil();
		ForumJoc forum = new ForumJoc();
		connection.disconnect();
	}
	
	//version with instance methods
	public void getCharacterSettings() {
		ConexiuneBazaDate connection2 = new ConexiuneBazaDate();
		connection2.connect();
		Login login2 = new Login();
		login2.login("player", "1234");
		CaracterJoc character = new CaracterJoc();
		connection2.disconnect();
	}
}
