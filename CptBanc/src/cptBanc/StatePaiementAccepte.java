package cptBanc;

public class StatePaiementAccepte extends StatePaiement
{
	@Override
	public void makePayment(Paiement pmnt, Carte cartePaiement)
	{		
		cartePaiement.getAccount().effectuerPaiement(pmnt);
	}
	
	//appeler methode executer paiement
}
