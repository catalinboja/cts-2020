package ro.ase.csie.cts.g1074.seminar9.singleton;

public class ModulInterfataGrafica {

	public ModulInterfataGrafica() {
		
		//ConexiuneBazaDeDate conexiune = new ConexiuneBazaDeDate();
		ConexiuneBazaDeDate conexiune = ConexiuneBazaDeDate.getConexiune();
		conexiune.deschideConexiune();
	}
}
