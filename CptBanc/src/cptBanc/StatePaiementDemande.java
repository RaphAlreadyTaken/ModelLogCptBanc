package cptBanc;

public class StatePaiementDemande extends StatePaiement 
{
	@Override
	public void makePayment(Paiement pmnt, Carte cartePaiement)
	{		
		if(cartePaiement.modalitePaiement(pmnt))
		{
			pmnt.setState(new StatePaiementAccepte());
		}
		else
		{
			pmnt.setState(new StatePaiementRefuse());
		}
				
		pmnt.getState().makePayment(pmnt, cartePaiement); //Faire le paiement avec le nouvel état			
	}
}
