package cptBanc;

import java.util.ArrayList;

public class Banque
{
	private String nom;
	private String adresse;
	private String siret;
	private ArrayList<Client> clients;
	private Compte baseAccount;
	
	public Banque(String nm, String ad, String sir, ArrayList<Client> clts)
	{
		nom = nm;
		adresse = ad;
		siret = sir;
		baseAccount = new Compte();
		setClients(clts);
	}
	
	public void creerCompte(Client clt)
	{
		clt.ajouterCompte(baseAccount.clone());
	}
	
	public Boolean supprCompte(Client clt, Compte cpte)
	{
		if(clt.getArrayComptes().remove(cpte))
		{
			return true;		
		}
		return false;
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

	public String getSiret()
	{
		return siret;
	}

	public void setSiret(String siret)
	{
		this.siret = siret;
	}

	public ArrayList<Client> getClients()
	{
		return clients;
	}

	public void setClients(ArrayList<Client> clients)
	{
		this.clients = clients;
	}
}
