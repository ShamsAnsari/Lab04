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


        //SinglyLinkedList append(), prepend(), insertAfter() demonstration

        System.out.println("SinglyLinkedList append(), prepend(), insertAfter(), search() Test");
        System.out.println("---------------------------------------------------------");
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
        printFuncDemon("insertAfter", node2,node5);
        list.insertAfter(node2, node5);
        list.print();
        printFuncDemon("insertAfter", node3,node6);
        list.insertAfter(node3, node6);
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
