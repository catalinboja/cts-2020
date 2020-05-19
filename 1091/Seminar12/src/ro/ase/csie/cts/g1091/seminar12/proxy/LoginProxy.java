package ro.ase.csie.cts.g1091.seminar12.proxy;

public class LoginProxy implements LoginInterface {
	
	LoginInterface loginModule = null;
	
	public static final int MAX_ATTEMPTS = 3;
	int counter = 0;
	
	public LoginProxy(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}

	@Override
	public boolean login(String user, String pass) {
		
		if(counter >= MAX_ATTEMPTS) {
			System.out.println("Notify the user. The account is locked");
			return false;
		}
		
		boolean isAuthenticated = this.loginModule.login(user, pass);
		if(!isAuthenticated) {
			counter += 1;
		}
		else
		{
			counter = 0;
		}
		
		return isAuthenticated;
	}

}
