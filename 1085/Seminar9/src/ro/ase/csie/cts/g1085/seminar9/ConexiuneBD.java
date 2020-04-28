package ro.ase.csie.cts.g1085.seminar9;

import java.util.HashMap;

public class ConexiuneBD {
	
	String socket;
	String bazaDeDate;
	String user;
	
	
	private static ConexiuneBD conexiuneUnica = null;
	
	//registru de obiecte Singleton
	private static HashMap<String, ConexiuneBD> conexiuni = 
			new HashMap<String, ConexiuneBD>();
	
	private ConexiuneBD(String socket, String bazaDeDate, String user) {
		super();
		this.socket = socket;
		this.bazaDeDate = bazaDeDate;
		this.user = user;
		System.out.println("Conexiune BD la " + socket);
	}


	private ConexiuneBD() {
		super();
		this.socket = "127.0.0.1:3306";
		this.bazaDeDate = "Dezvoltare";
		this.user = "dev";
		System.out.println("Conexiune BD la " + socket);
	}
	
	public static synchronized ConexiuneBD getConexiune() {
		
		//lazy instantiation
		if(conexiuneUnica == null) {
			conexiuneUnica = new ConexiuneBD();
		}
		return conexiuneUnica;
	}
	
	public static synchronized ConexiuneBD getConexiune(
			String socket, String bazaDeDate, String user) {
		
		ConexiuneBD conexiune = conexiuni.get(socket);
		
		//lazy instantiation
		if(conexiune == null) {
			conexiune = new ConexiuneBD(socket, bazaDeDate, user);
			conexiuni.put(socket, conexiune);
		}
		
		return conexiune;
	}
	

}
