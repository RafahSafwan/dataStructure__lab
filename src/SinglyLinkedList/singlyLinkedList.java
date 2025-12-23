package SinglyLinkedList;

public class singlyLinkedList <E>{

    private Node<E> head;
    private Node<E>tail;
    private int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void addFrist(E data){
        Node<E> nnod= new Node<>(head,data);
        head=nnod;
        if(isEmpty())
            tail=head;
        size++;
    }
    public E getFrist(){
        if (isEmpty())return null;
        return head.getData();
    }
    public E removeFrist(){
        E delet=head.getData();
        head=head.getNext();
        if(size()==0)
            tail=head;
        return delet;


    }public  void addlast(E data){
        Node <E > nnode=new Node(null,data);
        if (isEmpty()){
            head=nnode;
        }
        else {
            tail.setNext(nnode);
        }tail=nnode;
        size++;
    }
    public E getlast(){
        if (isEmpty())
            return null;
        else{
            return tail.getData();}
    }
    public E removelast(){
        E delet=tail.getData();
        if(isEmpty()) return null;
        if (head== tail){
            head=tail=null;}
        else{

            Node<E> temp = head;
            while (temp.getNext()!= tail){
                temp.getNext();
            }temp.setNext(null);
            tail=temp;


        }size--;

        return delet;
    }public void display(){
        Node<E> temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+"---->");
            temp=temp.getNext();
        }System.out.print("null");
    }
    public void addatposition(E data,int position){

        if (position<=0 ||position>size+1)
            throw new IllegalArgumentException("invaild position");
        if (position==1){
            addFrist(data);
            return;}
        else {
            Node<E> newnod=new Node<E>(null,data);
            Node<E> temp=head;
            int count=1;
            while (count<position-1){
                temp=temp.getNext();
                count++;
            }
            newnod.setNext(temp.getNext());
            temp.setNext(newnod);
            if(newnod.getNext()==null){
                tail=newnod;
            }
            size++;
        }
    }




    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }}




}