package ro.ase.csie.cts.g1085.seminar14.chain;

public class ModulFiltru extends ModulAbstract{

	public ModulFiltru(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		String[] dictionar = new String[] {"te urasc", "lovesc" , "prost" };
		
		for(String cuvant : dictionar) {
			if(mesaj.getText().contains(cuvant)) {
				System.out.println("Filtrare mesaj " + mesaj.getText());
				return;
			}
		}
		
		if(this.next != null)
			this.next.procesareMesaj(mesaj);
		
	}

}
