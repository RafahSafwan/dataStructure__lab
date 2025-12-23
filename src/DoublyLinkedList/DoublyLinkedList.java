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
