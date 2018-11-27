package cptBanc;

import java.util.ArrayList;

public class Banque
{
	private String nom;
	private String adresse;
	private String siret;
	private ArrayList<Client> clients;
	
	public Banque(String nm, String ad, String sir, ArrayList<Client> clts)
	{
		nom = nm;
		adresse = ad;
		siret = sir;
		setClients(clts);
	}
	
	public void creerCompte(Client clt)
	{
	}
	
	public void supprCompte(Client clt)
	{
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
