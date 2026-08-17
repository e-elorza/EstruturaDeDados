package estruturas.queue;

public class Main {
    static void main() {
        Queue queue = new Queue();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printValues();
        queue.dequeue();


    }
}
