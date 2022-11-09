//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\

package lists;

import mainPackage.Ergaths;

public class ErgathsItem extends Item 
{

	public ErgathsItem() 
	{}
	
		private Ergaths k;
		
		public ErgathsItem(Ergaths k)
		{
			this.k=k;
		}
		public Object key() { return k.getWName(); }
		
		   public boolean equals (Item o) 
		   {
		     return key().equals( (String)o.key()); 
		   }

		 public boolean less(Item o) 
		 {
			 if ( ((String)key()).compareTo( (String)o.key() ) < 0)    return true;
			 return false;
		 }
		 public String toString() 
			   {  
			     return k.toString(); 
			   }
				public void print(){
					k.Print();
				}
	}



