package estruturas.linkedlist;

public class LinkedList {
    Node begin;

    public LinkedList() {
        this.begin = null;
    }

    public void addValue(int value) {
        if (begin == null) {
            begin = new Node(value);
            return;
        }

        Node currentNode = begin;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node(value);
    }

    public void printValues() {
        Node currentNode = begin;

        while (currentNode != null) {
            System.out.print(currentNode.value + " => ");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println("\n");
    }

    public boolean containsValue(int value) {
        Node currentNode = begin;

        while (currentNode != null) {
            if (currentNode.value == value) { return true; }
            currentNode = currentNode.next;
        }

        return false;
    }

    public int getSize(){
        int size = 0;
        Node currentNode = begin;
        while (currentNode != null) {
            size+=1;
            currentNode = currentNode.next;
        }
        return size;
    }

    public void addAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = begin;
        begin = newNode;
    }

    public void removeNode(int value){
        Node currentNode = begin;
        Node lastNode = null;

        while (currentNode != null){
            if (currentNode.value == value){
                if (currentNode == begin){
                    begin = begin.next;
                    return ;
                } else {
                    lastNode.next = currentNode.next;
                    return;
                }
            }
            lastNode = currentNode;
            currentNode = currentNode.next;
        }
    }


    public void removeLastNode(){
        Node currentNode = begin;

        if (begin == null){
            return;
        }

        if (begin.next == null){
            begin = null;
            return;
        }

        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = null;
    }
}
