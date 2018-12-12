package cptBanc;

public class Retrait extends OperationCompte 
{
	public Retrait(double montant)
	{
		super(montant);
	}
	
	@Override
	public double annulerOperation(double solde)
	{
		double nouveauSolde = solde + montant;
		return nouveauSolde;
	}
}
