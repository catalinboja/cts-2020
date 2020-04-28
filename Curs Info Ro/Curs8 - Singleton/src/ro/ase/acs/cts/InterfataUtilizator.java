package ro.ase.acs.cts;

public class InterfataUtilizator {
	
	ConexiuneBD bd;
	
	public InterfataUtilizator() {
		bd = new ConexiuneBD("127.0.0.l:3060", "user", "12345678");
	}
}
