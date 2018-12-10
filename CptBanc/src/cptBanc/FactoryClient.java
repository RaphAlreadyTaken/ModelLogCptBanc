package cptBanc;

public abstract class FactoryClient
{
	abstract Client createClient(String nm, String ad, String ml, String tl);
}
