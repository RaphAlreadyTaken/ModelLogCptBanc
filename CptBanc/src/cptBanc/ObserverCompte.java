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
		System.out.println("Numéro: " + cpte.getNumCompte());
		System.out.println("Solde: " + cpte.getSolde());
		System.out.println("Retrait max: " + cpte.getMontantRetraitMax());
		System.out.println("Découvert autorisé: " + cpte.getDecouvertAutorise());
		System.out.println("Réseau carte: " + cpte.getCartePaiement().getTypeReseau().getClass().getSimpleName());
	}
}