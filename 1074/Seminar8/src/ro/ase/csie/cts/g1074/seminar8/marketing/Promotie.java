package ro.ase.csie.cts.g1074.seminar8.marketing;

import ro.ase.csie.cts.g1074.seminar8.marketing.Promotie;

public class Promotie implements InterfataPromotie{

	public float getDiscountFidelitate(int aniFidelitate) {
		return (aniFidelitate > Promotie.MIN_VECHIME_ANI) ? 
				Promotie.MAX_DISCOUNT_FIDELITATE : (float)aniFidelitate/100;
	}
	
	public float getDiscountPret(float pret, float discount) {
		return pret * discount;
	}
	
	public float getPretCuDiscount(float pret, float discount, 
			float discountFidelitate) {
		return (pret - getDiscountPret(pret, discountFidelitate)) * 
				(1 - discountFidelitate);
	}
}
