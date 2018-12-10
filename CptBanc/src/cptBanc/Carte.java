package cptBanc;

public abstract class Carte 
{
	protected Reseau typeReseau;
	
	public Carte(Reseau typeReseau)
	{
		this.typeReseau = typeReseau;
	}
}
