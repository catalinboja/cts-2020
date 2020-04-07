package ro.ase.csie.cts.g1074.seminar8.stub;

import ro.ase.csie.cts.g1074.seminar8.marketing.InterfataPromotie;

public class StubPromotie implements InterfataPromotie {
	
	float returnDiscountFidelitate;
	float returnDiscountPret;
	float returnPretCuDiscount;
	

	public void setReturnDiscountFidelitate(float returnDiscountFidelitate) {
		this.returnDiscountFidelitate = returnDiscountFidelitate;
	}

	public void setReturnDiscountPret(float returnDiscountPret) {
		this.returnDiscountPret = returnDiscountPret;
	}

	public void setReturnPretCuDiscount(float returnPretCuDiscount) {
		this.returnPretCuDiscount = returnPretCuDiscount;
	}

	@Override
	public float getDiscountFidelitate(int aniFidelitate) {
		// TODO Auto-generated method stub
		return returnDiscountFidelitate;
	}

	@Override
	public float getDiscountPret(float pret, float discount) {
		// TODO Auto-generated method stub
		return returnDiscountPret;
	}

	@Override
	public float getPretCuDiscount(float pret, float discount, float discountFidelitate) {
		// TODO Auto-generated method stub
		return returnPretCuDiscount;
	}

}
