package ro.ase.csie.cts.g1092.tests.stubs;

import ro.ase.csie.cts.g1092.sales.AbstractPromotion;

public class AbstractPromotionStub extends AbstractPromotion{

	float returnGetDiscountFidelitate;
	float returnGetPretCuDiscount;
	
	
	public void setReturnGetDiscountFidelitate(float returnGetDiscountFidelitate) {
		this.returnGetDiscountFidelitate = returnGetDiscountFidelitate;
	}

	public void setReturnGetPretCuDiscount(float returnGetPretCuDiscount) {
		this.returnGetPretCuDiscount = returnGetPretCuDiscount;
	}

	@Override
	public float getDiscountFidelitate(int aniFidelitate) {
		return returnGetDiscountFidelitate;
	}

	@Override
	public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
		return returnGetPretCuDiscount;
	}

}
