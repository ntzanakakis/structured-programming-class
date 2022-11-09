//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package thePACKAGE;

import tuc.ece.cs102.util.StandardInputRead;
import java.util.Date;

public class Workshop 
{
	private int i;
	private String fiName;
	private String laName;
	private String address;
	private String wsPhone;
	StandardInputRead input = new StandardInputRead();
	private Labor laborList[] = new Labor[123];
	private int LaborAmount = 0;
	private Worker workerList[] = new Worker[123];
	private int WorkerAmount = 0;
	private Vehicle vehicleList[] = new Vehicle[123];
	private int VehicleAmount = 0;
	private Repair repairList[] = new Repair[123];
	private int RepairAmount = 0;
	
	

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWsPhone() {
		return wsPhone;
	}
	public void setWsPhone(String wsPhone) {
		this.wsPhone = wsPhone;
	}
	public String getFiName() {
		return fiName;
	}
	public void setFiName(String fiName) {
		this.fiName = fiName;
	}
	public String getLaName() {
		return laName;
	}
	public void setLaName(String laName) {
		this.laName = laName;
	}

	public void addLabor()
	{
		if (LaborAmount >=123) 
		{
			System.out.println("Den htan dynath h eisagwgh ergasias(Gemath lista)");
		} 
		else 
		{
			String laborName;
			laborName = input.readString("Dwste to onoma ths ergasias:");
			laborList[LaborAmount] = new Labor(laborName);
			LaborAmount++;

		}
	}
	
	public void ShowLabors()
	{
		if(LaborAmount==0)
			System.out.println("Den yparxoyn ergasies.");
		for(i=0;i<LaborAmount;i++)
		{
			System.out.println(laborList[i].getLaborID()+"   "+laborList[i].getLaborName());
		}
		
	}
	
	public void addWorker()
	{
		if (WorkerAmount >= 123)
			System.out.println("Den htan dynath h eisagwgh ergazomenou(Gemath lista)");
		String LastName ;
		int Charge;
		LastName = input.readString("Dwste to epwnymo tou ergazomenou.");
		Charge = input.readPositiveInt("Dwste thn xrewsh ana wra.");
		workerList[WorkerAmount] = new Worker(LastName , Charge);
		WorkerAmount++;
	}

	public void ShowWorkers()
	{
		if (WorkerAmount==0)
		{
			System.out.println("Den yparxoyn ergazomenoi.");
		}
		for(i=0;i<WorkerAmount;i++)
		{
			System.out.println(workerList[i].getWorkerID()+"   "+workerList[i].getLastName()+"   "+workerList[i].getCharge());
		}
		
	}
	
	private int seekLabor(int ID)
	{
		for(i=0;i<LaborAmount;i++)
			if((laborList[i].getLaborID())== ID)
				return i;
		System.out.println("Den bre8hke tetoia ergasia.");
		return -1;
	}
	
	public void removeLabor()
	{
		ShowLabors();
		if (LaborAmount!=0)
		{
			do
				i = seekLabor(input.readPositiveInt("Dwste ton kwdiko ths ergasias pros afairesh:"));
			while(i==-1);
			laborList[i]=null;
			for (int j=0;j<LaborAmount-1;j++)
				laborList[j]=laborList[j+1];
			laborList[LaborAmount-1]=null;
			LaborAmount--;
		}
	}
	
	private int seekWorker(int ID)
	{
		for(i=0;i<WorkerAmount;i++)
			if((workerList[i].getWorkerID())== ID)
				return i;
		System.out.println("Den bre8hke tetoios ergazomenos.");
		return -1;
	}
	
	
	public void removeWorker()
	{
		ShowWorkers();
		if (WorkerAmount!=0)
		{
			do
				i = seekWorker(input.readPositiveInt("Dwste ton kwdiko tou ergazomenou pros afairesh:"));
			while(i==-1);
			workerList[i]=null;
			for (int j=0;j<WorkerAmount-1;j++)
				workerList[j]=workerList[j+1];
			workerList[WorkerAmount-1]=null;
			WorkerAmount--;
		}
	}
	
