package ro.ase.csie.cts.g1091;

import ro.ase.csie.cts.g1091.TipClient;
import ro.ase.csie.cts.g1091.exceptions.ExceptieTipClient;
import ro.ase.csie.cts.g1091.sales.AbstractPromotion;
import ro.ase.csie.cts.g1091.sales.Promotie;

public class Client {
	
	AbstractPromotion promo;

	public void setPromo(AbstractPromotion promo) {
		this.promo = promo;
	}

	public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws ExceptieTipClient {

		float discountFidelitate = 
				promo.getDiscountFidelitate(aniFidelitate);
		switch (tipClient) {
		case WOOD:
			return pretInitial;
		case BRONZE:
			return promo.getPretCuDiscount(pretInitial, 
					Promotie.DISCOUNT_BRONZE, discountFidelitate);
		case SILVER:
			return promo.getPretCuDiscount(pretInitial, 
					Promotie.DISCOUNT_SILVER, discountFidelitate);
		case GOLD:
			return promo.getPretCuDiscount(pretInitial, 
					Promotie.DISCOUNT_GOLD, discountFidelitate);
		default:
			throw new ExceptieTipClient();
		}
	}
}
