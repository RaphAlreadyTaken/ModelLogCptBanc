package cptBanc;

public class Pays 
{
	private String nom;
	
	public Pays(String nom)
	{
		setNom(nom);
	}
	
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	/*private int taillePop;
	private double pib;
	
	public Pays(String nom, int taillePop, double pib)
	{
		setNom(nom);
		setTaillePop(taillePop);
		setPib(pib);
	}
	
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
	}*/
}
