//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package thePACKAGE;
import java.util.Date;
public class Repair 
{
	private Vehicle repairedVehicle;
	private Worker repairedWorker;
	private int cost;
	private Date date;
	private Labor listOfLabors[] = new Labor[6];
	
	Repair (Vehicle repairedVehicle , Worker repairedWorker , Labor[] repairedLabor,int cost, Date date)
	{
		this.listOfLabors[6]=null;
		this.repairedVehicle=repairedVehicle;
		this.repairedWorker=repairedWorker;
		this.date=date;
		this.cost=cost;
	}
	
	
	public Vehicle getRepairedVehicle() {
		return repairedVehicle;
	}
	public void setRepairedVehicle(Vehicle repairedVehicle) {
		this.repairedVehicle = repairedVehicle;
	}
	public Worker getRepairedWorker() {
		return repairedWorker;
	}
	public void setRepairedWorker(Worker repairedWorker) {
		this.repairedWorker = repairedWorker;
	}


	public Labor[] getListOfLabors() {
		return listOfLabors;
	}


	public void setListOfLabors(Labor[] listOfLabors) {
		this.listOfLabors = listOfLabors;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public void showRepair()
	{
		System.out.println(date);
		System.out.println("Oxhma: "+repairedVehicle.getLPlate());
		System.out.println("Ergazomenos: "+repairedWorker.getWorkerID());
		int i = 0 ;
		while (listOfLabors[i] !=null)
		{
			System.out.println(listOfLabors[i].getLaborID()+"  "+listOfLabors[i].getLaborName());
		}
		System.out.println("Kostos: "+cost);
		
	}
	
	
	
	
	
}
