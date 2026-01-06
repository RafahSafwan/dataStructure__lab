package Stack;

public class ArrayStack<E> implements Stack<E>{
   E arr[];
   private static final int Capacity=1000;
   private int  t=-1;

    public ArrayStack() {
      this(Capacity);
    }

    public ArrayStack(int c) {
        arr=(E[])new Object[c];
    }

    @Override
    public Boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
         if(size()==arr.length){
             System.out.println("stack is full");
    }
else{
       arr[++t]=data;

}
    }
    @Override
    public E pop() {
        if(isEmpty()) return null;
        E delete=arr[t];
        arr[t]=null;
        t--;
        return delete;
    }

    @Override
    public E top() {
       if(isEmpty()) return null;
       return arr[t];
    }

    @Override
    public void display() {
        if(isEmpty()){
        throw new IllegalStateException("stack is full");
        }
          for(int i=t; i>=0; i--){
             System.out.println(arr[i]);

}    }
}
