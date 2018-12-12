package cptBanc;

public class ClientController
{
	public static void callEffectuerPaiement(Client clt, Compte cpte, Pays country, Double montant)
	{
		clt.effectuerPaiement(cpte, country, montant);
	}
	
	public static void callRetirerArgent(Client clt, Compte cpte, Double montant)
	{
		clt.retirerArgent(montant, cpte);
	}
	
	public static void callConsulterSolde(Client clt, Compte cpte)
	{
		clt.consulterSolde(cpte);
	}
}
