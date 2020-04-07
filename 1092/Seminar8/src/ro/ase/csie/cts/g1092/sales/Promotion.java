package ro.ase.csie.cts.g1092.sales;

public class Promotion  extends AbstractPromotion {

	public float getDiscountFidelitate(int aniFidelitate) {
		return (aniFidelitate > Promotion.MIN_VECHIME_ANI) ? 
				Promotion.MAX_DISCOUNT_FIDELITATE : (float)aniFidelitate/100;
	}
	
	public float getPretCuDiscount(float pret, float discount, 
			float discountFidelitate) {
		return (pret - getDiscountPret(pret, discountFidelitate)) * 
				(1 - discountFidelitate);
	}
}
