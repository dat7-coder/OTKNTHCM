public class Test{
    public static void main(String[] args){
        MyLinkedList ln = new MyLinkedList();
        
        System.out.println(ln.removeFirst());
        ln.addLast(1);
        ln.addLast(2);
        ln.addLast(4);
        ln.addLast(5);
        System.out.println(ln.addAfter(2,4));
        System.out.println(ln.addLast(6));
        System.out.println(ln.addFirst(6));
        System.out.println(ln.removeLast());
        System.out.println(ln.removeElement(2));
        System.out.println(ln.size());
        System.out.println(ln.contains(4));
        System.out.println(ln.isEmpty());
        System.out.println(ln.getHead());
        
        ln.print();
    }
}