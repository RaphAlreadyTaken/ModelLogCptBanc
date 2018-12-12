package cptBanc;

public class ObserverClient extends Observer
{
	private Client clt;
	
	public ObserverClient(Client client)
	{
		clt = client;
	}
	
	public void update()
	{
		System.out.println("Nom: " + clt.getNom());
		System.out.println("Adresse: " + clt.getAdresse());
		System.out.println("Mail: " + clt.getMail());
		System.out.println("Tel: " + clt.getTel());
		System.out.println("Nombre de comptes: " + clt.getArrayComptes().size());
	}
}