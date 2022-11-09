//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\

package thePACKAGE;

import tuc.ece.cs102.util.StandardInputRead;

public class Labor 
{
	StandardInputRead sir = new StandardInputRead();
	private String laborName;
	private int laborID;
	private static int numID=042014;
	
	
	Labor (String laborName)
	{
		this.laborName=laborName;
		laborID=numID;
		numID++;
		
	}
	
	public String getLaborName() {
		return laborName;
	}
	public void setLaborName(String laborName) {
		this.laborName = laborName;
	}
	public int getLaborID() {
		return laborID;
	}
	public void setLaborID(int laborID) {
		this.laborID = laborID;
	}
	
}
