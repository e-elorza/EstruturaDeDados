package estruturas.priorityqueue;

public class PriorityQueue {

    Node front;
    Node tail;
    int size;

    public void enqueue(int value, int priority){
        if (front == null){
            front = new Node(value, priority);
            tail = front;
            size += 1;
            return;
        }
        Node currentNode = front;
        Node lastNode = null;
        Node newNode = new Node(value, priority);
        while (currentNode != null){
            if (newNode.priority >= currentNode.priority){
                if (currentNode == tail) {
                    currentNode.next = newNode;
                    tail = newNode;
                    size += 1;
                    return;
                }
                lastNode = currentNode;
                currentNode = currentNode.next;
                continue;
            }

            if (currentNode == front) {
                newNode.next = currentNode;
                front = newNode;
                size+=1;
                return;
            } else {
                lastNode.next = newNode;
                newNode.next = currentNode;
                size+=1;
                return;
            }
        }
    }

    public void dequeue(){
        if (front == null && tail == null){
            size -= 1;
            return;
        }

        Node aux = null;
        aux = front;
        front = front.next;
        if (front == null){
            tail = null;
        }
        aux.next = null;
        size -= 1;
    }

    public void printValues() {
        Node currentNode = front;

        while (currentNode != null) {
            System.out.print(currentNode.value + "(" + currentNode.priority + ")" + " => ");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println("\n");
    }

    public int peek(){
        return front.value;
    }


    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if (front == null && tail == null){
            return true;
        } else {
            return  false;
        }
    }
}
