package cptBanc;

public class CarteCredit extends Carte 
{

	public CarteCredit(Reseau typeReseau, Compte account) 
	{
		super(typeReseau, account);		
	}

	@Override
	public Boolean modalitePaiement(Paiement pmnt)
	{
		double pendingSum = 0;
		
		for(OperationCompte op : this.getAccount().getOperationArray())
		{
			if(op.getClass().getSimpleName() == "Paiement")
			{
				if((((Paiement) op).getState().getClass().getSimpleName()) == "StatePaiementEnCours")
				{
					pendingSum += op.getMontant();
				}
			}
		}
		double newSolde = this.getAccount().getSolde() - pmnt.getMontant() - pendingSum;				

		//On vérifie que le paiement est faisable en fonction du découvert autorisé
		if(newSolde > 0 - this.getAccount().getDecouvertAutorise())
		{
			return true;
		}	
		return false;
	}
	
	@Override
	public void debiterCompte(Paiement pmnt) 
	{
		pmnt.setState(new StatePaiementEnCours());		
		this.getAccount().ajouterOperation(pmnt);
	}
}
