package ro.ase.csie.cts.g1074.seminar13.observer;

public class ModulStareJoc implements InterfataStareConexiuneListener {

	@Override
	public void conexiunePierduta(String timestamp) {
		System.out.println("Salvare stare curenta joc ");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("Restaurare stare joc si reluare joc");
	}

}
