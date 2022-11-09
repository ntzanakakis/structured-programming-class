//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package lists;

import mainPackage.Akinhta;

public class EstItem extends Item {

	public EstItem() 
	{}
		private Akinhta a;
		
		public EstItem(Akinhta a)
		{
			this.a=a;
		}
		public Object key() { return a.getBAddress(); }
		
		   public boolean equals (Item o) 
		   {
		     return key().equals( (String)o.key()); 
		   }

		   public boolean less(Item o) {
			     if ( ((String)key()).compareTo( (String)o.key() ) < 0)    return true;
			     return false;
			   }
			   public String toString() {  
			     return a.toString(); 
			   }
				public void print(){
					a.Print();
				}
	
	}


