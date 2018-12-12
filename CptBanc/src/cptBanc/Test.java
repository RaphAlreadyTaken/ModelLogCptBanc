package cptBanc;

import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Banque bq = new Banque();
		Observer obsB = new ObserverBanque(bq);
		
		bq.setAdresse("test");
		bq.setNom("nouveau nom de banque");
	}
}
