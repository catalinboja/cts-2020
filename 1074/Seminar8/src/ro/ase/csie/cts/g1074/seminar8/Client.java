package ro.ase.csie.cts.g1074.seminar8;

import ro.ase.csie.cts.g1074.seminar8.TipClient;
import ro.ase.csie.cts.g1074.seminar8.exceptii.ExceptiePromotie;
import ro.ase.csie.cts.g1074.seminar8.marketing.InterfataPromotie;
import ro.ase.csie.cts.g1074.seminar8.marketing.Promotie;

public class Client {
	
	InterfataPromotie promo = null;
	
	public void setPromotieCurenta(InterfataPromotie promotie) {
		this.promo = promotie;
	}
	
	public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) 
			throws ExceptieTipClient, ExceptiePromotie {

		if(promo == null)
			throw new ExceptiePromotie();
		
		float discountFidelitate = promo.getDiscountFidelitate(aniFidelitate);
		switch (tipClient) {
		case WOOD:
			return pretInitial;
		case BRONZE:
			return promo.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_BRONZE, discountFidelitate);
		case SILVER:
			return promo.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_SILVER, discountFidelitate);
		case GOLD:
			return promo.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_GOLD, discountFidelitate);
		default:
			throw new ExceptieTipClient();
		}
	}
}
