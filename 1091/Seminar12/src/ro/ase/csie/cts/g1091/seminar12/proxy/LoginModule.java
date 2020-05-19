package ro.ase.csie.cts.g1091.seminar12.proxy;

public class LoginModule implements LoginInterface{

	@Override
	public boolean login(String user, String pass) {
		System.out.println("Connect to the database");
		System.out.println("Check credentials");
		if(user.equals("playerone") && pass.equals("1234p")){
			return true;
		}
		else
			return false;
	}

}
