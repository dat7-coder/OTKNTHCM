public class MyLinkedList{
    private Node head;
    private int numNode;
    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }
    public boolean addLast(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
        }else{
            Node last = head;
            while(last.next != null){
                if (newNode == last){
                    return false;
                }else{
                    last = last.next;
                }
            }
            last.next = newNode;
        }
        return true;
    }
    public void print(){
		Node p = this.head;
		do{
			System.out.print(p.data);
			p=p.next;
		}while ( p != null);
	}
}