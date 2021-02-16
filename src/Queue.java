public class Queue<E> extends LinearList<E> {

    public void enqueue(E element) {
        add(element);
    }

    public E dequeue() {
        return remove();
    }

    public E peekFront() {
        return peek();
    }

    public E peekRear() {
        if (isEmpty()) {
            return null;
        }
        return getEnd().getData();
    }
}
