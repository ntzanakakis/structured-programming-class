//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package lists;

public class MySortedList extends sortedList 
{
	public MySortedList()
	{
		super();
		
	}
	public void printAllInHierarchy(String given)
	{
		int i = 1;
		System.out.println("Trying to find all objects instance of: " + given);
		for (node tmp =  head; tmp != null; tmp = tmp.getNext())
		{
			try
		    {
				if (Class.forName(given).isInstance(tmp.getValue().getClass()) == true)
				{
					System.out.println("Num. "+i);
		            tmp.getValue().print();
		            i++; 
		        }
		    }
			catch(ClassNotFoundException e) 
			{
				System.out.println("1");
			}
		}
   }
}
