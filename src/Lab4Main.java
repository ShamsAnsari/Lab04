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
        SinglyLinkedList list = new SinglyLinkedList();

        LinkNode node1 = new LinkNode(new USD(19, 99, "USD"));
        LinkNode node2 = new LinkNode(new USD(10, 01, "USD"));
        LinkNode node3 = new LinkNode(new USD(1, 0, "USD"));
        LinkNode node4 = new LinkNode(new USD(5, 99, "USD"));
        LinkNode node5 = new LinkNode(new USD(20, 0, "USD"));
        LinkNode node6 = new LinkNode(new USD(3, 0, "USD"));
        LinkNode node7 = new LinkNode(new USD(7, 25, "USD"));


        //SinglyLinkedList append(), prepend(), insertAfter(), search(), removeAfter(), clear() demonstration
        System.out.println("\nSinglyLinkedList: append(), prepend(), insertAfter(),search(), removeAfter(), clear()");
        System.out.println("-------------------------------------------------------------------------------------");
        printFuncDemon("append", node1);
        list.append(node1);
        list.print();
        printFuncDemon("append", node2);
        list.append(node2);
        list.print();
        printFuncDemon("prepend", node3);
        list.prepend(node3);
        list.print();
        printFuncDemon("insertAfter", null, node4);
        list.insertAfter(null, node4);
        list.print();
        printFuncDemon("insertAfter", node2, node5);
        list.insertAfter(node2, node5);
        list.print();
        printFuncDemon("insertAfter", node3, node6);
        list.insertAfter(node3, node6);
        list.print();
        printFuncDemon("search", node6);
        System.out.print(list.search(node6.getData()) + "\n\t");
        list.print();
        printFuncDemon("search", node7);
        System.out.print(list.search(node7.getData())+"\n\t");
        list.print();
        printFuncDemon("removeAfter", node6);
        list.removeAfter(node6);
        list.print();
        printFuncDemon("removeAfter", new LinkNode());
        list.removeAfter(null);
        list.print();
        printFuncDemon("removeAfter", node2);
        list.removeAfter(node2);
        list.print();
        System.out.print("clear()\n\t");
        list.clear();
        list.print();

        //SinglyLinkedList: insert(), sort(), get(), indexOf(), remove() --> Except sort() all are index based
        System.out.println("\nSinglyLinkedList: insert(), sort(), get(), indexOf(), remove()");
        System.out.println("------------------------------------------------------------");
        System.out.print("insert(0," + node1 + ")\n\t");
        list.insert(0, node1);
        list.print();
        System.out.print("insert(0," + node2 + ")\n\t");
        list.insert(0, node2);
        list.print();
        System.out.print("insert(2," + node3 + ")\n\t");
        list.insert(2, node3);
        list.print();
        System.out.print("insert(1," + node4 + ")\n\t");
        list.insert(1, node4);
        list.print();
        System.out.print("sort()\n\t");
        list.sort();
        list.print();
        System.out.print("get(2)\n\t");
        System.out.print(list.get(2) +"\n\t");
        list.print();
        printFuncDemon("indexOf", node3);
        System.out.print(list.indexOf(node3)+"\n\t");
        list.print();
        System.out.print("remove(0)\n\t");
        list.remove(0);
        list.print();
        System.out.print("remove(1)\n\t");
        list.remove(1);
        list.print();


    }

    public static void printFuncDemon(String funcName, LinkNode... nodes) {
        String out = funcName + "(";
        for (LinkNode node : nodes) {
            if (node == null) {
                out += "null, ";

            } else {
                out += node.getData() + ", ";
            }
        }
        out = out.substring(0, out.length() - 2) + ")\n\t";
        System.out.print(out);
    }
}
