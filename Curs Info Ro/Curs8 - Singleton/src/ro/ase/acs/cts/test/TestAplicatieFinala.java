package ro.ase.acs.cts.test;

import ro.ase.acs.cts.ConexiuneBD;
import ro.ase.acs.cts.InterfataUtilizator;
import ro.ase.acs.cts.ModulDate;
import ro.ase.acs.cts.singleton.exemplu.SingletonEnum;

public class TestAplicatieFinala {
	public static void main(String[] args) throws Exception {
		
		ConexiuneBD bd1 = 
				new ConexiuneBD("127.0.0.l:3060", "user", "12345678");
		
		ModulDate date = new ModulDate();
		InterfataUtilizator gui = new InterfataUtilizator();
		

	}
	
	
	

	
}
