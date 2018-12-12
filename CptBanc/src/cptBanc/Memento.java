package cptBanc;

import java.util.ArrayList;

public class Memento
{
	private ArrayList<OperationCompte> etat;
	
	public Memento(ArrayList<OperationCompte> state)
	{
		etat = state;
	}
	
	public ArrayList<OperationCompte> getEtat() 
	{
		return etat;
	}

}
