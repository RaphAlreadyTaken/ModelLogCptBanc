package cptBanc;

import java.util.ArrayList;

public class Compte
{
	private static int cptCompte = 0;

	private int numCompte;
	private double solde;
	private double montantRetraitMax;
	private double decouvertAutorise;
	private Carte cartePaiement;
	private ObserverCompte obsC;
	
	ArrayList<OperationCompte> operationArray;

	public Compte()
	{
		numCompte = cptCompte;
		solde = 0;
		montantRetraitMax = 200;
		decouvertAutorise = 100;
		setCartePaiement(null);
		
		operationArray = new ArrayList<OperationCompte>();
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
	}
	
	public Boolean retirerArgent(OperationCompte op)
	{
		double newSolde = this.solde - op.getMontant();
		
		if(newSolde > 0 - this.decouvertAutorise)
		{
			ajouterOperation(op);
			this.solde -= op.getMontant();
			return true;
		}
		return false;
	}
	
	public void effectuerPaiement(Paiement pmnt)
	{
		this.getCartePaiement().debiterCompte(pmnt);
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
}
