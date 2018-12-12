package cptBanc;

public class Paiement extends OperationCompte 
{
	private Pays lieu;
	private StatePaiement state;
	
	public Paiement(double montant, Pays Lieu) 
	{
		super(montant);
		setLieu(lieu);
		setState(new StatePaiementDemande());
	}
	
	public Pays getLieu() 
	{
		return lieu;
	}
	public void setLieu(Pays lieu) 
	{
		this.lieu = lieu;
	}

	public StatePaiement getState()
	{
		return state;
	}
	public void setState(StatePaiement state) 
	{
		this.state = state;
	}
	
	@Override
	public double annulerOperation(double solde)
	{
		if(getState().getClass().getSimpleName() == "StatePaiementEnCours")
		{
			return solde;
		}
		else
		{
			double nouveauSolde = solde + montant;
			return nouveauSolde;
		}
	}
}
