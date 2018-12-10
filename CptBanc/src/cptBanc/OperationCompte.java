package cptBanc;

public abstract class OperationCompte 
{
	double montant;

	public OperationCompte(double montant)
	{
		this.montant = montant;
	}
	
	public double getMontant() 
	{
		return montant;
	}

	public void setMontant(double montant) 
	{
		this.montant = montant;
	}
}
