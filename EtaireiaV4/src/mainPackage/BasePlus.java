//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public class BasePlus extends Promh8eia
{
	protected int Salary;
	
	public BasePlus(String WName , String WAFM , String WAddress  , int pososto,int Sales,int salary)
	{
		super(WName , WAFM ,WAddress ,pososto, Sales);
		Salary = salary;
	}
	
	public void Print()
	{
		super.Print();
		System.out.println("Mis8os:"+Salary);
	}
	public int getSalary() {
		return this.Salary;
	}
	
	
}
