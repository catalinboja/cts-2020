package ro.ase.csie.cts.g1091.tests.stubs;

import ro.ase.csie.cts.g1091.sales.AbstractPromotion;

public class PromotionStub extends AbstractPromotion{
	
	float returnGetDiscountFidelitate;
	float returnGetPretCuDiscount;
	boolean throwException = false;
	
	
	public void setReturnGetDiscountFidelitate(float returnGetDiscountFidelitate) {
		this.returnGetDiscountFidelitate = returnGetDiscountFidelitate;
	}

	public void setReturnGetPretCuDiscount(float returnGetPretCuDiscount) {
		this.returnGetPretCuDiscount = returnGetPretCuDiscount;
	}
	

	public void setThrowException(boolean throwException) {
		this.throwException = throwException;
	}

	@Override
	public float getDiscountFidelitate(int aniFidelitate) {
		// TODO Auto-generated method stub
		
		if(throwException)
			throw new UnsupportedOperationException();
		
		return returnGetDiscountFidelitate;
	}

	@Override
	public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
		// TODO Auto-generated method stub
		return returnGetPretCuDiscount;
	}

}
