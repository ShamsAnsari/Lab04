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
public class Lab4Main {

    //USD objects to be used in Demo
    static USD money1 = new USD(5, 6, "USD");
    static USD money2 = new USD(1, 99, "USD");
    static USD money3 = new USD(9, 50, "USD");
    static USD money4 = new USD(7, 70, "USD");
    static USD money5 = new USD(2, 0, "USD");
    static USD money6 = new USD(3, 50, "USD");
    static USD money7 = new USD(11, 1, "USD");

    public static void main(String[] args) {

        //Create lists
        SinglyLinkedList<USD> list = new SinglyLinkedList<>();
        Queue<USD> queue = new Queue<>();
        Stack<USD> stack = new Stack<>();

        //Create Comparator
        Comparator<USD> c = Comparator.naturalOrder();

        /**
         * Format for demos:
         *
         * 1. Print( what function is being performed)
         * 2. perform function on ADT
         * 3. optional - print return value
         * 4. print(ADT)
         *
         */
        //Do demo
        singlyLinkedListDemo(list, c);
        stackDemo(stack);
        queueDemo(queue);

        //Clear
        list.clear();
        stack.clear();
        queue.clear();


    }

    /**
     * Queue Demonstration
     * Demonstrates: enqueue(E), dequeue(), peekFront(), peekRear()
     * Does not demo: inherited parent function such as contains(E), indexOf(E), remove(), isEmpty() etc
     *
     * @param queue empty queue of USD's
     */
    public static void queueDemo(Queue<USD> queue) {
        queue.clear();

        //Queue Demonstration
        //enqueue(E), dequeue(), peekFront(), peekRear()
        System.out.println("------------------------------------------------------------------");
        System.out.println("Queue Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("enqueue(E), dequeue(), peekFront(), peekRear()");
        System.out.println("------------------------------------------------------------------");

        //enqueue(E)
        printFunc("enqueue", money1);
        queue.enqueue(money1);
        queue.print();

        //enqueue(E)
        printFunc("enqueue", money2);
        queue.enqueue(money2);
        queue.print();

        //dequeue()
        System.out.print("dequeue()\n\t");
        USD obj = queue.dequeue();
        System.out.print(obj + "\n\t");
        queue.print();

        //enqueue(E)
        printFunc("enqueue", money3);
        queue.enqueue(money3);
        queue.print();

        //enqueue(E)
        printFunc("enqueue", money4);
        queue.enqueue(money4);
        queue.print();

        //peekFront()
        System.out.print("peekFront()\n\t");
        obj = queue.peekFront();
        System.out.print(obj + "\n\t");
        queue.print();

        //peekRear()
        System.out.print("peekRear()\n\t");
        obj = queue.peekRear();
        System.out.print(obj + "\n\t");
        queue.print();

        //dequeue() X3
        for (int i = 0; i < 3; i++) {
            System.out.print("dequeue()\n\t");
            obj = queue.dequeue();
            System.out.print(obj + "\n\t");
            queue.print();
        }

        //peekFront()
        System.out.print("peekFront()\n\t");
        obj = queue.peekFront();
        System.out.print(obj + "\n\t");
        queue.print();

        //peekRear()
        System.out.print("peekRear()\n\t");
        obj = queue.peekRear();
        System.out.print(obj + "\n\t");
        queue.print();
    }

    /**
     * Stack Demonstration
     * Demonstrates: push(E), pop(), peek()
     * Does not demo: inherited parent functions such as contains(E), indexOf() etc
     * @param stack Stack os USD's
     */
    public static void stackDemo(Stack<USD> stack) {
        stack.clear();
        //Stack Demonstration
        //push(E), pop(), peek()
        System.out.println("------------------------------------------------------------------");
        System.out.println("Stack Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("push(E), pop(), peek()");
        System.out.println("------------------------------------------------------------------");

        //push(E)
        printFunc("push", money1);
        stack.push(money1);
        stack.print();

        //push(E)
        printFunc("push", money2);
        stack.push(money2);
        stack.print();

        //pop()
        System.out.print("pop()\n\t");
        USD obj = stack.pop();
        System.out.print(obj + "\n\t");
        stack.print();

        //push(E)
        printFunc("push", money3);
        stack.push(money3);
        stack.print();

        //push(E)
        printFunc("push", money4);
        stack.push(money4);
        stack.print();

        //peek()
        System.out.print("peek()\n\t");
        obj = stack.peek();
        System.out.print(obj + "\n\t");
        stack.print();

        //pop() X3
        for (int i = 0; i < 3; i++) {
            System.out.print("pop()\n\t");
            obj = stack.pop();
            System.out.print(obj + "\n\t");
            stack.print();
        }

        //peek()
        System.out.print("peek()\n\t");
        obj = stack.peek();
        System.out.print(obj + "\n\t");
        stack.print();

    }

    /**
     * SinglyLinkedList Demonstration
     * Demonstrates: append(E), prepend(E), insert(i, E), indexOf(E), get(i), sort(), remove(i)
     * Does not demo: some parent functions such as isEmpty(), clear() etc
     * @param list SinglyLinkedList of USD's
     * @param c comparator
     */
    public static void singlyLinkedListDemo(SinglyLinkedList<USD> list, Comparator<USD> c) {

        list.clear();
        //SinglyLinkedList Demonstration
        //append(E), prepend(E), insert(i, E), indexOf(E), get(i), sort(), remove(i),
        System.out.println("------------------------------------------------------------------");
        System.out.println("SinglyLinkedList Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("append(E), prepend(E), insert(i, E), indexOf(E), get(i), sort(), remove(i)");
        System.out.println("------------------------------------------------------------------");

        //append(E)
        printFunc("append", money1);
        list.append(money1);
        list.print();

        //append(E)
        printFunc("append", money2);
        list.append(money2);
        list.print();

        //prepend(E)
        printFunc("prepend", money3);
        list.prepend(money3);
        list.print();

        //insert(i, E)
        printFunc("insert", 1, money4);
        list.insert(1, money4);
        list.print();

        //insert(i,E)
        printFunc("insert", 4, money5);
        list.insert(4, money5);
        list.print();

        //insert(i,E)
        printFunc("insert", 0, money6);
        list.insert(0, money6);
        list.print();

        //indexOf(E)
        printFunc("indexOf", money7);
        int index = list.indexOf(money7);
        System.out.print(index + "\n\t");
        list.print();

        //indexOf(E)
        printFunc("indexOf", money4);
        index = list.indexOf(money4);
        System.out.print(index + "\n\t");
        list.print();

        //get(i)
        printFunc("get", index);
        USD obj = list.get(index);
        System.out.print(obj + "\n\t");
        list.print();

        //sort()
        System.out.print("sort()\n\t");
        list.sort(c);
        list.print();

        //remove(i)
        printFunc("remove", 4);
        list.remove(4);
        list.print();

        //clear()
        System.out.print("clear()\n\t");
        list.clear();
        list.print();

    }


    /**
     * Prints out the function name and parameters
     * EX:
     * print("insert", 1, 5) ==> "insert(1, 5)"
     * @param funcName function name
     * @param index index parameter of function
     * @param elements element parameters of function
     */
    public static void printFunc(String funcName, int index, USD... elements) {
        String out = funcName + "(";
        if (index != -1) {
            out += index + ", ";
        }


        for (USD element : elements) {
            out += element + ", ";
        }
        out = out.substring(0, out.length() - 2) + ")\n\t";
        System.out.print(out);
    }

    /**
     * Same is printFunc, but without index parameter
     * @param funcName function name
     * @param elements element parameter
     */
    public static void printFunc(String funcName, USD... elements) {
        printFunc(funcName, -1, elements);
    }


}
