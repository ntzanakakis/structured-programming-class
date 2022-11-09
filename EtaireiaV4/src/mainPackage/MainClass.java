//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package mainPackage;
import tuc.ece.cs102.util.StandardInputRead;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int choice = 0;
		int secondarychoice;
		Etairia comp = new Etairia();
		StandardInputRead sir = new StandardInputRead();
		System.out.println("Dwse to onoma ths etairias.");
		comp.setName(sir.readString(""));
		System.out.println("Dwse to AFM ths etairias.");
		comp.setAFM(sir.readString(""));
		System.out.println("Dwse thn diey8hnsh ths etairias.");
		comp.setAddress(sir.readString(""));
		do
		{
			System.out.println("Kentriko Menu.");
			System.out.println("\t1 : Eisagwgh Akinhtou.");
			System.out.println("\t2 : Eisagwgh Ergazomenou");
			System.out.println("\t3 : Diagrafh Akinhtou");
			System.out.println("\t4 : Diagrafh Ergazomenou.");
			System.out.println("\t5 : Eyresh Ergazomenou.");
			System.out.println("\t6 : Eyresh Akinhtou.");
			System.out.println("\t7 : Ektypwsh olwn stoixeiwn.");
			System.out.println("\t8 : Eidikh Ektypwsh.");
			System.out.println("\t9 : Eksodos");
			choice = sir.readPositiveInt("\n\nDwste thn epilogh sas: ");

			while (choice < 1 || choice >9)
			{
				choice = sir.readPositiveInt("La8os eisodos. Dokimaste ksana.");
			}
				
				if (choice == 1)
				{
					System.out.println("\t1 : Oikopedo.");
					System.out.println("\t2 : Idiokthto Ktisma.");
					System.out.println("\t3 : Enoikiazomeno Ktisma.");
					System.out.println("\t4 : Epistrofh.");
					secondarychoice = sir.readPositiveInt("\n\nDwste thn epilogh sas: ");
					while (secondarychoice <1 || secondarychoice >4)
					{
						secondarychoice = sir.readPositiveInt(" La8os epilogh.Dokimaste 3ana: ");
					}
					if (secondarychoice == 1)
					{
						comp.addAkLand();
					}
					else if(secondarychoice == 3)
					{
						comp.addRental();
					}
					else if(secondarychoice == 2)
					{
						comp.addAkPrivate();
					}
					else
					{
						break;
					}
				}
				else if (choice == 2)
				{
					System.out.println("\t1 : Wromis8io.");
					System.out.println("\t2 : Promh8eia.");
					System.out.println("\t3 : Basiko + Promh8eia.");
					System.out.println("\t4 : Epistrofh.");
					secondarychoice = sir.readPositiveInt("\n\nDwste thn epilogh sas: ");
					while (secondarychoice <1 || secondarychoice >4)
					{
						secondarychoice = sir.readPositiveInt(" La8os epilogh.Dokimaste 3ana: ");
					}
					if (secondarychoice == 1)
					{
						comp.addWraWorker();
					}
					else if(secondarychoice == 2)
					{
						comp.addProErgath();
					}
					else if(secondarychoice == 3)
					{
						comp.addBaseWorker();
					}
					else
					{
						break;
					}
					
				}
				else if (choice == 3)
				{
					comp.GeneralEstDelete();
				}
				else if (choice == 4)
				{
					comp.GeneralErgDelete();
				}
				else if (choice == 5)
				{
					comp.GeneralErgSeek();
				}
				else if (choice == 6)
				{
					comp.GeneralEstSeek();
				}
				else if (choice == 7)
				{
					comp.showCompData();
					comp.GeneralErgPrint();
					comp.GeneralEstPrint();
				}
				else if (choice == 8)
				{
					comp.PrintAllInHierarchy();
				}
				else
				{
					System.out.println("Goodbye.");
				}
	}
	while (choice != 9);
	}
	}


