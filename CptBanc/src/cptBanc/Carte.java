package cptBanc;

public abstract class Carte 
{
	protected Reseau typeReseau;
	protected ObserverCarte obsC;
	protected Compte account;
	
	public Carte(Reseau typeReseau, Compte account)
	{
		this.typeReseau = typeReseau;
		setAccount(account);
	}

	public Compte getAccount() {
		return account;
	}
	public void setAccount(Compte account) {
		this.account = account;
	}

	public Reseau getTypeReseau() 
	{
		return typeReseau;
	}

	public abstract Boolean modalitePaiement(Paiement pmnt);
	public abstract void debiterCompte(Paiement pmnt);
	
	public void notifyObserver()
	{
		obsC.update();
	}
}
