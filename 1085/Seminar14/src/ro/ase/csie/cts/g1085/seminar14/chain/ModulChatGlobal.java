package ro.ase.csie.cts.g1085.seminar14.chain;

public class ModulChatGlobal extends ModulAbstract{

	public ModulChatGlobal(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		System.out.println("Transmit catre toti: " + mesaj.getText());
		if(this.next != null)
			this.next.procesareMesaj(mesaj);
	}

}
