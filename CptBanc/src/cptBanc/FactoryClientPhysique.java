package cptBanc;

import java.time.LocalDate;

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

	Client createClient(String nm, String ad, String ml, String tl, ClientPhysiqueAdulte tut, LocalDate dateNaissance) 
	{		
		return new ClientPhysique(nm, ad, ml, tl, tut, dateNaissance);
	}

}
