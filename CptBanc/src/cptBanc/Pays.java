package cptBanc;

public class Pays 
{
	private String nom;
	private int taillePop;
	private double pib;
	private double taux;
	
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public int getTaillePop() 
	{
		return taillePop;
	}
	public void setTaillePop(int taillePop) 
	{
		this.taillePop = taillePop;
	}
	
	public double getPib() 
	{
		return pib;
	}
	public void setPib(double pib)
	{
		this.pib = pib;
	}
	
	public double getTaux() 
	{
		return taux;
	}
	public void setTaux(double taux)
	{
		this.taux = taux;
	}	
}
