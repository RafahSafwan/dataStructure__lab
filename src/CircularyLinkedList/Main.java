package CircularyLinkedList;

public class Main {

    public static void main(String[]args){

        CircularylinkedList<String> list=new CircularylinkedList<String>();
        list.addfirst("zulfa");
        list.addfirst("jood");
        list.addlast("elaf");
        list.addlast("fatima");
        list.removeLast();
        list.display();

    }
}
