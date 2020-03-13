package ro.ase.csie.cts.g1074.seminar4.faza2;

public class Client {
	public float calculeazaPretFinal(TipClient tipClient, float pretInitial, int aniFidelitate)
	  {
	    float pretFinal = 0;
	    float discountFidelitate = (aniFidelitate > Promotie.MIN_VECHIME_ANI) ? Promotie.MAX_DISCOUNT_FIDELITATE : (float)aniFidelitate/100; 
	    if (tipClient == TipClient.WOOD)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipClient == TipClient.BRONZE)
	    {
	      pretFinal = (pretInitial - (Promotie.DISCOUNT_BRONZE * pretInitial)) - discountFidelitate * (pretInitial - (Promotie.DISCOUNT_BRONZE * pretInitial));
	    }
	    else if (tipClient == TipClient.SILVER)
	    {
	      pretFinal = (pretInitial - (Promotie.DISCOUNT_SILVER * pretInitial)) - discountFidelitate * (pretInitial - (Promotie.DISCOUNT_SILVER * pretInitial));
	    }
	    else if (tipClient == TipClient.GOLD)
	    {
	      pretFinal = (pretInitial - (Promotie.DISCOUNT_GOLD * pretInitial)) - discountFidelitate * (pretInitial - (Promotie.DISCOUNT_GOLD * pretInitial));
	    }
	    return pretFinal;
	  }
}
