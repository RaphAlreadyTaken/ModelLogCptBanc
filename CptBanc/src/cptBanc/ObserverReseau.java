package cptBanc;

public class ObserverReseau extends Observer
{
	private Reseau res;
	
	public ObserverReseau(Reseau network)
	{
		res = network;
	}
	
	public void update()
	{
		System.out.println("Coût d'utilisation: " + res.getCout());
		System.out.println("Taux de remboursement: " + res.getTauxRembours());
	}
}