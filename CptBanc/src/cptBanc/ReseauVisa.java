package cptBanc;

import java.util.HashMap;

public class ReseauVisa extends Reseau 
{
	private HashMap<Pays, Double> tauxHash = new HashMap<Pays, Double>();

	public ReseauVisa()
	{
		setCout(0.25);
		setTauxRembours(0.30);
		
		tauxHash.put(FlyweightPaysFactory.getPays("France"), 0.05);
		tauxHash.put(FlyweightPaysFactory.getPays("Espagne"), 0.10);
		tauxHash.put(FlyweightPaysFactory.getPays("Etats-Unis"), 0.10);
		tauxHash.put(FlyweightPaysFactory.getPays("Portugal"), 0.15);
		tauxHash.put(FlyweightPaysFactory.getPays("Royaume-Uni"), 0.25);
	}
	
	public HashMap<Pays, Double> getTauxHash() 
	{
		return tauxHash;
	}

	public void setTauxHash(HashMap<Pays, Double> tauxHash)
	{
		this.tauxHash = tauxHash;
	}
	
	public double getTauxRembours(Paiement pmnt) 
	{
		if(this.getTauxHash().containsKey(pmnt.getLieu()))
		{
			return this.getTauxHash().get(pmnt.getLieu());
		}
		return tauxRembours;
	}

} 