	public void addVehicle()
	{
		if (VehicleAmount >= 123)
			System.out.println("Den htan dynath h eisagwgh oxhmatos(Gemath lista)");
		String LastName , LPlate , Phone;
		LastName = input.readString("Dwste to epwnymo tou idiokthth.");
		LPlate = input.readString("Dwste thn pinakida tou oxhmatos.");
		Phone = input.readString("Dwste to thlefwno tou idiokthth.");
		vehicleList[VehicleAmount] = new Vehicle(LPlate , LastName , Phone);
		VehicleAmount++;
	}
	
	public void showVehicle()
	{
		if (VehicleAmount==0)
		{
			System.out.println("Den yparxoyn oxhmata.");
		}
		for(i=0;i<VehicleAmount;i++)
		{
			System.out.println(vehicleList[i].getLPlate()+"   "+vehicleList[i].getOwnerLaName()+"   "+vehicleList[i].getOwnerPhone());
		}
	}
	
	public void removeVehicle()
	{
		showVehicle();
		if (VehicleAmount!=0)
		{
			do
				i = seekVehicle(input.readString("Dwste thn pinakida toy oxhmatos pros afairesh:"));
			while(i==-1);
			vehicleList[i]=null;
			for (int j=0;j<VehicleAmount-1;j++)
				vehicleList[j]=vehicleList[j+1];
			vehicleList[VehicleAmount-1]=null;
			VehicleAmount--;
		}
	}
	
	public int seekVehicle(String LPlate)
	{
		for(i=0;i<VehicleAmount;i++)
			if((vehicleList[i].getLPlate()).equals(LPlate))
				return i;
		System.out.println("Den bre8hke tetoio oxhma.");
		return -1;
	}
	
	public void addRepair()
	{
		if (RepairAmount >= 123)
			System.out.println("Den htan dynath h eisagwgh episkeyhs(Gemath lista)");
			int selLabor;
			int selWorker;
			int selVehicle;
			Date date;
			Labor labors[] = new Labor[6];
			int Cost=0;
			int[] Duration = new int[6];
			int c,count=1,i=0,w;
			boolean stop = false;
			if(VehicleAmount!=0 && WorkerAmount != 0 && LaborAmount!=0)
			{
				ShowLabors();
				if (LaborAmount==0)
					return;
				System.out.println("Dialekste ergasia.");
				while (stop!= true)
				{
					i++;
					
					do
						selLabor=seekLabor(input.readPositiveInt("Dwste ton kwdiko ths ergasias."));
					while(selLabor==-1);
					Duration[i] = input.readPositiveInt("Dwste diarkeia ");
					labors[i]=laborList[selLabor];
					if(count==5)
					{
						stop=true;
					}
					if(stop == false)
					{
						w=input.readPositiveInt("Gia eksodo pathste 0.Gia synexeia ena tyxaio noumero.(max 5))");
						if(w==0)
							stop=true;
					}
				}
				showVehicle();
				do
					selVehicle=seekVehicle(input.readString("Dwste thn pinakida toy oxhmatos gia eisagwgh"));
				while(selVehicle==-1);
				do
					selWorker=seekWorker(input.readPositiveInt("Dwste ton kwdiko toy ergazomenou gia pros8hkh."));
				while ( selWorker==-1);
				do
					date=input.readDate("Dwste hmeromhnia(dd/mm/yyyy)");
				while (date==null);
				for (c=0;c<i;c++)
				{
					Cost =Duration[c] * (workerList[selWorker].getCharge());
				}
				repairList[RepairAmount] = new Repair(vehicleList[selVehicle] , workerList[selWorker] , labors , Cost , date );
				RepairAmount++;
				System.out.println("H episkeyh proste8hke.");
			}
	}
	
	public void showRepairs()
	{
		if (RepairAmount == 0)
			System.out.println("Den yparxoyn episkeyes.");
		for(i=0;i<RepairAmount;i++)
		{
			System.out.println("Noumero: "+i);
			repairList[i].showRepair();
			System.out.println("\n\n");
		}
	}
	
	
	

}
