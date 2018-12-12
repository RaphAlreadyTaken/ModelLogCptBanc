package cptBanc;

public class FactoryCarteCredit extends FactoryCarte
{
	@Override
	public Carte createCarte(Reseau typeReseau, Compte account)
	{
		return new CarteCredit(typeReseau, account);
	}

}
