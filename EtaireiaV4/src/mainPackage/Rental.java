//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class Rental extends Kthria
{
	protected float Rent;
	protected String ExpDate;

	public Rental(String Baddress , int Barea , float rent ,String expDate)
	{
		super(Baddress , Barea);
		Rent = rent;
		ExpDate = expDate;
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("Mis8wma:"+Rent);
		System.out.println("Lh3h:"+ExpDate);
	}
	
	public float getRent() {
		return this.Rent;
	}


	public String getExpDate()
	{
		return this.ExpDate;
	}







}
