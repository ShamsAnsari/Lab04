/**
 * Lab 4
 *
 * @Author Shams Ansari
 * Learn about Lists, Stacks and Queues
 * <p>
 * Prof: Manish Goel
 * Class: CIS22C
 * @Date: 2/14/2021
 */
public class LinkNode {

    private USD data;
    private LinkNode next;


    public LinkNode() {
        this(null, null);
    }

    public LinkNode(USD data) {
        this(data, null);
    }

    public LinkNode(USD data, LinkNode next) {
        setData(data);
        setNext(next);
    }

    /**
     * Gets the Data of the node
     *
     * @return USD
     */
    public USD getData() {
        return data;
    }

    /**
     * Sets the data for this node
     *
     * @param data A USD object
     */
    public void setData(USD data) {
        this.data = data;
    }

    /**
     * Gets the next Node
     *
     * @return LinkNode
     */
    public LinkNode getNext() {
        return next;
    }

    /**
     * Sets the Next node
     *
     * @param next next LinkNode
     */
    public void setNext(LinkNode next) {
        this.next = next;

    }

    @Override
    public String toString() {
        String out = "[Data: ";
        if (getData() == null) {
            out += "null";
        } else {
            out += getData();
        }
        out += " Next->";
        if(getNext() == null){
            out += "null";
        } else{
            out += getNext().getData();
        }
        out += "]";
        return out;
    }


}
