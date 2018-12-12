package cptBanc;

public class ObserverCarte extends Observer
{
	private Carte cd;
	
	public ObserverCarte(Carte card)
	{
		cd = card;
	}
	
	public void update()
	{
		System.out.println("Réseau: " + cd.getTypeReseau().getClass().getSimpleName());
		System.out.println("Compte: " + cd.getAccount().getNumCompte());
	}
}
