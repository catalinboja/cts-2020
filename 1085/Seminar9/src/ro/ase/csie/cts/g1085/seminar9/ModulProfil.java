package ro.ase.csie.cts.g1085.seminar9;

public class ModulProfil {

	ConexiuneBD conexiune;
	
	public ModulProfil() {
		//conexiune = new ConexiuneBD();
		conexiune = ConexiuneBD.getConexiune();
	}
}
