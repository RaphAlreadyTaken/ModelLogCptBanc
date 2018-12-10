package cptBanc;

public class ClientMoral extends Client
{
	private ClientPhysique garant;
	private String siret;
	
	public ClientMoral(String nm, String ad, String ml, String tl, String siret, ClientPhysique grt)
	{
		super(nm, ad, ml, tl);
		setGarant(grt);
		setSiret(siret);
	}
	
	public ClientPhysique getGarant()
	{
		return garant;
	}

	public void setGarant(ClientPhysique garant)
	{
		this.garant = garant;
	}
	
	public String getSiret() 
	{
		return siret;
	}

	public void setSiret(String siret) 
	{
		this.siret = siret;
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
