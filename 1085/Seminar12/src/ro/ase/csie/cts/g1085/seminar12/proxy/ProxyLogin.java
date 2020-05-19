package ro.ase.csie.cts.g1085.seminar12.proxy;

public class ProxyLogin implements InterfataLogin {
	
	InterfataLogin modulLogin = null;
	
	int contor = 0 ;
	public static final int NR_MAX_INCERCARI = 3;
	
	public ProxyLogin(InterfataLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String user, String parola) {
		if(contor >= NR_MAX_INCERCARI) {
			System.out.println("Contul este blocat");
			return false;
		}
		
		boolean esteAutentificat = this.modulLogin.login(user, parola);
		if(!esteAutentificat)
			contor += 1;
		else
			contor = 0;
		
		return esteAutentificat;
	}

}
