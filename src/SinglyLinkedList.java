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
public class SinglyLinkedList<E> extends LinearList<E> {


    public void append(E element) {
        add(element);
    }

    public void prepend(E element) {
        insertAfter(null, new LinkNode<E>(element));
    }

    public void insert(int index, E element) {
        if (index == 0) {
            prepend(element);
        } else if (index == getCount()) {
            add(element);
        } else {
            insertAfter(getNode(index - 1), new LinkNode<>(element));
        }
    }

    public E get(int index) {
        return getNode(index).getData();
    }

    public E remove(int index) {
        E data = null;
        if (index == 0) {
            data = remove();
        } else {
            data = removeAfter(getNode(index - 1)).getData();
        }
        return data;
    }

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

    private LinkNode<E> getNode(int index) {
        LinkNode<E> node = getStart();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public boolean equals(LinearList<E> list){
        if(list instanceof SinglyLinkedList){
            return super.equals(list);
        }
        return false;
    }

}
