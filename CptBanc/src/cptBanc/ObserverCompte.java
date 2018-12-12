package cptBanc;

public class ObserverCompte extends Observer
{
	private Compte cpte;
	
	public ObserverCompte(Compte account)
	{
		cpte = account;
	}
	
	public void update()
	{
		System.out.println("Num�ro: " + cpte.getNumCompte());
		System.out.println("Solde: " + cpte.getSolde());
		System.out.println("Retrait max: " + cpte.getMontantRetraitMax());
		System.out.println("D�couvert autoris�: " + cpte.getDecouvertAutorise());
		System.out.println("R�seau carte: " + cpte.getCartePaiement().getTypeReseau().getClass().getSimpleName());
	}
}