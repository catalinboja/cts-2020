package ro.ase.csie.cts.g1074.seminar13.observer;

public class ModulInterfataJucator implements InterfataStareConexiuneListener{

	@Override
	public void conexiunePierduta(String timestamp) {
		System.out.println("Alerta ! Conexiune pierduta la " + timestamp);
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("Conexiune activa");
	}

}
