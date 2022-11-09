//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class Wra extends Ergaths
{
	protected int Reward;
	protected int Hours;
	
	
	public Wra( String WName , String WAFM , String WAddress ,  int reward , int hours) 
	{
		super(WName , WAFM , WAddress);
		Reward = reward; 
		Hours = hours;
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("Amoibh"+Reward);
		System.out.println("Wres"+Hours);
	}
	
	public int getReward() 
	{
		return this.Reward;
	}
	public int getHours() 
	{
		return this.Hours;
	}
}
