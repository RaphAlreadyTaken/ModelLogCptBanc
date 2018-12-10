package cptBanc;

public class FactoryCarteCredit extends FactoryCarte {

	@Override
	public Carte createCarte(Reseau typeReseau)
	{
		return new CarteCredit(typeReseau);
	}

}
