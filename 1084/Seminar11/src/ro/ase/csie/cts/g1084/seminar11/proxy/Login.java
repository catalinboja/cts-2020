package ro.ase.csie.cts.g1084.seminar11.proxy;

public class Login implements InterfataLogin {

	@Override
	public boolean login(String username, String password) {
		
		if(username.equals("player1") 
				&& password.equals("1234player"))
			return true;
		else
			return false;
	}

}
