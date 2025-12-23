package CircularyLinkedList;

public class CircularylinkedList <E> {





        private Node<E> tail;
        private  int size;

        public CircularylinkedList() {
            this.tail = null;
            this.size = 0;
        }

        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size()==0;}
        public void addfirst(E data){
            if (isEmpty()){
                Node<E> newnod= new Node<E>(null,data);
                tail=newnod;
                newnod.setNext(tail);
            }else {
                Node<E> newnod= new Node<E>(tail.getNext(),data);
                tail.setNext(newnod);

            }
            size++;
        }
        public void addlast(E data){
            addfirst(data);
            tail=tail.getNext();
        }
        public E getfrist(){
            if(isEmpty())return null;
            return tail.getNext().getData();
        }
        public E getlast(){
            if(isEmpty())return null;
            return tail.getData();
        }
        public E removeFirst(){
            if (isEmpty())return null;
            E delet=tail.getNext().getData();
            if(tail==tail.getNext()){
                tail=null;
            }else {
                tail.setNext(tail.getNext().getNext());
            }size--;
            return delet;
        }
        public void display(){
            Node<E> temp=tail.getNext();
            do{

                System.out.print( temp.getData()+"--->");
                temp=temp.getNext();

            }while(temp!=tail.getNext());
            System.out.println("go to the first("+temp.getData()+")");
    }
        public E removeLast(){
            if (isEmpty())return null;
            E delete= tail.getData();
            if (tail==tail.getNext()){
                tail=null;
            }
            else{
                Node <E> temp=tail.getNext();
                while(temp.getNext()!=tail){
                    temp=temp.getNext();
                }
                temp.setNext(tail.getNext());
                tail=temp;
            }
            size--;
            return delete;
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
}
    }
}
