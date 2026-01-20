package BinaryTree;

public class BinaryTree {

    private Node root;


    public BinaryTree(int rootValue) {
        root =new Node(rootValue,null,null);
    }

    private void insert(Node newNode,Node rNode){

        if(newNode.getValue()>rNode.getValue()){
            if(rNode.getRight()==null)
                rNode.setRight(newNode);

            else
                insert(newNode,rNode.getRight());
        }

        else if(newNode.getValue()<rNode.getValue()){
            if(rNode.getLeft()==null)
                rNode.setLeft(newNode);

            else
                insert(newNode,rNode.getLeft());  }

        else
            System.out.println("cant add duplicated values");
}

public void insertNode(int value){
        Node newNode=new Node(value,null,null);
        insert(newNode,root);
    }

private Boolean search(int value, Node rNode){
        if(rNode==null) return false;
        if(value>rNode.getValue())
            return search(value,rNode.getRight());
        else if(value<rNode.getValue())
            return search(value,rNode.getLeft());

        else
            return true;

}

public Boolean searchNode(int value){
        return search(value,root);
}

private void preOrder(Node rNode){
  //root left right
        if(rNode==null) return;
    System.out.println(rNode.getValue());
    preOrder(rNode.getLeft());
    preOrder(rNode.getRight());

}

public void preOrderT(){

        preOrder(root);
    System.out.println();
}

    private void postOrder(Node rNode){
//left right root
        if(rNode==null) return;
        postOrder(rNode.getLeft());
        postOrder(rNode.getRight());
        System.out.println(rNode.getValue());

    }

    public void postOrderT(){

        postOrder(root);
        System.out.println();
    }

    private void inOrder(Node rNode){
//left root right

        if(rNode==null) return;
        postOrder(rNode.getLeft());
        System.out.println(rNode.getValue());
        postOrder(rNode.getRight());

    }

    public void inOrderT(){

        postOrder(root);
        System.out.println();
    }





    class Node{

        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
