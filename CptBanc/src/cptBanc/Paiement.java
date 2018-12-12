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
}
