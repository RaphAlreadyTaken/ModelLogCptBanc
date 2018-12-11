package cptBanc;

import java.time.*;

public class ClientPhysiqueAdo extends ClientPhysique 
{
	public ClientPhysiqueAdo(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance) 
	{
		super(nm, ad, ml, tl, tut, dateNaissance);
		successor = new ClientPhysiqueAdulte(nom, adresse, mail, tel, tuteur, dateNaissance);
	}
	
	public void retirerArgent(Double montant, Compte cpte)
	{
		LocalDate now = LocalDate.now();		
		Period diff = Period.between(dateNaissance, now); //Diff�rence entre date de naissance et date du jour
		
		if(diff.getYears() > 10 && diff.getYears() < 18) //Si le client a entre 10 et 18
		{
			if(montant <= cpte.getMontantRetraitMax())
			{
				if(cpte.retirerArgent(new Retrait(montant)))
				{
					this.etat = montant + "� ont �t�s retir�s du compte."; 
				}
				else
				{
					this.etat = "Impossible de retirer cette somme: decouvert maximum atteint."; 
				}
			}
			else
			{
				this.etat = "Impossible de retirer cette somme: somme sup�rieure au retrait maximum."; 
			}
		}
		else
		{
			successor.deposerArgent(montant, cpte);
		}			
	}

}
