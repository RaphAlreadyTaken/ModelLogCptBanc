package cptBanc;

public abstract class Reseau 
{
	protected double cout;
	protected double tauxRembours;
	private ObserverReseau obsR = new ObserverReseau(this);
	
	public double getCout() 
	{
		return cout;
	}
	public void setCout(double cout) 
	{
		this.cout = cout;
		notifyObserver();
	}
	
	public double getTauxRembours() 
	{
		return tauxRembours;
	}
	
	public double getTauxRembours(Paiement pmnt) 
	{
		return tauxRembours;
	}
	
	public void setTauxRembours(double tauxRembours) 
	{
		this.tauxRembours = tauxRembours;
		notifyObserver();
	}
	
	public void notifyObserver()
	{
		obsR.update();
	}
}
