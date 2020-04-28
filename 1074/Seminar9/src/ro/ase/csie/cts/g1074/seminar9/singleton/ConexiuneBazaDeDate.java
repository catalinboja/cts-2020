package ro.ase.csie.cts.g1074.seminar9.singleton;

public class ConexiuneBazaDeDate {
	
	public String ipServer;
	public String bazaDeDate;
	public String user;
	
	//referinta catre instanta unica
	private static ConexiuneBazaDeDate instantaUnica = null;
	
	
	private ConexiuneBazaDeDate(String ipServer, String bazaDeDate, String user) {
		super();
		this.ipServer = ipServer;
		this.bazaDeDate = bazaDeDate;
		this.user = user;
		System.out.println("Apel constructor cu parametri");
	}
	
	private ConexiuneBazaDeDate() {
		//se pot prelua din setari
		ipServer = "127.0.0.1";
		bazaDeDate = "SuperEroi";
		user = "clientJoc";
		System.out.println("Apel constructor default");
	}
	
	public void deschideConexiune() {
		System.out.println("Deschide conexiune catre " + bazaDeDate);
	}
	
	//metoda publica prin care ceilalti obtin obiectul unic
	public synchronized static ConexiuneBazaDeDate getConexiune() {
		
		if(instantaUnica == null) {
			System.out.println("Creare obiect unic");
			ConexiuneBazaDeDate.instantaUnica = new ConexiuneBazaDeDate();
		}
		
		return instantaUnica;	
	}
	
	public static ConexiuneBazaDeDate getConexiune(String ip, String bazaDedate, String user) {
		
		if(instantaUnica == null) {
			System.out.println("Creare obiect unic");
			ConexiuneBazaDeDate.instantaUnica = new ConexiuneBazaDeDate(ip, bazaDedate, user);
		}
		else
		{
			//verificare daca conexiunea ceruta este catre baza de date existenta
			//anuntam ca deja exista o conexiune
			if(ip != instantaUnica.ipServer) {
				System.out.println("Exista deja o conexiune catre alt IP");
				//mai bine arunci o exceptie
			}
		}
		

		return instantaUnica;
	}
	
	
}


