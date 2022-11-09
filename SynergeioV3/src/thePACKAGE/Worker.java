//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package thePACKAGE;

import tuc.ece.cs102.util.StandardInputRead;

public class Worker 
{
	StandardInputRead sir = new StandardInputRead();
	private String LastName;
	private int Charge;
	private int workerID;
	private static int worknumID=6798215;
	
	Worker(String LastName , int Charge)
	{
		this.LastName = LastName;
		this.Charge = Charge;
		workerID=worknumID;
		worknumID++;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getCharge() {
		return Charge;
	}

	public void setCharge(int charge) {
		Charge = charge;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public static int getWorknumID() {
		return worknumID;
	}

	public static void setWorknumID(int worknumID) {
		Worker.worknumID = worknumID;
	}
}
