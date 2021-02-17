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
    public static void main(String[] args) {
        USD money1 = new USD(5, 6, "USD");
        USD money2 = new USD(1, 99, "USD");
        USD money3 = new USD(9, 50, "USD");
        USD money4 = new USD(7, 70, "USD");
        USD money5 = new USD(2, 0, "USD");
        USD money6 = new USD(3, 50, "USD");
        USD money7 = new USD(11, 1, "USD");


        USD[] amounts = {money1, money2, money3, money4, money5, money6, money7};
        SinglyLinkedList<USD> singlyLinkedList = new SinglyLinkedList<>();
        Queue<USD> queue = new Queue<>();
        Stack<USD> stack = new Stack<>();

        //SinglyLinkedList Demonstration
        //append(E), prepend(E), insert(i, E), indexOf(E), get(i), remove(i),
        System.out.println("SinglyLinkedList Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("append(E), prepend(E), insert(i, E), indexOf(E), get(i), remove(i)");
        printFunc("append", money1);
        singlyLinkedList.append(money1);
        singlyLinkedList.print();
        printFunc("append", money2);
        singlyLinkedList.append(money2);
        singlyLinkedList.print();
        printFunc("prepend", money3);
        singlyLinkedList.prepend(money3);
        singlyLinkedList.print();
        printFunc("insert", 1, money4);
        singlyLinkedList.insert(1, money4);
        singlyLinkedList.print();
        printFunc("insert", 4, money5);
        singlyLinkedList.insert(4, money5);
        singlyLinkedList.print();
        printFunc("insert", 0, money6);
        singlyLinkedList.insert(0, money6);
        singlyLinkedList.print();
        printFunc("indexOf", money7);
        int index = singlyLinkedList.indexOf(money7);
        System.out.print(index + "\n\t");
        singlyLinkedList.print();
        printFunc("indexOf", money4);
        index = singlyLinkedList.indexOf(money4);
        System.out.print(index + "\n\t");
        singlyLinkedList.print();
        printFunc("get", index);
        USD obj = singlyLinkedList.get(index);
        System.out.print(obj + "\n\t");
        singlyLinkedList.print();
        printFunc("remove", 4);
        singlyLinkedList.remove(4);
        singlyLinkedList.print();
        System.out.println("clear()");
        singlyLinkedList.clear();
        singlyLinkedList.print();


        //Stack Demonstration
        //push(E), pop(), peek()
        System.out.println("\nStack Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("push(E), pop(), peek()");
        printFunc("push", money1);
        stack.push(money1);
        stack.print();
        printFunc("push", money2);
        stack.push(money2);
        stack.print();
        System.out.print("pop()\n\t");
        obj = stack.pop();
        System.out.print(obj + "\n\t");
        stack.print();
        printFunc("push", money3);
        stack.push(money3);
        stack.print();
        printFunc("push", money4);
        stack.push(money4);
        stack.print();
        System.out.print("peek()\n\t");
        obj = stack.peek();
        System.out.print(obj + "\n\t");
        stack.print();
        for (int i = 0; i < 3; i++) {
            System.out.print("pop()\n\t");
            obj = stack.pop();
            System.out.print(obj + "\n\t");
            stack.print();
        }
        System.out.print("peek()\n\t");
        obj = stack.peek();
        System.out.print(obj + "\n\t");
        stack.print();


        //Queue Demonstration


    }


    public static void printFunc(String funcName, USD... elements) {
        printFunc(funcName, -1, elements);
    }

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


}
