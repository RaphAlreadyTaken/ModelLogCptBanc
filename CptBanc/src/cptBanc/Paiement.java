package cptBanc;

public class Paiement extends OperationCompte 
{
	Pays lieu;
	
	public Paiement(double montant, Pays Lieu) 
	{
		super(montant);
		setLieu(lieu);
	}
	
	public Pays getLieu() 
	{
		return lieu;
	}
	public void setLieu(Pays lieu) 
	{
		this.lieu = lieu;
	}

}
