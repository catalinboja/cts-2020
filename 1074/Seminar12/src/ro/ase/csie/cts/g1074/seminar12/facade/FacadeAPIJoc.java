package ro.ase.csie.cts.g1074.seminar12.facade;

public class FacadeAPIJoc {
	
	public static void accesForum(String user, String pass) {
		Login login = new Login();
		login.login(user, pass);
		ForumJoc forum  = new ForumJoc();
		Profil profil = new Profil();
		ConexiuneBazaDate conexiuneBazaDate = new ConexiuneBazaDate();
		conexiuneBazaDate.connect();
		profil.display();
		conexiuneBazaDate.disconnect();
	}
	
	public static void setariJoc(String user, String pass) {
		Login login2 = new Login();
		login2.login(user, pass);
		ConexiuneBazaDate conexiuneBazaDate2 = new ConexiuneBazaDate();
		conexiuneBazaDate2.connect();
		CaracterJoc caracter = new CaracterJoc();
		conexiuneBazaDate2.disconnect();
	}
}
