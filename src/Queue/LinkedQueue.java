package Queue;

import SinglyLinkedList.singlyLinkedList;
public class LinkedQueue <E> implements Queue<E>{
    singlyLinkedList<E> sList= new singlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return sList.isEmpty();
    }

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void enqueue(E data) {
         sList.addlast(data);
    }

    @Override
    public E dequeue() {
        return sList.removeFrist();
    }

    @Override
    public E front() {
        return sList.getFrist();
    }
}
