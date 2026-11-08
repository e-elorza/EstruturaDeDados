package estruturas.trees.recursive_bst;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}
