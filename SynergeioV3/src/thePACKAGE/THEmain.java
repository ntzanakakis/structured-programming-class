//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package thePACKAGE;

import tuc.ece.cs102.util.*;

public class THEmain {

	
	public static void main(String[] args) 
	{
		int choice = 0;
		int secondarychoice;
		Workshop shop = new Workshop();
		StandardInputRead sir = new StandardInputRead();
		System.out.println("Leitourgoun oles oi loitourgeies pou den exoun na kanoun me thn episkeyh!");
		do
		{
			System.out.println("Kentriko Menu.");
			System.out.println("\t1 : Eisagwgh Synergeiou. ");
			System.out.println("\t2 : Eisagwgh Ergasias.");
			System.out.println("\t3 : Eisagwgh Ergazomenou.");
			System.out.println("\t4 : Eisagwgh Oxhmatos.");
			System.out.println("\t5 : Eisagwgh Episkeyhs.(not implemented / throws exception(array violation))");//einai h trith fora pou grafw to programma kai mou bghke pali la8os.
			System.out.println("\t6 : Diagrafh antikeimenou");
			System.out.println("\t7 : Eyresh episkeywn(not implemented).");//adynato xwris to 5
			System.out.println("\t8 : Ektypwsh.");
			System.out.println("\t9 : Eksodos");
			choice = sir.readPositiveInt("\n\nDwste thn epilogh sas: ");

			while (choice < 1 || choice >9)
			{
				choice = sir.readPositiveInt("La8os eisodos. Dokimaste ksana.");
			}
				if (choice == 1)
				{
					System.out.println("Dwse to onoma toy idiokthth.");
					shop.setFiName(sir.readString(""));
					System.out.println("Dwse to epwnymo toy idiokthth.");
					shop.setLaName(sir.readString(""));
					System.out.println("Dwse thn diey8hnsh toy synergeiou.");
					shop.setAddress(sir.readString(""));
					System.out.println("Telos dwse to thlefwno toy.");
					shop.setWsPhone(sir.readString(""));
					System.out.println("To synergeio proste8hke.");
					
				}
				else if (choice == 2)
				{
					shop.addLabor();
					System.out.println("H ergasia proste8hke.");
					
					
				}
				else if (choice == 3)
				{
					shop.addWorker();
					System.out.println("O ergazomenos proste8hke");
					
				}
				else if (choice == 4)
				{
					shop.addVehicle();
					System.out.println("To oxhma proste8hke.");
					
				}
				else if (choice == 5)
				{
					shop.addRepair();
				}
				else if (choice == 6)
				{
					System.out.println("Dialekste stoixeio pros diagrafh:");
					System.out.println("1) Ergasia");
					System.out.println("2) Ergazomeno");
					System.out.println("3) Oxhma");
					System.out.print("4) Episkeyh:(not implemented)");
					do
						secondarychoice = sir.readPositiveInt("");
					while(secondarychoice<0 || secondarychoice>5);
					if (secondarychoice==1)
					{
						shop.removeLabor();
					}
					else if (secondarychoice==2)
					{
						shop.removeWorker();
					}
					else if (secondarychoice==3)
					{
						shop.removeVehicle();
					}
					else
					{
						
					}
				}
				else if (choice == 7)
				{
					
				}
				else if (choice == 8)
				{
					System.out.println("Ti 8elete na emfanisete?");
					System.out.println("1)Ergasies.");
					System.out.println("2)Ergazomenou.");
					System.out.println("3)Oxhmata.");
					System.out.println("4)Episkeyes.(not implemented)");
					do
					{
						secondarychoice = sir.readPositiveInt("");
					}
					while(secondarychoice<=0 || secondarychoice>4);
					if (secondarychoice==1)
					{
						shop.ShowLabors();
					}
					else if (secondarychoice==2)
					{
						shop.ShowWorkers();
					}
					else if(secondarychoice==3)
					{
						shop.showVehicle();
					}
					else
					{
						
					}
				}
				else
				{
					System.out.println("Goodbye.");
				}
	}
	while (choice != 9);
	}

	
	
	
}
