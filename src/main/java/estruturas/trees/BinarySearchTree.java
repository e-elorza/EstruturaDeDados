package estruturas.trees;

public class BinarySearchTree {
    public Node root;

    public void addNode(int value){
        root = addNodeIn(value, root);
    }

    private Node addNodeIn (int value, Node currentNode){
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value){
            currentNode.left = addNodeIn(value, currentNode.left);
        } else if (value > currentNode.value) {
            currentNode.right = addNodeIn(value, currentNode.right);
        }

        return currentNode;
    }

    public void preOrdem(){
        preOrdemTraversal(root);
    }

    private void preOrdemTraversal(Node node){
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrdemTraversal(node.left);
        preOrdemTraversal(node.right);
    }

    public int qteFolhas(Node node){
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;

        return qteFolhas(node.left) + qteFolhas(node.right);
    }
}

