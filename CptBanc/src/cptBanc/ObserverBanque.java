package cptBanc;

public class ObserverBanque extends Observer
{
	private Banque bk;
	
	public ObserverBanque(Banque bank)
	{
		bk = bank;
	}
	
	public void update()
	{
		System.out.println("Nom: " + bk.getNom());
		System.out.println("Adresse: " + bk.getAdresse());
		System.out.println("Siret: " + bk.getSiret());
		System.out.println("Nombre de clients: " + bk.getClients().size());
	}
}