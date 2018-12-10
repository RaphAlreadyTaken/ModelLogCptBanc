package cptBanc;

public class FactoryClientPhysique extends FactoryClient 
{
	@Override
	Client createClient(String nm, String ad, String ml, String tl) 
	{		
		return null; //new ClientPhysique(nm, ad, ml, tl);
	}

}
