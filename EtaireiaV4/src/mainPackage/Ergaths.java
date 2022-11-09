//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

public abstract class Ergaths 
{
	protected String WName;
	protected String WAFM;
	protected String WAddress;
	
	public Ergaths(String wname, String wafm , String waddress)
	{
		WName = wname;
        WAFM = wafm;
        WAddress = waddress;
    }
	public Ergaths()
	{
		WName = null;
        WAFM = null;
        WAddress = null;
	}

	public void Print()
	{
		System.out.println("Onomatepwnymo:"+WName);
		System.out.println("AFM:"+WAFM);
		System.out.println("Diey8hnsh:"+WAddress);
	}
	    
    
    public String getWName(){return WName;}
    public String getWAFM(){return WAFM;}
    public String getWAddress(){return WAddress;}
}
