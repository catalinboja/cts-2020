package ro.ase.acs.cts;

import ro.ase.acs.cts.documente.DocumentOpenOfficeText;
import ro.ase.acs.cts.documente.DocumentWordText;
import ro.ase.acs.cts.documente.TipDocument;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
/*		DocumentWordText wordDoc = new DocumentWordText();
		DocumentOpenOfficeText openDoc = new DocumentOpenOfficeText();*/
		
		OpenDocumentFactory odf = new OpenDocumentFactory();
		
		DocumentWordText wordDoc = 
				(DocumentWordText) odf.creareDocument(TipDocument.TEXT);
		
	}

}
