package estruturas.trees.iteractive_bst;

public class BinarySearchTree {
    public Node root;

    public void addNode(int value){
        root = addNodeIn(value, root);
    }

    private Node addNodeIn (int value, Node currentNode){
        if(currentNode == null){
            return new Node(value);
        }

        Node lastNode = null;

        while (currentNode != null){
            if (value > currentNode.value){
                lastNode = currentNode;
                currentNode = currentNode.right;
            } else {
                lastNode = currentNode;
                currentNode = currentNode.left;
            }
        }

        currentNode = new Node(value);
        if (currentNode.value > lastNode.value){
            lastNode.right = currentNode;
        } else {
            lastNode.left = currentNode;
        }
        return root;
    }


    public void preOrdem() {
        preOrdemTraversal(root);
    }

    private void preOrdemTraversal(Node currentNode) {
        while (currentNode != null) {

            if (currentNode.left == null) {
                System.out.print(currentNode.value + ", ");
                currentNode = currentNode.right;
            } else {
                Node lastNode = currentNode.left;

                while (lastNode.right != null &&
                        lastNode.right != currentNode) {
                    lastNode = lastNode.right;
                }

                if (lastNode.right == null) {
                    System.out.print(currentNode.value + ", ");
                    lastNode.right = currentNode;
                    currentNode = currentNode.left;
                } else {
                    lastNode.right = null;
                    currentNode = currentNode.right;
                }
            }
        }
    }


    public void emOrdem() {
        emOrdemTraversal(root);
    }

    private void emOrdemTraversal(Node currentNode) {
        while (currentNode != null) {

            if (currentNode.left == null) {
                System.out.print(currentNode.value + ", ");
                currentNode = currentNode.right;
            } else {
                Node lastNode = currentNode.left;

                while (lastNode.right != null &&
                        lastNode.right != currentNode) {
                    lastNode = lastNode.right;
                }

                if (lastNode.right == null) {
                    lastNode.right = currentNode;
                    currentNode = currentNode.left;
                } else {
                    lastNode.right = null;
                    System.out.print(currentNode.value + ", ");
                    currentNode = currentNode.right;
                }
            }
        }
    }



    public void posOrdem() {
        Node dummy = new Node(0);
        dummy.left = root;

        Node currentNode = dummy;

        while (currentNode != null) {
            if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else {
                Node lastNode = currentNode.left;

                while (lastNode.right != null &&
                        lastNode.right != currentNode) {
                    lastNode = lastNode.right;
                }

                if (lastNode.right == null) {
                    lastNode.right = currentNode;
                    currentNode = currentNode.left;
                } else {
                    printReverse(currentNode.left, lastNode);
                    lastNode.right = null;
                    currentNode = currentNode.right;
                }
            }
        }
    }

    private void reversePath(Node start, Node end) {
        Node previous = null;
        Node current = start;

        while (previous != end) {
            Node next = current.right;
            current.right = previous;
            previous = current;
            current = next;
        }
    }

    private void printReverse(Node start, Node end) {
        reversePath(start, end);

        Node current = end;

        while (true) {
            System.out.print(current.value + ", ");

            if (current == start) break;

            current = current.right;
        }

        reversePath(end, start);
    }




    public void deleteNode(int value) {
        root = deleteNodeIn(value, root);
    }

    private Node deleteNodeIn(int value, Node currentNode) {
        Node parentNode = null;

        while (currentNode != null && currentNode.value != value) {
            parentNode = currentNode;

            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        if (currentNode == null) return root;

        if (currentNode.left != null && currentNode.right != null) {
            Node successorParent = currentNode;
            Node successor = currentNode.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            currentNode.value = successor.value;

            parentNode = successorParent;
            currentNode = successor;
        }

        Node child = (currentNode.left != null)
                ? currentNode.left
                : currentNode.right;

        if (parentNode == null) {
            return child;
        }

        if (parentNode.left == currentNode) {
            parentNode.left = child;
        } else {
            parentNode.right = child;
        }

        return root;
    }

}

