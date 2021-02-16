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
public class LinkNode<T> {

    private T data;
    private LinkNode next;


    public LinkNode() {
        this(null, null);

    }

    public LinkNode(T data) {
        this(data, null);
    }

    public LinkNode(T data, LinkNode next) {
        setData(data);
        setNext(next);
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
