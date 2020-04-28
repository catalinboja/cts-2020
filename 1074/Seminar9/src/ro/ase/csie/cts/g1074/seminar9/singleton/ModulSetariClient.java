package ro.ase.csie.cts.g1074.seminar9.singleton;

public class ModulSetariClient {
	public ModulSetariClient() {
		//deschide o conexiune la baza de date
		
/*		ConexiuneBazaDeDate conexiune = 
				new ConexiuneBazaDeDate();*/
		ConexiuneBazaDeDate conexiune = ConexiuneBazaDeDate.getConexiune();
		conexiune.deschideConexiune();
	}
}
