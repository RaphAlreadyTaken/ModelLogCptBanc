package cptBanc;

import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Banque bq = new Banque("BNP", "somewhere", "154984354", null);
		Observer obsB = new ObserverBanque(bq);
		
		
	}
}
