/**
 * Lab 4
 * @Author Shams Ansari
 * Learn about Lists, Stacks and Queues
 *
 * Prof: Manish Goel
 * Class: CIS22C
 * @Date: 2/14/2021
 */
public class LinkNode {

    private USD data;
    private LinkNode next;



    public LinkNode(){
        this(null, null);
    }

    public LinkNode(USD data, LinkNode  next){
        setData(data);
        setNext(next);
    }

    /**
     * Gets the Data of the node
     * @return USD
     */
    public USD getData() {
        return data;
    }

    /**
     * Sets the data for this node
     * @param data A USD object
     */
    public void setData(USD data) {
        this.data = data;
    }

    /**
     * Gets the next Node
     * @return LinkNode
     */
    public LinkNode getNext() {
        return next;
    }

    /**
     * Sets the Next node
     * @param next  next LinkNode
     */
    public void setNext(LinkNode next) {
        this.next = next;
        
    }



}
