package ro.ase.csie.cts.g1084.seminar11;

import ro.ase.csie.cts.g1084.seminar11.proxy.Login;

public class FacadeAPIJoc {
	
	public void accesForum() {
		//actiuni pentru a accesa forumul
		ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
		conexiune.connect();
		Login modulLogin = new Login();
		modulLogin.login("test", "test");
		ForumJoc forum = new ForumJoc();
		Profil profilJucator = new Profil();
		conexiune.disconnect();
	}
	
	
	public Profil getProfilJucator() {
		ConexiuneBazaDate conexiune = new ConexiuneBazaDate();
		conexiune.connect();
		Login modulLogin = new Login();
		modulLogin.login("test", "test");
		Profil profilJucator = new Profil();
		conexiune.disconnect();
		return profilJucator;
	}

}
