/**
 * Lab 4
 *
 * @Author Shams Ansari
 * Learn about Lists, Stacks and Queues
 * <p>
 * Prof: Manish Goel
 * Class: CIS22C
 * @Date: 2/14/2021
 *
 * Represents SinglyLinkedList ADT with basic functions
 */
public class SinglyLinkedList<E> extends LinearList<E> {


    public SinglyLinkedList(){

    }

    /**
     * Copy constructor
     * @param list LinearList
     */
    public SinglyLinkedList(LinearList<E> list){
        for(LinkNode<E> node = list.getStart(); node != null; node = node.getNext()){
            append(node.getData());
        }
    }
    /**
     * Adds element to end of list
     * @param element Element to append
     */
    public void append(E element) {
        add(element);
    }

    /**
     * Adds element to start of list
     * @param element element ot append
     */
    public void prepend(E element) {
        insertAfter(null, new LinkNode<E>(element));
    }

    /**
     * Inserts element at specified index, moves subsequent elements to the right
     * @param index index of insertion
     * @param element element to insert
     */
    public void insert(int index, E element) {
        if (index == 0) {
            prepend(element);
        } else if (index == getCount()) {
            add(element);
        } else {
            insertAfter(getNode(index - 1), new LinkNode<>(element));
        }
    }

    /**
     * gets element at specified index
     * @param index [0,size() - 1]
     * @return element at specified index
     */
    public E get(int index) {
        return getNode(index).getData();
    }

    /**
     * Removes element at specified index
     * @param index [0,size() - 1]
     * @return element at the specified index
     */
    public E remove(int index) {
        E data = null;
        if (index == 0) {
            data = remove();
        } else {
            data = removeAfter(getNode(index - 1)).getData();
        }
        return data;
    }

    /**
     * removes node after specified node
     * @param currNode node in list
     * @return node that is removed
     */
    private LinkNode<E> removeAfter(LinkNode<E> currNode) {
        LinkNode<E> node = null;
        //Remove head
        if (currNode == null) {
            node = getStart();
            LinkNode<E> sucNode = node.getNext();
            setStart(sucNode);
            if (sucNode == null) {
                setEnd(null);
            }
        } else {
            node = currNode.getNext();
            LinkNode<E> sucNode = node.getNext();
            currNode.setNext(sucNode);

            if (sucNode == null) {
                setEnd(currNode);
            }

        }
        addCount(-1);
        node.setNext(null);
        return node;
    }

    /**
     * Inserts node after currNode in list
     * @param currNode node in list
     * @param node new node
     */
    private void insertAfter(LinkNode<E> currNode, LinkNode<E> node) {
        if (isEmpty()) {
            setStart(node);
            setEnd(node);
        } else if (currNode == getEnd()) {
            getEnd().setNext(node);
            setEnd(node);
        } else if (currNode == null) {
            node.setNext(getStart());
            setStart(node);
        } else {
            node.setNext(currNode.getNext());
            currNode.setNext(node);
        }

        addCount(1);
    }

    /**
     * Gets node at specified index
     * @param index range=[0, size() - 1]
     * @return node
     */
    private LinkNode<E> getNode(int index) {
        LinkNode<E> node = getStart();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * Checks if two SinglyLinkedLists are equal
     * @param list LinearList
     * @return True if all elements are equal, false otherwise
     */
    @Override
    public boolean equals(LinearList<E> list){
        if(list instanceof SinglyLinkedList){
            return super.equals(list);
        }
        return false;
    }

}
