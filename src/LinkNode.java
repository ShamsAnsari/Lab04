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
public class LinkNode<E> {

    private E data;
    private LinkNode next;


    public LinkNode() {
        this(null, null);

    }

    public LinkNode(E data) {
        this(data, null);
    }

    public LinkNode(E data, LinkNode next) {
        setData(data);
        setNext(next);
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkNode<E> getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
