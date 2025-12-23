package SinglyLinkedList;

public class Main {

        public static void main(String[] args) {
            singlyLinkedList<Integer> list = new singlyLinkedList<Integer>();
            list.addFrist(1);
            list.addFrist(2);
            list.addFrist(3);
            list.addFrist(4);
            list.addFrist(5);
            Integer last=list.getlast();
            System.out.println(last);
            list.addatposition(6,2);
            list.display();

    }
}
