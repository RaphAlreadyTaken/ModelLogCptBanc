package cptBanc;

public class FactoryCarteDebit extends FactoryCarte {

	
	public Carte createCarte(Reseau typeReseau, double plafond)
	{		
		return new CarteDebit(typeReseau, plafond);
	}

	@Override
	public Carte createCarte(Reseau typeReseau)
	{
		return new CarteDebit(typeReseau);
	}

}
