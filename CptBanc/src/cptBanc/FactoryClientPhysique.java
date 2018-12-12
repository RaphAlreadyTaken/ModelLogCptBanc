package cptBanc;

import java.time.LocalDate;
import java.time.Period;

public class FactoryClientPhysique extends FactoryClient 
{
	private static FactoryClientPhysique instance = null;

	private FactoryClientPhysique()
	{		
	}
	
	public static FactoryClientPhysique getInstance()
	{
		if(instance == null)
		{
			instance = new FactoryClientPhysique();
		}
		return instance;
	}

	ClientPhysique createClient(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance) 
	{
		LocalDate now = LocalDate.now();		
		Period diff = Period.between(dateNaissance, now); //Différence entre date de naissance et date du jour
		
		if(diff.getYears() < 10) //Si le client a entre 10 et 18
		{
			return new ClientPhysiqueEnfant(nm, ad, ml, tl, tut, dateNaissance);
		}
		else if (diff.getYears() > 10 && diff.getYears() < 18)
		{
			return new ClientPhysiqueAdo(nm, ad, ml, tl, tut, dateNaissance);
		}
		else
		{
			return new ClientPhysiqueAdulte(nm, ad, ml, tl, tut, dateNaissance);
		}
	}
}
