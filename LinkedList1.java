
public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList1(){
        this.size = 0;
    }
    private class Node{
        private int value;  // private because don't want anyone to access the values
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size = size + 1;
    }

    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size = size + 1;
        }
    }

    public void insertAtPos(int val,int index){
        if (size < index){
            return;
        }
        if (index == 0){
            insertAtFirst(val);
        }
        else if (index == size) {
            insertAtLast(val);
        }
        else {
            Node temp = head;
            for (int i = 1; i < index; i++){
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size = size + 1;
        }
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size = size - 1;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size = size - 1;
        return val;
    }

    public int deleteAtPos(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();
        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(8);
        ll.insertAtFirst(17);
        ll.insertAtLast(99);
        ll.insertAtPos(100,3);
//        ll.insertAtPos(100,100);
        ll.display();

        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.deleteAtPos(2));
        ll.display();

    }
}
