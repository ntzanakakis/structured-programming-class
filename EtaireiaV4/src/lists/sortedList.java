//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
//-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ 2013030066 -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\\
package lists;

public class sortedList extends list {
	  public node insert (Item a) {                      
		    node tmp = new node(a);     length++;
		    node n1 = head, n2 = head;

		    
		    while ((n1 != null) && (n1.getValue().less(a) )) {  
		      n2 = n1;   n1 = n1.getNext();  }                          
		    if (n1 == head) {                                                 
		      tmp.setNext(n1); head = tmp;
		    }
		    else {                    
		      n2.setNext(tmp);
		      tmp.setNext(n1);   
		    } 
		    return head;
		  } 


}
