package cptBanc;

public class Compte
{
	private static int cptCompte = 0;

	private int numCompte;
	private double solde;
	private double montantRetraitMax;
	private double decouvertAutorise;
	
	public Compte()
	{
		numCompte = cptCompte;
		solde = 0;
		montantRetraitMax = 200;
		decouvertAutorise = 100;
		
		cptCompte++;
	}
	
	@Override
	public Compte clone()
	{
		return new Compte();
	}
	
	public int getNumCompte() 
	{
		return numCompte;
	}

	public double getSolde() 
	{
		return solde;
	}

	public void setSolde(double solde) 
	{
		this.solde = solde;
	}

	public double getMontantRetraitMax() 
	{
		return montantRetraitMax;
	}

	public void setMontantRetraitMax(double montantRetraitMax) 
	{
		this.montantRetraitMax = montantRetraitMax;
	}

	public double getDecouvertAutorise() 
	{
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise)
	{
		this.decouvertAutorise = decouvertAutorise;
	}
	
}
