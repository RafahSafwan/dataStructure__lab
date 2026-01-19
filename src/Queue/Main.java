package Queue;

public class Main {
    public static void main(String[] args) {
       LinkedQueue <Integer> lqueue=new  LinkedQueue <Integer>();
        lqueue.enqueue(1);
        lqueue.enqueue(2);
        lqueue.enqueue(3);
        lqueue.enqueue(4);


        System.out.println(lqueue.front());

        while(!lqueue.isEmpty()){
            System.out.println("element is removed " + lqueue.dequeue());
        }

    }
}
