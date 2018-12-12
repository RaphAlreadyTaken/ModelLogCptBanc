package cptBanc;

public class FactoryClientMoral extends FactoryClient 
{
	private static FactoryClientMoral instance = null;

	private FactoryClientMoral()
	{		
	}
	
	public static FactoryClientMoral getInstance()
	{
		if(instance == null)
		{
			instance = new FactoryClientMoral();
		}
		return instance;
	}
	
	Client createClient(String nm, String ad, String ml, String tl, String siret, ClientPhysique grt) 
	{
		return new ClientMoral(nm, ad, ml, tl, siret, grt);
	}

}
