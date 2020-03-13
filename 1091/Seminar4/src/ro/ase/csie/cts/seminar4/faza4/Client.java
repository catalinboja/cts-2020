package ro.ase.csie.cts.seminar4.faza4;

import ro.ase.csie.cts.seminar4.faza4.TipClient;

public class Client {
	
	InterfataMarketing refPromotie;
	
	public void setRefPromotie(InterfataMarketing refPromotie) {
		this.refPromotie = refPromotie;
	}

	public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws ExceptieFaraPromotie {

		if(refPromotie == null)
			throw new ExceptieFaraPromotie();
		
		float discountFidelitate = refPromotie.getDiscountFidelitate(
				aniFidelitate);
		
		return refPromotie.getPretCuDiscount(pretInitial, 
				tipClient.getDiscount(), discountFidelitate);
		
	}
}
