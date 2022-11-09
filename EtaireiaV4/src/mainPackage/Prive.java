//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class Prive extends Kthria
{
	protected int Value;
	
	public Prive (String Baddress , int Barea , int value)
	{
		super( Baddress , Barea );
		Value = value;
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("A3ia:"+Value);
	}

	public int getValue() {
		return this.Value;
	}


}
