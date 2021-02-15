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
public class SinglyLinkedList {
    /**
     * Number of nodes in list
     */
    private int count;

    /**
     * Start of List
     */
    private LinkNode start;

    /**
     * End of List
     */
    private LinkNode end;

    public SinglyLinkedList() {
        setStart(null);
        setEnd(null);
    }


    /**
     * Appends node to list
     * @param node node to append
     */
    public void append(LinkNode node) {
        if (getStart() == null) {
            setStart(node);
            setEnd(node);
        } else {
            getEnd().setNext(node);
            setEnd(node);
        }
    }

    /**
     * Prepends node to list
     *
     * @param node Node to prepend
     */
    public void prepend(LinkNode node) {
        if(getStart() == null){
            setStart(node);
            setEnd(node);
        } else{
            node.setNext(getStart());
            setStart(node);
        }
    }

    /**
     * Return LinkNode at specified index.
     *
     * @param index index of node
     * @return LinkNode at specified index.
     */
    public LinkNode get(int index) {

        LinkNode node = getStart();
        for(int  i = 0; i < index; i++){
            node = node.getNext();
        }
        return node;
    }

    /**
     * Inserts specified node at index
     *
     * @param index
     * @param node
     */
    public void insert(int index, LinkNode node) {
        if(index == 0){
            prepend(node);
        }
        else if (index  == getCount() - 1){
            append(node);
        }
        insertAfter(get(index - 1), node);
    }

    /**
     * Inserts newNode after currNode
     *
     * @param currNode
     * @param newNode
     */
    public void insertAfter(LinkNode currNode, LinkNode newNode) {
        if(getStart() == null){
            setStart(newNode);
            setEnd(newNode);
        }
        else if(currNode == getEnd()){
            getEnd().setNext(newNode);
            setEnd(newNode);
        } else{
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
    }

    /**
     * Replaces the node at the specified index in this list with the specified node.
     *
     * @param index index of node to replace
     * @param node  node to replace current node with
     * @return LinkNode. Returns node that previously occupied index
     */
    public LinkNode set(int index, LinkNode node) {
        LinkNode prev = get(index);
        remove(index);
        insert(index, node);
        return prev;
    }

    /**
     * Removes all elements in list
     */
    public void clear() {
        for(int i = 0; i < getCount(); i++){
            remove(0);
        }

    }



    /**
     * Removes specified LinkNode from list if it exits
     *
     * @param node node to remove
     */
    public void remove(LinkNode node) {
        if(node == getStart()){

        }
    }



    /**
     * Removes LinkNode at specified index
     *
     * @param index index of linkNode
     * @return LinkNode returns node at index
     */
    public LinkNode remove(int index) {

    }


    /**
     * Returns the index of the last occurance of node in the list.
     * -1 if node does not exist in list
     *
     * @param node Node to find index of
     * @return
     */
    public int lastIndexOf(LinkNode node) {
        return 0;
    }

    /**
     * Gets the index of node. If node is not in List returns -1
     *
     * @param node no
     * @return index of node or -1 if node not in list
     */
    public int indexOf(LinkNode node) {
        return 0;
    }

    /**
     * Checks if list is empty
     *
     * @return true if is empty, false otherwise
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Checks if two SinglyLinkedList are equal
     *
     * @return True if they are equal, false otherwise
     */
    public boolean equals() {
        return false;
    }


    /**
     * Sets the number of nodes in this class
     * NOTE: Not to be used by classes outside of List
     *
     * @param count Length of list
     */
    protected void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets number of nodes in list
     *
     * @return Length of list
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets head of list
     *
     * @return first node in list
     */
    public LinkNode getStart() {
        return start;
    }

    /**
     * Sets head node
     *
     * @param start
     */
    public void setStart(LinkNode start) {
        this.start = start;
    }

    /**
     * Gets Tail of list
     *
     * @return Tail of list
     */
    public LinkNode getEnd() {
        return end;
    }

    /**
     * Sets tail of list
     *
     * @param end
     */
    public void setEnd(LinkNode end) {
        this.end = end;
    }

    /**
     * Prints list
     */
    public void print() {

    }

    /**
     * Sorts list
     */
    public void sort() {

    }

    @Override
    public String toString() {
        return "";
    }
}
