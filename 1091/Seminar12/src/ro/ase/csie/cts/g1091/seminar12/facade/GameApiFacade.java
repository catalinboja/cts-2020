package ro.ase.csie.cts.g1091.seminar12.facade;

public class GameApiFacade {
	

	String user;
	String pass;
	

	public GameApiFacade(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	
	public void getCharacterSettings() {
		ConexiuneBazaDate connection2 = new ConexiuneBazaDate();
		connection2.connect();
		Login login2 = new Login();
		if(login2.login(user, pass)) {
			CaracterJoc gameChar = new CaracterJoc();
		}
		connection2.disconnect();
	}


	public static void accessForum(String user, String pass) {
		ConexiuneBazaDate connection = new ConexiuneBazaDate();
		connection.connect();
		Login login = new Login();
		if(login.login("admin", "1234")) {
			ForumJoc forum = new ForumJoc();
			Profil profile = new Profil();
		}
		connection.disconnect();
	}
	
}
