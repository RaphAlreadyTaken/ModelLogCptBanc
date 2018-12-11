package cptBanc;

public abstract class Carte 
{
	protected Reseau typeReseau;
	
	public Carte(Reseau typeReseau)
	{
		this.typeReseau = typeReseau;
	}

	public Reseau getTypeReseau() 
	{
		return typeReseau;
	}

	public abstract void debiterCompte(Paiement pmnt);
	
}
