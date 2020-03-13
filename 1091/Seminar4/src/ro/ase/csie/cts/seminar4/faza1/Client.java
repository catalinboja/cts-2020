package ro.ase.csie.cts.seminar4.faza1;

public class Client {
	public float calculeazaPretFinal(int tipClient, float pretInitial, int aniFidelitate)
	  {
	    float pretFinal = 0;
	    float discountFidelitate = (aniFidelitate > 10) ? (float)15/100 : (float)aniFidelitate/100; 
	    if (tipClient == 1)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipClient == 2)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipClient == 3)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipClient == 4)
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}
