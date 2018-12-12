package cptBanc;

import java.util.ArrayList;
import java.util.HashMap;

public class Compte
{
	private static int cptCompte = 0;

	private int numCompte;
	private double solde;
	private double montantRetraitMax;
	private double decouvertAutorise;
	private Carte cartePaiement;
	private ObserverCompte obsC = new ObserverCompte(this);
	private HashMap <Integer, Memento> sauvegardes;
	private int nbSaves;
	
	ArrayList<OperationCompte> operationArray;
	
	public Compte()
	{
		numCompte = cptCompte;
		solde = 0;
		montantRetraitMax = 200;
		decouvertAutorise = 100;
		setCartePaiement(null);
		nbSaves = 0;
		
		operationArray = new ArrayList<OperationCompte>();
		sauvegardes = new HashMap<Integer, Memento>();
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
		notifyObserver();
	}

	public double getMontantRetraitMax() 
	{
		return montantRetraitMax;
	}
	public void setMontantRetraitMax(double montantRetraitMax) 
	{
		this.montantRetraitMax = montantRetraitMax;
		notifyObserver();
	}

	public double getDecouvertAutorise() 
	{
		return decouvertAutorise;
	}
	public void setDecouvertAutorise(double decouvertAutorise)
	{
		this.decouvertAutorise = decouvertAutorise;
		notifyObserver();
	}
	
	public Carte getCartePaiement() 
	{
		return cartePaiement;
	}
	
	public ArrayList<OperationCompte> getOperationArray() 
	{
		return operationArray;
	}
	
		
	public void ajouterArgent(OperationCompte op)
	{
		ajouterOperation(op);
		this.solde += op.getMontant();
		ajouterSauvegarde();
	}
	
	public Boolean retirerArgent(OperationCompte op)
	{
		double newSolde = this.solde - op.getMontant();
		
		if(newSolde > 0 - this.decouvertAutorise)
		{
			ajouterOperation(op);
			this.solde -= op.getMontant();
			ajouterSauvegarde();
			return true;
		}
		return false;
	}
	
	public void effectuerPaiement(Paiement pmnt)
	{
		this.getCartePaiement().debiterCompte(pmnt);
		ajouterSauvegarde();
	}
	
	public void setCartePaiement(Carte cartePaiement) 
	{
		this.cartePaiement = cartePaiement;
		notifyObserver();
	}
	
	public void notifyObserver()
	{
		obsC.update();
	}
	
	public void ajouterOperation(OperationCompte op)
	{
		operationArray.add(op);
	}
	
	public void terminerToutesOperation()
	{	
		for(OperationCompte op : this.getOperationArray())
		{
			if(op.getClass().getSimpleName() == "Paiement")
			{
				if((((Paiement) op).getState().getClass().getSimpleName()) == "StatePaiementEnCours")
				{
					this.solde -= op.getMontant();
					((Paiement) op).setState(new StatePaiementTermine());
				}
			}
		}
	}
	
	public void ajouterSauvegarde()
	{
		this.sauvegardes.put(nbSaves, new Memento(operationArray));
		nbSaves++;
	}
	
	public void restaurerSauvegarde(int numSave)
	{
		for(OperationCompte op : operationArray)
		{
			if(sauvegardes.get(numSave).getEtat().contains(op) == false)
			{
				op.annulerOperation(this.solde);
			}
		}		
		operationArray = sauvegardes.get(numSave).getEtat();
	}
	
}
