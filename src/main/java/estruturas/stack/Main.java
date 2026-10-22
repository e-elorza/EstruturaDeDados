package estruturas.stack;

public class Main {

    static void main() {
        Stack stack = new Stack(5);


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.printValues();

    }
}
