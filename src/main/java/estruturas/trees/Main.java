import estruturas.trees.BinarySearchTree;

void main() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(3);
    tree.addNode(11);

    tree.addNode(2);
    tree.addNode(4);
    tree.addNode(6);

    System.out.println(tree.root.value);
    System.out.println(tree.root.left.value);
    System.out.println(tree.root.right.value);
    System.out.println(tree.root.right.right.value);
    System.out.println("\n");

//    System.out.print("Pré Ordem: "); tree.preOrdem();

    System.out.println(tree.qteFolhas(tree.root));

}
