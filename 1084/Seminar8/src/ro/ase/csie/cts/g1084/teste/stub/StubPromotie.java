package ro.ase.csie.cts.g1084.teste.stub;

import ro.ase.csie.cts.g1084.marketing.PromotieAbstracta;

public class StubPromotie extends PromotieAbstracta{

	float returnGetDiscountFidelitate;
	float returnGetPretCuDiscount;
	
	boolean genereazaExceptie = false;
	
	
	public void setGenereazaExceptie(boolean genereazaExceptie) {
		this.genereazaExceptie = genereazaExceptie;
	}

	public void setReturnGetDiscountFidelitate(float returnGetDiscountFidelitate) {
		this.returnGetDiscountFidelitate = returnGetDiscountFidelitate;
	}

	public void setReturnGetPretCuDiscount(float returnGetPretCuDiscount) {
		this.returnGetPretCuDiscount = returnGetPretCuDiscount;
	}

	@Override
	public float getDiscountFidelitate(int aniFidelitate) {
		// TODO Auto-generated method stub
		return returnGetDiscountFidelitate;
	}

	@Override
	public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
		
		if(genereazaExceptie)
			throw new UnsupportedOperationException();
		
		return returnGetPretCuDiscount;
	}

}
