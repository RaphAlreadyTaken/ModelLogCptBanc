package cptBanc;

public abstract class Reseau 
{
	protected double cout;
	private double tauxRembours;
	
	public double getCout() 
	{
		return cout;
	}
	public void setCout(double cout) 
	{
		this.cout = cout;
	}
	
	public double getTauxRembours() 
	{
		return tauxRembours;
	}
	public void setTauxRembours(double tauxRembours) 
	{
		this.tauxRembours = tauxRembours;
	}
}
