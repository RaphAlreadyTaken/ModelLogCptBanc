package cptBanc;

public class BankController
{
	public static void callCompteSuppr(Banque bq, Compte cpt, Client clt)
	{
		bq.supprCompte(clt, cpt);
	}
	
	public static  void callCompteCreation(Banque bq, Client clt)
	{
		bq.creerCompte(clt);
	}
	
}
