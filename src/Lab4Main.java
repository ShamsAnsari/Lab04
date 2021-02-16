
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

        SinglyLinkedList<USD> list = new SinglyLinkedList<>();

        int index = 0;
        USD obj = null;
        //SinglyLinkedList Demonstration
        //append(E), prepend(E), insert(i, E), indexOf(E), get(i), remove(i),
        System.out.println("SinglyLinkedList Demonstration");
        System.out.println("------------------------------------------------------------------");
        System.out.println("append(E), prepend(E), insert(i, E), indexOf(E), get(i), remove(i)");
        printDemo("append", money1);
        list.append(money1);
        list.print();
        printDemo("append", money2);
        list.append(money2);
        list.print();
        printDemo("prepend", money3);
        list.prepend(money3);
        list.print();
        printDemo("insert", 1, money4);
        list.insert(1, money4);
        list.print();
        printDemo("insert", 4, money5);
        list.insert(4, money5);
        list.print();
        printDemo("insert", 0, money6);
        list.insert(0, money6);
        list.print();
        printDemo("indexOf", money7);
        index = list.indexOf(money7);
        System.out.print(index + "\n\t");
        list.print();
        printDemo("indexOf", money4);
        index = list.indexOf(money4);
        System.out.print(index + "\n\t");
        list.print();
        printDemo("get", index);
        obj = list.get(index);
        System.out.print(obj + "\n\t");
        list.print();
        printDemo("remove", 4);
        list.remove(4);
        list.print();
        System.out.println("clear()");
        list.clear();
        list.print();


    }


    public static void printDemo(String funcName, USD... elements) {
        printDemo(funcName, -1, elements);

    }

    public static void printDemo(String funcName, int index, USD... elements) {
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
