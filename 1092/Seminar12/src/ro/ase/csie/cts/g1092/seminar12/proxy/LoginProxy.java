package ro.ase.csie.cts.g1092.seminar12.proxy;

public class LoginProxy implements LoginInterface {
	
	LoginInterface realModule = null;
	int counter = 0;
	public static final int MAX_ATTEMPTS = 3;

	public LoginProxy(LoginInterface realModule) {
		super();
		this.realModule = realModule;
	}

	@Override
	public boolean login(String user, String pass) {
		//add a filter on authentication
		//focus only on player one
		
		if(counter >= MAX_ATTEMPTS) {
			System.out.println("Account is locked");
			return false;
		}
		else {
			boolean isAuthenticated = this.realModule.login(user, pass);
			if(!isAuthenticated)
				counter += 1;
			else {
				counter = 0;
			}
			
			return isAuthenticated;
		}
	}

}
