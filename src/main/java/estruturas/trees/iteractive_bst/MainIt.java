import estruturas.trees.iteractive_bst.BinarySearchTree;

void main() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(3);
    tree.addNode(11);

    tree.addNode(2);
    tree.addNode(4);
    tree.addNode(6);


    System.out.print("Pré Ordem: "); tree.preOrdem();
    System.out.println("\n");
    System.out.print("Em Ordem: "); tree.emOrdem();
    System.out.println("\n");
    System.out.print("Pós Ordem: "); tree.posOrdem();

//    System.out.println(tree.qteFolhas(tree.root));

}
