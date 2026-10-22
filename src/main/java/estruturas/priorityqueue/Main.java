package estruturas.priorityqueue;

public class Main {
    static void main() {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(2,1);
        priorityQueue.enqueue(4,2);
        priorityQueue.enqueue(6,2);
        priorityQueue.enqueue(8,3);
        priorityQueue.enqueue(10,4);
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Size: " + priorityQueue.getSize());

        priorityQueue.printValues();
        priorityQueue.dequeue();
        System.out.println("Peek depois de dequeue: " + priorityQueue.peek());
        System.out.println("Size depois de dequeue: " + priorityQueue.getSize());
        priorityQueue.printValues();
//        System.out.println(priorityQueue.front.value);
    }
}
