package ro.ase.csie.cts.g1074.seminar4.faza3;

import ro.ase.csie.cts.g1074.seminar4.faza3.Promotie;

public class Promotie {

	public static final int MIN_VECHIME_ANI = 10;
	public static final float MAX_DISCOUNT_FIDELITATE = 0.15f;
	public static final float DISCOUNT_BRONZE = 0.1f;
	public static final float DISCOUNT_SILVER = 0.25f;
	public static final float DISCOUNT_GOLD = 0.35f;
	
	public static float getDiscountFidelitate(int aniFidelitate) {
		return (aniFidelitate > Promotie.MIN_VECHIME_ANI) ? 
				Promotie.MAX_DISCOUNT_FIDELITATE : (float)aniFidelitate/100;
	}
	
	public static float getDiscountPret(float pret, float discount) {
		return pret * discount;
	}
	
	public static float getPretCuDiscount(float pret, float discount, 
			float discountFidelitate) {
		return (pret - getDiscountPret(pret, discountFidelitate)) * 
				(1 - discountFidelitate);
	}
}
