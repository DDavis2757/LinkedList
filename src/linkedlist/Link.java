
package linkedlist;



/**
 *
 * @author Dillon Davis
 */
public class Link {
    public int index;
    public double data;
    public Link next;
    
    public Link(int index, double data) {
        this.index=index;
        this.data=data;
        this.next=null;
    }
    
    public String toString() {
        return index + ", " + data;
    }
}
