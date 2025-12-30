package Stack;

public interface Stack<E>{
//    There default is public
    Boolean isEmpty();
    int size();
    void push(E data);
    E pop();
    E top();
    void display();

}
