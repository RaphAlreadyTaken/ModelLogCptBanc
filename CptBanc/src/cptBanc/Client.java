package cptBanc;

import java.util.ArrayList;

public abstract class Client
{
	private static int cptClient = 0;
	
	protected String nom;
	protected String adresse;
	protected String mail;
	protected String tel;
	protected int clientID;
	protected ArrayList<Compte> arrayComptes;
	protected ObserverClient obsC;

	protected String etat;
	
	public Client(String nm, String ad, String ml, String tl)
	{
		nom = nm;
		adresse = ad;
		mail = ml;
		tel = tl;
		clientID = cptClient;
		
		cptClient++;
	}
	
	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
		notifyObserver();
	}

	public String getAdresse()
	{
		return adresse;
	}
	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
		notifyObserver();
	}

	public String getMail()
	{
		return mail;
	}
	public void setMail(String mail)
	{
		this.mail = mail;
		notifyObserver();
	}

	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
		notifyObserver();
	}
	
	public int getClientID()
	{
		return clientID;
	}
	
	public ArrayList<Compte> getArrayComptes()
	{
		return arrayComptes;
	}
	public void setArrayComptes(ArrayList<Compte> arrayComptes) 
	{
		this.arrayComptes = arrayComptes;
	}
	
	public void ajouterCompte(Compte cpte)
	{
		arrayComptes.add(cpte);
	}
	
	public  void deposerArgent(Double montant, Compte cpte)
	{
		cpte.ajouterArgent(new Depot(montant));
		this.etat = montant + "€ ont étés ajoutés sur le compte.";
	}
	
	public abstract void retirerArgent(Double montant, Compte cpte);
	
	public void effectuerPaiement(Compte cpte, Pays country, Double montant)
	{
		Paiement pmnt = new Paiement(montant, country, cpte);
		pmnt.getState().makePayment(pmnt);
	}
	
	public void notifyObserver()
	{
		obsC.update();
	}
}
