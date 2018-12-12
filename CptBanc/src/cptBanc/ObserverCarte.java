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
		System.out.println("R�seau: " + cd.getTypeReseau().getClass().getSimpleName());
		System.out.println("Compte: " + cd.getAccount().getNumCompte());
	}
}
