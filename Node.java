public class Node{
    int data;
    Node next;
    public Node(){
        this.data = 0;
        this.next = null;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node e){
        this.next = e;
    }
}