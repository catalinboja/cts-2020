package assignment;

public class Cont {
	double	valoare_imprumut,rata;	
	int	zileActiv,tip_cont;
	public static final int	STANDARD=0,BUGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	
	public double imprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoare_imprumut);
		return valoare_imprumut;
	}
	
	public double getRata() {
		System.out.println("Rata este "+rata);
		return this.rata;
	}
	
	//metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return valoare_imprumut*rata;
	}
	
	public void setValoare(double valoare) throws Exception {
		if(valoare<0)
			throw new Exception();
		else
		{
			valoare_imprumut = valoare;
		}
	}
	public String to_string() {
		return "Loan: "+this.valoare_imprumut+"; rate: "+this.rata+"; days active:"+zileActiv+"; Type: "+tip_cont+";";
	}
	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double calculeaza(Cont[]	conturi)
	{
	double comisionTotal=0.0;
	int temp = 365;
	Cont	cont;
	for	(int	i=0;i<conturi.length;i++)	{
	cont=conturi[i];
	if(cont.tip_cont==Account.PREMIUM||cont.tip_cont==Account.SUPER_PREMIUM)	
	comisionTotal+=.0125	*	(	//	1.25%	broker's	fee
			cont.valoare_imprumut*Math.pow(cont.rata,(cont.zileActiv/365)) - cont.valoare_imprumut);	//	interest-principal
	}
	return	comisionTotal;
	}

	public Cont(double valoare, double rata, int tip_cont) throws Exception {
		if(valoare<0)
			throw new Exception();
		else
		{
			valoare_imprumut = valoare;
		}
		this.rata = rata;
		this.tip_cont = tip_cont;
	}
	
	
}
