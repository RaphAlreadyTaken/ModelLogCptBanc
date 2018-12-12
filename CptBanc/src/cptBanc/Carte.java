package cptBanc;

public abstract class Carte 
{
	protected Reseau typeReseau;
	protected Compte account;
	protected ObserverCarte obsC = new ObserverCarte(this);
	
	public Carte(Reseau typeReseau, Compte account)
	{
		this.typeReseau = typeReseau;
		setAccount(account);
	}

	public Compte getAccount()
	{
		return account;
	}
	
	public void setAccount(Compte account)
	{
		this.account = account;
		notifyObserver();
	}

	public Reseau getTypeReseau() 
	{
		return typeReseau;
	}
	
	public double getSommeRemboursement(Paiement pmnt)
	{
		return 0;
	}
	

	public abstract Boolean modalitePaiement(Paiement pmnt);
	public abstract void debiterCompte(Paiement pmnt);
	
	public void notifyObserver()
	{
		obsC.update();
	}
}
