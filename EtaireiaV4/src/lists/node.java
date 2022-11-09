//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package lists;

public class node {
	  private Item info;
	  private node next;

	  public node(Item dat) { info = dat; }     
	  public node(Item dat, node b) {
	    info = dat;  next = b;
	  }
		public void print(){
			info.print();
		}

	  public Item     getValue()          { return info;  }   
	  public void     setNext(node a)  { next = a;     }
	  public node    getNext()            { return next; }
}
