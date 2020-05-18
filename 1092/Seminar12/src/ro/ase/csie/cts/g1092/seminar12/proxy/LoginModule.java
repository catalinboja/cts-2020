package ro.ase.csie.cts.g1092.seminar12.proxy;

public class LoginModule implements LoginInterface{

	@Override
	public boolean login(String user, String pass) {
		System.out.println("Connect to the database");
		if(user.equals("playerOne") && pass.equals("1234p"))
			return true;
		else
			return false;
	}

}
