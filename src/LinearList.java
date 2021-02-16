import java.util.LinkedList;

public abstract class LinearList<E> {
    private int count;
    private LinkNode<E> start;
    private LinkNode<E> end;


    /**
     * Appends element
     *
     * @param element
     */
    public void add(E element) {
        LinkNode<E> node = new LinkNode<>(element);
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
     * Removes and returns element at start of list
     *
     * @return
     */
    public E remove() {
        if (isEmpty()) {
            return null;
        }

        LinkNode<E> node = getStart();
        setStart(node.getNext());
        if (node == getEnd()) {
            setEnd(null);
        }
        addCount(-1);
        return node.getData();
    }

    /**
     * Returns but not remove start of list
     *
     * @return
     */
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return getStart().getData();
    }

    public boolean contains(E element) {
        return indexOf(element) > -1;
    }

    public int indexOf(E element) {
        int i = 0;
        for (LinkNode<E> node = getStart(); node != null; node = node.getNext(), i++) {
            if (node.getData().equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        int len = getCount();
        for (int i = 0; i < len; i++) {
            remove();
        }
    }

    public Object[] toArray() {
        Object[] elements = new Object[getCount()];
        int i = 0;
        for (LinkNode<E> node = getStart(); node != null; node = node.getNext())
            elements[i++] = node.getData();
        return elements;
    }


    public boolean isEmpty() {
        return getCount() == 0;
    }

    public boolean equals(LinearList<E> list) {
        if (list.size() != size()) {
            return false;
        }
        for (LinkNode<E> node = getStart(), nodeB = list.getStart();
             node != null; node = node.getNext(), nodeB = nodeB.getNext()) {
            if (!node.getData().equals(nodeB.getData())) {
                return false;
            }
        }
        return true;
    }


    public int size() {
        return getCount();
    }


    public void addCount(int n) {
        count += n;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LinkNode<E> getStart() {
        return start;
    }

    public void setStart(LinkNode<E> start) {
        this.start = start;
    }

    public LinkNode<E> getEnd() {
        return end;
    }

    public void setEnd(LinkNode<E> end) {
        this.end = end;
    }
}
