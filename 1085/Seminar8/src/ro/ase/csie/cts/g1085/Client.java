package ro.ase.csie.cts.g1085;

import ro.ase.csie.cts.g1085.TipClient;
import ro.ase.csie.cts.g1085.exceptii.ExceptieTipClient;
import ro.ase.csie.cts.g1085.marketing.PromotieAbstracta;
import ro.ase.csie.cts.g1085.marketing.Promotie;

public class Client {
	
	PromotieAbstracta promo = null;

	public void setPromo(PromotieAbstracta promo) {
		this.promo = promo;
	}

	public float calculeazaPretFinal(TipClient tipClient, float pretInitial,
			int aniFidelitate) throws ExceptieTipClient {

		float discountFidelitate = 
				promo.getDiscountFidelitate(aniFidelitate);
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
