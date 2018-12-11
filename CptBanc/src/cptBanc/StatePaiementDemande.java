package cptBanc;

public class StatePaiementDemande extends StatePaiement 
{
	@Override
	public void makePayment(Paiement pmnt)
	{
		double newSolde = pmnt.getCpte().getSolde() - pmnt.getMontant();

		//On vérifie que le paiement est faisable en fonction du découvert autorisé
		if(newSolde > 0 - pmnt.getCpte().getDecouvertAutorise())
		{
			pmnt.setState(new StatePaiementAccepte());
		}
		else
		{
			pmnt.setState(new StatePaiementRefuse());
		}

		pmnt.getState().makePayment(pmnt); //Faire le paiement avec le nouvel état
				
	}

}
