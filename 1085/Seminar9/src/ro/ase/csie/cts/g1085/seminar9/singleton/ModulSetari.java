package ro.ase.csie.cts.g1085.seminar9.singleton;

public class ModulSetari {

	ConexiuneBD conexiune;
	
	public ModulSetari() {
		//conexiune = new ConexiuneBD();
		//conexiune = ConexiuneBD.getConexiune();
		conexiune = ConexiuneBD.getConexiune("10.0.0.1:4404", "Setari", "dev");
	}
	
}
