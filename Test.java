public class Test{
    public static void main(String[] args){
        MyLinkedList ln = new MyLinkedList();
        ln.addLast(1);
        ln.addLast(2);
        ln.addLast(4);
        ln.addLast(5);
        System.out.println(ln.addLast(6));
    }
}