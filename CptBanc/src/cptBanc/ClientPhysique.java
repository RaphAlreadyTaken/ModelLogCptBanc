package cptBanc;

public class ClientPhysique extends Client
{
	private ClientPhysique tuteur;
	
	public ClientPhysique(String nm, String ad, String ml, String tl, ClientPhysique tut)
	{
		super(nm, ad, ml, tl);
		setTuteur(tut);
	}
	
	public ClientPhysique getTuteur()
	{
		return tuteur;
	}

	public void setTuteur(ClientPhysique tuteur)
	{
		this.tuteur = tuteur;
	}

	public void ouvrirCompte()
	{	
		
	}
	
	public void fermerCompte()
	{	
		
	}
	
	public void deposerArgent(Double montant, Compte cpte)
	{
			
	}

	public void retirerArgent(Double montant, Compte cpte)
	{	
		
	}
	
	public void consulterSolde(Compte cpte)
	{
		
	}
}
