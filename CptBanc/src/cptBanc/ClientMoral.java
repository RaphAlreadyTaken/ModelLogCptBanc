package cptBanc;

public class ClientMoral extends Client
{
	private ClientPhysique garant;
	
	public ClientMoral(String nm, String ad, String ml, String tl, ClientPhysique grt)
	{
		super(nm, ad, ml, tl);
		setGarant(grt);
	}
	
	public ClientPhysique getGarant()
	{
		return garant;
	}

	public void setGarant(ClientPhysique garant)
	{
		this.garant = garant;
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
