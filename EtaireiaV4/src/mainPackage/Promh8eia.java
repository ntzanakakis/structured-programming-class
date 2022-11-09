//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class Promh8eia extends Ergaths
{
	protected int Pososto;
	protected int Sales;
	
	public Promh8eia(String WName , String WAFM , String WAddress , int pososto , int sales)
	{
		super(WName,WAFM,WAddress);
		Pososto = pososto;
		Sales = sales;
	}
	
	
	public void Print()
	{
		super.Print();
		System.out.println("Pososto"+Pososto);
		System.out.println("Pwlhseis"+Sales);
	}
	
	public int getPososto() {
		return this.Pososto;
	}
	public int getSales() {
		return this.Sales;
	}
	
	
}
