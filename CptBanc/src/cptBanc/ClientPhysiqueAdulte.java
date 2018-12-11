package cptBanc;

import java.time.*;

public class ClientPhysiqueAdulte extends ClientPhysique 
{

	public ClientPhysiqueAdulte(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance) 
	{
		super(nm, ad, ml, tl, tut, dateNaissance);
		successor = null;
	}
	
	public void retirerArgent(Double montant, Compte cpte)
	{
		if(cpte.retirerArgent(new Retrait(montant)))
		{
			this.etat = montant + "€ ont étés retirés du compte."; 
		}
		else
		{
			this.etat = "Impossible de retirer cette somme: decouvert maximum atteint."; 
		}
	}

}
