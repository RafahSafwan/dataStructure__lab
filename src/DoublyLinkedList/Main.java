package DoublyLinkedList;

import Stack.Stack;

public class Main {
    public static void main(String[] args) {
     DoublyLinkedList<Integer> dList=new DoublyLinkedList<Integer>();
     dList.addFirst(1);
        dList.addFirst(2);
        dList.addFirst(3);
        dList.addLast(4);
        dList.addLast(5);
        dList.addLast(6);
        dList.removeLast();
        dList.display();

    }
}
