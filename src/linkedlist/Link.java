
package linkedlist;



/**
 *
 * @author Dillon Davis
 */
public class Link {
    public double data;
    public Link next;
    
    public Link(double data) {
        this.data=data;
        this.next=null;
    }
    
    public String toString() {
        return "" + data;
    }
}
