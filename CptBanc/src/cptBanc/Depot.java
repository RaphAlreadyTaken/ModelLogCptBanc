package cptBanc;

public class Depot extends OperationCompte 
{
	public Depot(double montant)
	{
		super(montant);
	}

	@Override
	public double annulerOperation(double solde)
	{
		double nouveauSolde = solde - montant;
		return nouveauSolde;
	}
}
