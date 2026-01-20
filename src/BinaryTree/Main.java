package BinaryTree;

public class Main {
    public static void main(String[]args){
        BinaryTree bTree=new BinaryTree(10);
        bTree.insertNode(5);
        bTree.insertNode(12);
        bTree.insertNode(11);
        bTree.insertNode(13);
        bTree.insertNode(15);
        bTree.insertNode(7);
        bTree.insertNode(2);


        System.out.println( "result searching 12 "+bTree.searchNode(12));
        System.out.println("preOrder traversal ");
        bTree.preOrderT();

        System.out.println("postOrder traversal ");
        bTree.postOrderT();

        System.out.println("inOrder traversal ");
        bTree.inOrderT();


    }
}
