package cptBanc;

public abstract class Client
{
	private String nom;
	private String adresse;
	private String mail;
	private String tel;
	
	public Client(String nm, String ad, String ml, String tl)
	{
		nom = nm;
		adresse = ad;
		mail = ml;
		tel = tl;
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

	public abstract void ouvrirCompte();
	public abstract void fermerCompte();
	public abstract void deposerArgent(Double montant, Compte cpte);
	public abstract void retirerArgent(Double montant, Compte cpte);
	public abstract void consulterSolde(Compte cpte);
	
}
