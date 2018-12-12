package cptBanc;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		FactoryClientPhysique factCP = FactoryClientPhysique.getInstance();
		FactoryClientMoral factCM = FactoryClientMoral.getInstance();
		
		Banque bq = new Banque("BNP", "1, rue du truc", "0132456", new ArrayList<Client>());
		Observer obsB = new ObserverBanque(bq);
		
		//Physique
		ClientPhysique fox = bq.creerClientPhysique("Fox", "?", "?", "0022446688", null, LocalDate.parse("01.12.2000", DateTimeFormatter.ofPattern("dd.MM.uuuu")));
		//Enfant
		ClientPhysique rob = factCP.createClient("rob", "nowhere", "noone@nothing.null", "0000000000", null, LocalDate.parse("01.12.2010", DateTimeFormatter.ofPattern("dd.MM.uuuu")));		
		//Ado
		ClientPhysique james = factCP.createClient("james", "nowhereToo", "noone@nothingnothing.null", "1111111111", null, LocalDate.parse("01.12.2005", DateTimeFormatter.ofPattern("dd.MM.uuuu")));	
		//Adulte
		ClientPhysique john = factCP.createClient("John", "0, rue de null", "john.doe@truc.com", "0011223344", null, LocalDate.parse("01.12.2000", DateTimeFormatter.ofPattern("dd.MM.uuuu")));
		
		fox.setSuccessor((ClientPhysiqueEnfant) rob);
		((ClientPhysiqueEnfant) rob).setSuccessor((ClientPhysiqueAdo) james);
		((ClientPhysiqueAdo) james).setSuccessor((ClientPhysiqueAdulte) john);
		
		Compte cpt = new Compte();
		Observer obsC = new ObserverClient(fox);
		
		//"Interface" application
		while (true)
		{
			System.out.println("Bienvenue dans le logiciel de gestion");
			System.out.println("1- Méthodes de banque");
			System.out.println("2- Méthodes de client");
			
			
			String firstStep;
			Scanner S = new Scanner(System.in);
			firstStep = S.next();
			
			if (firstStep.equals("1"))
			{				
				while (true)
				{
					System.out.println("Bienvenue dans la banque " + bq.getNom());
					System.out.println("1- Supprimer un compte");
					System.out.println("2- Créer un compte");
					
					String secondStep;
					Scanner S2 = new Scanner(System.in);
					secondStep = S2.next();
					
					if (secondStep.equals("1"))
					{
						BankController.callCompteSuppr(bq, cpt, fox);
					}
					else if (secondStep.equals("2"))
					{
						BankController.callCompteCreation(bq, fox);
					}
					else if(secondStep.equals("exit"))
					{
						S2.close();
						return;
					}
					else
					{
						S2.close();
						continue;
					}
				}
			}
			else if (firstStep.equals("2"))
			{
				while(true)
				{
					System.out.println("Bienvenue chez le client " + fox.getNom());
					System.out.println("1- Effectuer un paiement");
					System.out.println("2- Effectuer un retrait");
					System.out.println("3- Consulter le solde");
					
					String secondStep;
					Scanner S2 = new Scanner(System.in);
					secondStep = S2.next();
					
					if (secondStep.equals("1"))
					{
						System.out.print("Choisir un montant: ");
						
						String thirdStep;
						Scanner S3 = new Scanner(System.in);
						thirdStep = S3.next();
						Double montant = Double.parseDouble(thirdStep);
						
						ClientController.callEffectuerPaiement(fox, cpt, FlyweightPaysFactory.getPays("France"), montant);
					}
					else if (secondStep.equals("2"))
					{
						System.out.print("Choisir un montant: ");
						
						String thirdStep;
						Scanner S3 = new Scanner(System.in);
						thirdStep = S3.next();
						Double montant = Double.parseDouble(thirdStep);
						
						ClientController.callRetirerArgent(fox, cpt, montant);
					}
					else if (secondStep.equals("3"))
					{
						ClientController.callConsulterSolde(fox, cpt);
					}
					else if(secondStep.equals("exit"))
					{
						S2.close();
						return;
					}
					else
					{
						S2.close();
						continue;
					}
				}
			}
		}
	}
}