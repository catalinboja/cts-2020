package ro.ase.csie.cts.g1091.sales;

public abstract class AbstractPromotion {

	public static final int MIN_VECHIME_ANI = 10;
	public static final float MAX_DISCOUNT_FIDELITATE = 0.15f;
	public static final float DISCOUNT_BRONZE = 0.1f;
	public static final float DISCOUNT_SILVER = 0.25f;
	public static final float DISCOUNT_GOLD = 0.35f;
	
	public abstract float getDiscountFidelitate(int aniFidelitate) ;
	
	public static float getDiscountPret(float pret, float discount) {
		return pret * discount;
	}
	
	public abstract float getPretCuDiscount(
			float pret, 
			float discount, 
			float discountFidelitate) ;
}
