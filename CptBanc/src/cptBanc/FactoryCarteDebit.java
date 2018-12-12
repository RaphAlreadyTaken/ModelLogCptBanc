package cptBanc;

public class FactoryCarteDebit extends FactoryCarte
{
	public Carte createCarte(Reseau typeReseau, Compte account, double plafond)
	{		
		return new CarteDebit(typeReseau, account, plafond);
	}

	@Override
	public Carte createCarte(Reseau typeReseau, Compte account)
	{
		return new CarteDebit(typeReseau, account);
	}

}
