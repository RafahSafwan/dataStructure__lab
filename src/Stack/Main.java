package Stack;

public class Main {
    public static void main(String[] args) {
       // SLinkedListStack<Integer>sList=new SLinkedListStack();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>(3);
        aStack.push(1);
        aStack.push(2);
        aStack.push(3);
        aStack.push(4);
        System.out.println("top is"+aStack.top());
        aStack.display();

    }
}
