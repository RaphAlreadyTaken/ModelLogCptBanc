package cptBanc;

public class StatePaiementAccepte extends StatePaiement
{
	@Override
	public void makePayment(Paiement pmnt)
	{		
		pmnt.getCpte().getCartePaiement().debiterCompte(pmnt);
	}
}
