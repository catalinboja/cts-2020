package ro.ase.csie.cts.g1084.seminar14.chain;

public class ModulChatPrivat extends ModulChatAbstract{

	public ModulChatPrivat(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(!mesaj.getDestinatar().isEmpty()) {
			System.out.println("Trimit mesajul catre " + mesaj.destinatar);
			System.out.println(mesaj.getText());
			return;
		}
		
		if(this.next != null)
			this.next.procesareMesajChat(mesaj);
	}

}
