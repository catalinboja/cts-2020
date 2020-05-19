package ro.ase.csie.cts.g1085.seminar12.proxy;

public class ModulLogin implements InterfataLogin {

	@Override
	public boolean login(String user, String parola) {
		System.out.println("Conectare baza de date");
		System.out.println("Verifica credentiale");
		if(user.equals("jucator") && parola.equals("1234j"))
			return true;
		else
			return false;
	}

}
