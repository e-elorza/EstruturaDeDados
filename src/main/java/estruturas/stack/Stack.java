package estruturas.stack;

public class Stack {
    Node top;
    int size;
    int limite;

    public Stack(int limite){
        this.top = null;
        this.limite = limite;
    }

    public void push(int value){
        if (size < limite){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            size+=1;
        } else {
            System.out.println("Limite atingido");
        }
    }

    public void pop(){

        if (top == null){
            return;
        }
        top = top.next;
        size-=1;
    }

    public int peek(){
        return top.value;
    }

    public void printValues() {
        Node currentNode = top;

        while (currentNode != null) {
            System.out.print(currentNode.value + "\n");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println("\n");
    }
}
