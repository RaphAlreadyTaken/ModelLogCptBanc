package cptBanc;

public class CarteDebit extends Carte
{	
	public CarteDebit(Reseau typeReseau, Compte account) 
	{
		super(typeReseau, account);			
	}


	@Override
	public Boolean modalitePaiement(Paiement pmnt) 
	{
		double newSolde = this.getAccount().getSolde() - pmnt.getMontant();

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
		pmnt.setState(new StatePaiementTermine());
		this.getAccount().setSolde(this.getAccount().getSolde() - pmnt.getMontant());
		this.getAccount().ajouterOperation(pmnt);
	}

}
