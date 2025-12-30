package DoublyLinkedList;

public class DoublyLinkedList <E>{

    private Node<E>header;
    private Node<E>trailer;
    private int size;

    public DoublyLinkedList() {
        header=new Node(null,null,null);
        trailer=new Node(header,null,null);
        header.setNext(trailer);
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public E getFirst(){
        return header.getNext().getData();

    }

    public E getLast(){
        return trailer.getPrev().getData();
    }

    private void addBetween(Node<E>prev,E data,Node<E>next){
       Node<E>newNode=new Node(prev,data,next);
       prev.setNext(newNode);
       next.setPrev(newNode);
       size++;
    }

    public void addFirst(E data){
        addBetween(header,data,header.getNext());
    }

    public void addLast(E data){
        addBetween(trailer.getPrev(),data,trailer);
    }

    private E remove(Node<E> removedNode){

        if(isEmpty())return null;
        E removed=removedNode.getData();
        Node<E>left=removedNode.getPrev();
        Node<E>right=removedNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return removed;

    }

    public E removeFirst(){
        return remove(header.getNext());
    }

    public E removeLast(){
        return remove(trailer.getPrev());
    }

    public void display(){
        Node<E>temp=header.getNext();
        System.out.print("nul <---- header<----> ");
        while(temp!=trailer){
            System.out.print(temp.getData()+"<---->");
            temp=temp.getNext();
        }
        System.out.print(" trailer--->null");

    }



    class Node<E>{
        private Node<E> prev;
       private E data;
       private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
