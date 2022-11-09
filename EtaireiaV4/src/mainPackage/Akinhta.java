//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public abstract class Akinhta 
{
	protected String Address;
	protected int Area;
	
	public Akinhta(String Baddress ,int Barea)
	{
		Address = Baddress;
		Area = Barea;
	}
	
	public void Print()
	{
		System.out.println("Epifaneia"+Area);
		System.out.println("Diey8hnsh"+Address);
	}
	
	public String getBAddress() 
	{
		return this.Address;
	}

	public int getArea() 
	{
		return this.Area;
	}
}
