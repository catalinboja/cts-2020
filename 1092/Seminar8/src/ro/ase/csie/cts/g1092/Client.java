package ro.ase.csie.cts.g1092;

import ro.ase.csie.cts.g1092.TipClient;
import ro.ase.csie.cts.g1092.exceptions.ExceptieTipClient;
import ro.ase.csie.cts.g1092.sales.AbstractPromotion;

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
			return promo.getPretCuDiscount(
					pretInitial, AbstractPromotion.DISCOUNT_BRONZE, discountFidelitate);
		case SILVER:
			return promo.getPretCuDiscount(
					pretInitial, AbstractPromotion.DISCOUNT_SILVER, discountFidelitate);
		case GOLD:
			return promo.getPretCuDiscount(
					pretInitial, AbstractPromotion.DISCOUNT_GOLD, discountFidelitate);
		default:
			throw new ExceptieTipClient();
		}
	}
}
