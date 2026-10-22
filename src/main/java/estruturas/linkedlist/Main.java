package estruturas.linkedlist;

import java.util.Stack;

public class Main{
    static void main() {
        LinkedList linkedList = new LinkedList();


        linkedList.addValue(2);
        linkedList.addValue(6);
        linkedList.addValue(11);
        linkedList.printValues();
        linkedList.addAtBeginning(1);
        linkedList.printValues();
        linkedList.removeNode(2);
        linkedList.printValues();




    }
}

