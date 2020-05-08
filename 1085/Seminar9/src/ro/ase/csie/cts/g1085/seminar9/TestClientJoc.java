package ro.ase.csie.cts.g1085.seminar9;

import ro.ase.csie.cts.g1085.seminar9.singleton.ConexiuneBD;
import ro.ase.csie.cts.g1085.seminar9.singleton.ModulProfil;
import ro.ase.csie.cts.g1085.seminar9.singleton.ModulSetari;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//ConexiuneBD conexiune = new ConexiuneBD();

		ConexiuneBD conexiune = ConexiuneBD.getConexiune();
		
		ModulSetari setari = new ModulSetari();
		ModulProfil profil = new ModulProfil();
		

	}

}
