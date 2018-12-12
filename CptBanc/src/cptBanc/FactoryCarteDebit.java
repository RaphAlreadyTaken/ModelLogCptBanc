package cptBanc;

public class FactoryCarteDebit extends FactoryCarte
{
	@Override
	public Carte createCarte(Reseau typeReseau, Compte account)
	{
		return new CarteDebit(typeReseau, account);
	}

}
