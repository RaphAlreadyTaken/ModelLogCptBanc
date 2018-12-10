package cptBanc;

public class CarteDebit extends Carte
{
	private double plafond;
	
	public CarteDebit(Reseau typeReseau, double plafond) 
	{
		super(typeReseau);		
		this.setPlafond(plafond);
	}
	
	public CarteDebit(Reseau typeReseau) 
	{
		super(typeReseau);		
		this.setPlafond(200);
	}

	public double getPlafond() 
	{
		return plafond;
	}

	public void setPlafond(double plafond)
	{
		this.plafond = plafond;
	}

}
