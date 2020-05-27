package ro.ase.csie.cts.g1085.seminar14.chain;

public abstract class ModulAbstract {
	
	ModulAbstract next;
	
	String numeModul;

	public ModulAbstract(String numeModul) {
		super();
		this.numeModul = numeModul;
	}

	public void setNext(ModulAbstract next) {
		this.next = next;
	}
	
	public abstract void procesareMesaj(MesajChat mesaj);
	
}
