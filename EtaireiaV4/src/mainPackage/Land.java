//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class Land extends Akinhta
{
	protected float Syntelesths;
	protected float key;
	
	public Land(String Baddress , int Barea , float syntelesths)
	{
		super(Baddress , Barea);
		Syntelesths = syntelesths;
	}

	public void Print()
	{
		super.Print();
		System.out.println("Syntelesths"+Syntelesths);
	}
	public float getSyntelesths() {
		return this.Syntelesths;
	}






}
