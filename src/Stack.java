public class Stack<E> extends LinearList<E> {


    public E pop() {
        return remove();
    }


    public void push(E element) {
        add(element);
    }

    @Override
    public void add(E element) {
        LinkNode<E> node = new LinkNode<>(element);
        if(isEmpty()){
            setStart(node);
            setEnd(node);
        } else{
            node.setNext(getStart());
            setStart(node);
        }
    }

}
