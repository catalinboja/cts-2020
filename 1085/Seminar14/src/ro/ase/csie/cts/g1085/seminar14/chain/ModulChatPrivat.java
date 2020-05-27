package ro.ase.csie.cts.g1085.seminar14.chain;

public class ModulChatPrivat extends ModulAbstract{

	public ModulChatPrivat(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if(!mesaj.numeJucatorDestinatie.isEmpty()) {
			System.out.println("Mesaj catre " + mesaj.numeJucatorDestinatie);
			System.out.println(mesaj.text);
			return;
		}
		
		if(this.next != null)
			this.next.procesareMesaj(mesaj);
	}

}
