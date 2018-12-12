package cptBanc;

public abstract class Carte 
{
	protected Reseau typeReseau;
	protected ObserverCarte obsC;
	
	public Carte(Reseau typeReseau)
	{
		this.typeReseau = typeReseau;
	}

	public Reseau getTypeReseau() 
	{
		return typeReseau;
	}

	public abstract void debiterCompte(Paiement pmnt);
	
	public void notifyObserver()
	{
		obsC.update();
	}
}
