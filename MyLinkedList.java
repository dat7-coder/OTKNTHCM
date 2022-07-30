public class MyLinkedList{
    private Node head;
    private int numNode;
    public MyLinkedList(){
        this.head = null;
        this.numNode = 1;
    }
    public boolean addLast(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
        }else{
            Node last = head;
            while(last.getNext() != null){
                if (newNode.getData() == last.getData()){
                    return false;
                }else{
                    last = last.getNext();
                }
            }
            last.setNext( newNode);
            numNode=numNode+1;
        }
        return true;
    }
    public boolean addFirst(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
        }else{
            if (newNode.getData() < head.getData()) {
                return false;
            }
            newNode.setNext(head);
            head = newNode;
            numNode+=1;
        }
        return true;
    }
    public boolean addAfter(int item, int k){
        Node newNode = new Node(item);
        Node last = head;
        while(last.getNext() != null){
            if (k == last.getData()){
                newNode.setNext(last.next);
                last.next = newNode;
                numNode=numNode+1;
                return true;
            }else{
                last = last.getNext();
            }
        }
        return false;
    }
    public int removeFirst(){
        Node temp = head;
        if (head == null) {
            return 0;
        }
        else{
            head = temp.next;
            numNode=numNode-1;
        }
        return 1;
    }
    public int removeLast(){
        if (head == null) {
            return 0;
        }
        else{
            Node last = head;
            while(last.getNext().getNext() != null){
                last = last.getNext();
            }
            last.setNext(null);
            
            numNode=numNode-1;
        }
        return 1;
    }
    public boolean removeElement(int k){
        Node last = head;
        while(last.getNext() != null){
            if(k == last.getData()){
                this.removeFirst();
                numNode=numNode-1;
                return true;
            }
            if (k == last.getNext().getData()){
                last.setNext(last.getNext().getNext());
                numNode=numNode-1;
                return true;
            }else{
                last = last.getNext();
            }
        }
        return false;
    }
    public int size(){
        return numNode;
    }
    public boolean contains(int item){
        Node last = head;
        while(last.getNext() != null){
            if (item == last.getData()){
                return true;
            }else{
                last = last.getNext();
            }
        }
        return false;
    }
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }
    public Node getHead(){
        return head;
    }
    public void print(){
		Node p = this.head;
		do{
			System.out.print(p.data);
			p=p.getNext();
		}while ( p != null);
	}
}