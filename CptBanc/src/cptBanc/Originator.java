package cptBanc;

import java.util.HashMap;

public class Originator
{
	private HashMap<String, Double> etat;
	
	public Originator()
	{
		etat = new HashMap<String, Double>();
	}
	
	Memento creerMemento()
	{
		return new Memento();
	}
	
	void restaurerMemento()
	{
		
	}
}
