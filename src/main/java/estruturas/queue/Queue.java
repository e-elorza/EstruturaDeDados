package estruturas.queue;


public class Queue {
    Node front;
    Node rear;
    int size;

    public Queue() {
        this.front = null;
        this.rear = null;
         this.size = 0;
    }

    public void enqueue(int value){
        if (isQueueEmpty()){
            front = new Node(value);
            rear = front;
            size += 1;
            return;
        }

        rear.next = new Node(value);
        rear = rear.next;
        size += 1;
    }
    public int getSize(){
        return size;
    }

    public Node dequeue(){
        if (isQueueEmpty()){
            size -= 1;
            return null;
        }

        Node nodeReturn = front;

        front = front.next;

        if (front == null){
            rear = null;
        }

        nodeReturn.next = null;
        size -= 1;
        return nodeReturn;
    }

    public void printValues() {
        Node currentNode = front;

        while (currentNode != null) {
            System.out.print(currentNode.value + " => ");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println("\n");
    }

    public boolean isQueueEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
}
