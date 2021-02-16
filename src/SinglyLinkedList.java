import java.util.Comparator;

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
        LinkNode<E> node = new LinkNode<>(element);
        if (isEmpty()) {
            setStart(node);
            setEnd(node);
        } else {
            node.setNext(getStart());
            setStart(node);
        }
        addCount(1);
    }


    public void insert(int index, E element) {
        if (index == 0) {
            prepend(element);
        } else if (index == getCount()) {
            add(element);
        } else {
            LinkNode<E> node = new LinkNode<>(element);
            LinkNode<E> prevNode = getNode(index - 1);
            LinkNode<E> sucNode = prevNode.getNext();
            prevNode.setNext(node);
            prevNode.setNext(node);
            addCount(1);
        }
    }

    public E get(int index) {
        return getNode(index).getData();
    }

    private LinkNode<E> getNode(int index) {
        LinkNode<E> node = getStart();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * Removes and returns element at given index
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        E data = null;
        if (index == 0) {
            data = remove();
        } else if (index == getCount() - 1) {
            LinkNode<E> prevNode = getNode(index - 1);
            data = prevNode.getNext().getData();
            prevNode.setNext(null);
            setEnd(prevNode);
            addCount(-1);
        } else {
            LinkNode<E> prevNode = getNode(index - 1);
            LinkNode<E> node = prevNode.getNext();
            LinkNode<E> sucNode = node.getNext();
            prevNode.setNext(sucNode);
            data = node.getData();
            addCount(-1);
        }
        return data;
    }

    public void sort(Comparator<E> c) {
        if(getCount() < 2){
            return;
        }
        LinkNode<E> beforeCur = getStart();
        LinkNode<E> curNode = getStart().getNext();

        while(curNode != null){
            LinkNode<E> next = curNode.getNext();
            LinkNode<E> position = findInsertionPosition(curNode.getData(), c);

            if(position == beforeCur){
                beforeCur = curNode;
            } else {

            }
        }
    }

    private LinkNode<E> removeAfter(LinkNode<E> node){

    }

    private LinkNode<E> findInsertionPosition(E dataVal, Comparator<E> c){
        LinkNode<E> prevNode = null;
        LinkNode<E> node = getStart();
        while(node != null && c.compare(dataVal, node.getData()) > 0){
            prevNode = node;
            node = node.getNext();
        }
        return prevNode;
    }


}
