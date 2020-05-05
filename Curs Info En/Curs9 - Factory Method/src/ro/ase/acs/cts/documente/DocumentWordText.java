package ro.ase.acs.cts.documente;

public class DocumentWordText extends InterfataDocument {

	public DocumentWordText(String title, int vb) {
		this.setTitlu(title);
	}
	
	@Override
	public String getTip() {
		return "Document MSWord de tip text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
