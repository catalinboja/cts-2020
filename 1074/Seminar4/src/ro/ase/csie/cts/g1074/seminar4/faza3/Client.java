package ro.ase.csie.cts.g1074.seminar4.faza3;

import ro.ase.csie.cts.g1074.seminar4.faza3.Promotie;
import ro.ase.csie.cts.g1074.seminar4.faza3.TipClient;

public class Client {
	public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate) throws ExceptieTipClient {

		float discountFidelitate = Promotie.getDiscountFidelitate(aniFidelitate);
		switch (tipClient) {
		case WOOD:
			return pretInitial;
		case BRONZE:
			return Promotie.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_BRONZE, discountFidelitate);
		case SILVER:
			return Promotie.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_SILVER, discountFidelitate);
		case GOLD:
			return Promotie.getPretCuDiscount(pretInitial, Promotie.DISCOUNT_GOLD, discountFidelitate);
		default:
			throw new ExceptieTipClient();
		}
	}
}
