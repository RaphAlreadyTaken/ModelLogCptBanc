package cptBanc;

import java.time.*;

public class ClientPhysique extends Client
{
	protected ClientPhysiqueAdulte tuteur;
	protected LocalDate dateNaissance;
	protected ClientPhysique successor;
	
	public ClientPhysique(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance)
	{
		super(nm, ad, ml, tl);
		setTuteur(tut);
		setDateNaissance(dateNaissance);
		successor = new ClientPhysiqueEnfant(nom, adresse, mail, tel, tuteur, dateNaissance);
	}
	
	ClientPhysique getSuccessor()
	{
		return this.successor;
	}
	
	public ClientPhysiqueAdulte getTuteur()
	{
		return tuteur;
	}
	
	public LocalDate getDateNaissance()
	{
		return this.dateNaissance;
	}
	
	public void setDateNaissance(LocalDate date)
	{
		this.dateNaissance = date;
	}

	public void setTuteur(ClientPhysiqueAdulte tuteur)
	{
		this.tuteur = tuteur;
	}

	public void ouvrirCompte()
	{	
		
	}
	
	public void fermerCompte()
	{	
		
	}

	public void retirerArgent(Double montant, Compte cpte)
	{
		successor.retirerArgent(montant, cpte);
	}
	
	public void consulterSolde(Compte cpte)
	{
		
	}
}
