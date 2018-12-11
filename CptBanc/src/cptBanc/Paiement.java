package cptBanc;

public class Paiement extends OperationCompte 
{
	private Pays lieu;
	private StatePaiement state;
	private Compte cpte;
	
	public Paiement(double montant, Pays Lieu, Compte cpte) 
	{
		super(montant);
		setLieu(lieu);
		setState(new StatePaiementDemande());
		setCpte(cpte);
		setMontant(this.montant + (cpte.getCartePaiement().getTypeReseau().getCout() * this.montant)); //Montant total = cout de l'achat + cout du reseau de la carte
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

	public Compte getCpte() 
	{
		return cpte;
	}

	public void setCpte(Compte cpte) 
	{
		this.cpte = cpte;
	}

}
