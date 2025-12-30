package Stack;

public class Main {
    public static void main(String[] args) {
        SLinkedListStack<Integer>sList=new SLinkedListStack();
        sList.push(1);
        sList.push(2);
        sList.push(3);
        sList.push(4);
        sList.push(5);
        while(!sList.isEmpty()){

            System.out.println(sList.pop());
        }


    }
}
