package cptBanc;

public class FactoryClientMoral extends FactoryClient 
{

	@Override
	Client createClient(String nm, String ad, String ml, String tl) 
	{
		return null; //new ClientMoral(nm, ad, ml, tl);
	}

}
