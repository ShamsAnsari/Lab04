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


    /**
     * Appends node to list
     *
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
        addCount(1);
    }

    /**
     * Prepends node to list
     *
     * @param node Node to prepend
     */
    public void prepend(LinkNode node) {
        if (getStart() == null) {
            setStart(node);
            setEnd(node);
        } else {
            node.setNext(getStart());
            setStart(node);
        }
        addCount(1);
    }

    /**
     * Inserts newNode after currNode
     *
     * @param currNode Node in list
     * @param newNode  new node to insert
     */
    public void insertAfter(LinkNode currNode, LinkNode newNode) {
        if (getStart() == null) {
            setStart(newNode);
            setEnd(newNode);
        } else if (currNode == getEnd()) {
            getEnd().setNext(newNode);
            setEnd(newNode);
        } else {
            newNode.setNext(currNode.getNext());
            currNode.setNext(newNode);
        }
        addCount(1);
    }

    /**
     * Inserts node after at specified index
     * @param index index to insert
     * @param node node to insert
     */
    public void insert(int index, LinkNode node){

        if(index == 0){
            prepend(node);
        } else if (index == getCount()){
            append(node);
        } else{
            LinkNode prevNode = getStart();
            for(int i = 1; i < index; i++){
                prevNode = prevNode.getNext();
            }
            insertAfter(prevNode , node);
        }


    }

    /**
     * Removes the node that comes after currNode
     *
     * @param currNode the node in the list before the node to remove
     */
    public void removeAfter(LinkNode currNode) {

        //Special case, remove head
        if (currNode == null && getStart() != null) {
            LinkNode sucNode = getStart().getNext();
            setStart(sucNode);

            if (sucNode == null) { //Removed last item
                setEnd(null);
            }
        } else if (currNode != null) {
            LinkNode sucNode = currNode.getNext().getNext();
            currNode.setNext(sucNode);

            if (sucNode == null) { // Removed Tail
                setEnd(null);
            }
        }
        addCount(-1);
    }


    /**
     * Removes listNode at specified index
     *
     * @param index index of node
     */
    public void remove(int index) {

        if (index == 0) {
            removeAfter(null);
            return;
        }

        LinkNode node = getStart();
        for (int i = 1; i < index; i++) {
            node = node.getNext();
        }
        removeAfter(node);


    }

    /**
     * Searches for node with the specified data
     *
     * @param key val to be searched for
     * @return node if found, else null
     */
    public LinkNode search(USD key) {

        LinkNode currNode = getStart();
        while (currNode != null) {
            if (currNode.getData().equals(key)) {
                return currNode;
            }
            currNode = currNode.getNext();
        }
        return null;
    }

    /**
     * Gets the linkNode at the specified index
     *
     * @param index index of node
     * @return LinkNode
     */
    public LinkNode get(int index) {

        LinkNode node = getStart();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * Return the index of the first occurrence of a node with with specified value
     *
     * @param  val val to be search
     * @return index of node or -1 if not found
     */
    public int indexOf(USD val) {
        int i = 0;
        for (LinkNode cnode = getStart(); cnode != null; cnode = cnode.getNext(), i++) {
            if (cnode.getData().equals(val)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the node
     * @param node Node to find index of
     * @return index of node, if node not in list -1
     */
    public int indexOf(LinkNode node){
        int i = 0;
        for (LinkNode cnode = getStart(); cnode != null; cnode = cnode.getNext(), i++) {
            if (node == cnode) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes all elements from list
     */
    public void clear() {
        for (int i = 0; i < getCount(); i++) {
            removeAfter(null);
        }
        setCount(0);
    }

    /**
     * Prints the list
     */
    public void print() {
        System.out.println(this);
    }

    /**
     * Sorts the list with insertion sort.
     */
    public void sort() {
        if (getCount() <= 1) {
            return;
        }
        LinkNode beforeCurr = getStart();
        LinkNode currNode = getStart().getNext();
        while (currNode != null) {
            LinkNode next = currNode.getNext();
            LinkNode position = findInsertionPosition(currNode.getData());

            if (position == beforeCurr) {
                beforeCurr = currNode;
            } else {
                removeAfter(beforeCurr);
                if (position == null) {
                    prepend(currNode);
                } else {
                    insertAfter(position, currNode);
                }
            }
            currNode = next;
        }
    }

    /**
     * Helper method for sort function
     *
     * @param dataVal USD object
     * @return node less than dataval
     */
    private LinkNode findInsertionPosition(USD dataVal) {
        LinkNode prevNode = null;
        LinkNode curNode = getStart();
        while (curNode != null && dataVal.compareTo(curNode.getData()) > 0) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        return prevNode;
    }

    /**
     * Checks if list is empty
     * @return True if count == 0, false otherwise
     */
    public boolean isEmpty() {
        return getCount() == 0;
    }


    /**
     * Sets the number of nodes in this class
     * NOTE: Not to be used by classes outside of List
     *
     * @param count Length of list
     */
    public void setCount(int count) {
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

    public void addCount(int n) {
        setCount(getCount() + n);
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
     * @param start head of list
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
     * @param end tail of list
     */
    public void setEnd(LinkNode end) {
        this.end = end;
    }

    @Override
    public String toString() {
        String out = "[ ";
        for (LinkNode node = getStart(); node != null; node = node.getNext()) {
            out += node.getData() + " ";
        }
        out += "]";
        return out;
    }
}
