package Queue;

public class ArrayQueue <E> implements Queue<E>{
    private E arr[];
    private static final int capacity=1000;
    private int f;
    private int size=0;


    public ArrayQueue(){
     this(capacity);
    }
    public ArrayQueue(int c){
        arr=(E[])new Object [capacity];

    }


    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E data) {
        if (size() == arr.length) {
            throw new IllegalStateException("queue is full");
        }
        else{

            int av=(f+size)%arr.length;
            arr[av]=data;
            size++;

        }
    }

    @Override
    public E dequeue() {
        if(isEmpty())return null;
        E delete=arr[f];
        arr[f]=null;
        f+=1;
        size--;
        return delete;
    }

    @Override
    public E front() {
   return arr[f];
    }
}
