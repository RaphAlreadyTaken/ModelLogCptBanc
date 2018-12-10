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
	}

	public String getAdresse()
	{
		return adresse;
	}

	public void setAdresse(String adresse)
	{
		this.adresse = adresse;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}
	
	public int getClientID()
	{
		return clientID;
	}

	public abstract void ouvrirCompte();
	public abstract void fermerCompte();
	public abstract void deposerArgent(Double montant, Compte cpte);
	public abstract void retirerArgent(Double montant, Compte cpte);
	public abstract void consulterSolde(Compte cpte);
	
}
