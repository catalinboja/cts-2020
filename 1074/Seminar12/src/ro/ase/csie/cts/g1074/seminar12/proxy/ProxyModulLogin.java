package ro.ase.csie.cts.g1074.seminar12.proxy;

public class ProxyModulLogin implements InterfataModulLogin {

	InterfataModulLogin modulLogin;
	
	int contorIncercari = 0;
	

	public ProxyModulLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String user, String pass) {
		
		if(contorIncercari >= 3) {
			System.out.println("Notific utilizatorul");
			return false;
		}
		
		boolean esteAutentificat = this.modulLogin.login(user, pass);
		if(!esteAutentificat)
			contorIncercari += 1;
		else
			contorIncercari = 0;
		
		return esteAutentificat;
	};
	
	
}
