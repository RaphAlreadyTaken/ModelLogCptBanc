package cptBanc;

import java.time.*;

public class ClientPhysiqueEnfant extends ClientPhysique 
{
	public ClientPhysiqueEnfant(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance) 
	{
		super(nm, ad, ml, tl, tut, dateNaissance);
		successor = new ClientPhysiqueAdo(nom, adresse, mail, tel, tuteur, dateNaissance);
	}
	
	public void retirerArgent(Double montant, Compte cpte)
	{	
		LocalDate now = LocalDate.now();		
		Period diff = Period.between(dateNaissance, now); //Différence entre date de naissance et date du jour
		
		if(diff.getYears() < 10) //Si le client a moins de 10 ans
		{
			this.etat = "Seul votre tuteur peut retirer de l'argent.";
		}
		else
		{
			successor.deposerArgent(montant, cpte);
		}			
	
	}
}
