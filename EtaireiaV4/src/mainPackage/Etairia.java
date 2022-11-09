//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;

import lists.ErgathsItem;
import lists.EstItem;
import lists.node;
import lists.MySortedList;
import tuc.ece.cs102.util.*;

public class Etairia 
{
	
	private String Name;
	private String AFM;
	private String Address;
	private MySortedList ErgathsList = new MySortedList();
	private MySortedList EstList = new MySortedList();
	StandardInputRead sir = new StandardInputRead();
	
	
	
	private Wra wErg;
	private Promh8eia wPro;
	private BasePlus wBase;
	private Land akLand;
	private Rental akRental;
	private Prive akPrive;
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAFM() {
		return AFM;
	}
	public void setAFM(String afm) {
		AFM = afm;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public void showCompData()
	{
		System.out.println("Stoixeia etairias.\n" +"Onoma: " + Name +"\nAFM: " + AFM + "\nDiey8hnsh: " + Address);
	}
	public void addWraWorker()
	{
		 String Name;
		 String	AFM;
		 String Address;
		 int reward;
		 int hours;
		 Name = sir.readString("Dwse to onomatepwnymo toy ergazomenou:");
		 AFM = sir.readString("Dwse to AFM toy ergazomenou:");
		 reward = sir.readPositiveInt("Dwse thn wriaia amoibh toy ergazomenou:");
		 hours = sir.readPositiveInt("Dwse tis wres poy doulepse o ergazomenos:");
		 Address = sir.readString("Dwse thn diey8hnsh toy ergazomenou.");
		 wErg = new Wra(Name , AFM ,Address,reward , hours );
		 ErgathsList.insert(new ErgathsItem(wErg));
	}

	public void addProErgath()
	{
		 String Name;
		 String	AFM;
		 String Address;
		 int pososto;
		 int sales;
		 Name = sir.readString("Dwse to onomatepwnymo toy ergazomenou:");
		 AFM = sir.readString("Dwse to AFM toy ergazomenou:");
		 Address = sir.readString("Dwse thn diey8hnsh toy ergazomenou.");
		 pososto = sir.readPositiveInt("Dwse to pososto promh8eias poy pairnei:");
		 sales = sir.readPositiveInt("Dwse tis polhseis poy ekane:");
		 wPro = new Promh8eia(Name , AFM ,Address,pososto , sales);
		 ErgathsList.insert(new ErgathsItem(wPro));
	}

	public void addBaseWorker()
	{
		 String Name;
		 String	AFM;
		 String Address;
		 int pososto;
		 int Sales;
		 int salary;
		 Name = sir.readString("Dwse to onomatepwnymo toy ergazomenou:");
		 AFM = sir.readString("Dwse to AFM toy ergazomenou:");
		 Address = sir.readString("Dwse thn diey8hnsh toy ergazomenou.");
		 pososto = sir.readPositiveInt("Dwse to pososto promh8eias poy pairnei:");
		 salary = sir.readPositiveInt("Dwse ton basiko mis8o toy ergazomenou:");
		 Sales = sir.readPositiveInt("Dwse tis pwlhseis:");
		 wBase = new BasePlus(Name , AFM ,Address , pososto ,Sales, salary);
		 ErgathsList.insert(new ErgathsItem(wBase));
	}
	
	public void GeneralErgPrint()
	{
		ErgathsList.print();
	}

	public void addAkLand()
	{
		String AkAddress;
		int Area;
		float syntelesths;
		AkAddress = sir.readString("Dwse thn diay8hnsh toy ktiriou.");
		Area = sir.readPositiveInt("Dwse ta tetragwnika toy ktiriou.");
		syntelesths = sir.readPositiveFloat("Dwse ton Syntelesth.");
		akLand = new Land(AkAddress , Area , syntelesths);
		EstList.insert(new EstItem(akLand));
	}

	public void addRental()
	{
		String AkAddress;
		int Area;
		float Rent;
		String ExpDate;
		AkAddress = sir.readString("Dwse thn diay8hnsh toy oikopedou.");
		Area = sir.readPositiveInt("Dwse ta tetragwnika toy oikopedou.");
		Rent = sir.readPositiveFloat("Dwse to mis8wma.");
		ExpDate = sir.readString("Dwse thn hmeromhnia lh3hs toy symbolaiou.");
		akRental = new Rental(AkAddress , Area , Rent , ExpDate);
		EstList.insert(new EstItem(akRental));
	}
	
	public void addAkPrivate()
	{
		String AkAddress;
		int Area;
		int value;
		AkAddress = sir.readString("Dwse thn diay8hnsh toy ktiriou.");
		Area = sir.readPositiveInt("Dwse ta tetragwnika toy ktiriou.");
		value = sir.readPositiveInt("Dwse thn a3ia toy ktiriou.");
		akPrive = new Prive(AkAddress , Area,value);
		EstList.insert(new EstItem(akPrive));
	}
	
	public void GeneralEstPrint()
	{
		EstList.print();
	}
	
	public node GeneralErgSeek()
	{
		StandardInputRead sir = new StandardInputRead();
		String name=sir.readString("Dwse to onomatepwnymo toy ergath:");
		node n=ErgathsList.search(name);
		if(n==null)
			System.out.println("Den yparxei tetoios ergazomenos : "+ name);
		else
			n.getValue().print();
		return n;
		
	}
	
	public void GeneralErgDelete()
	{
		node n= GeneralErgSeek();
		ErgathsList.delete(n.getValue());
	}
	
	public node GeneralEstSeek()
	{
		StandardInputRead sir = new StandardInputRead();
		String Address = sir.readString("Dwse thn diey8hnsh toy akinhtou:");
		node n = EstList.search(Address);
		if(n==null)
			System.out.println("Den yparxei tetoios ergazomenos : "+ n);
		else
			n.getValue().print();
		return n;
	}

	public void GeneralEstDelete()
	{
		node n= GeneralErgSeek();
		EstList.delete(n.getValue());
	}

	public void PrintAllInHierarchy()
	{
		String given = sir.readString("Dwse to onoma ths class.");
		ErgathsList.printAllInHierarchy(given);
		EstList.printAllInHierarchy(given);
	}

}

	










