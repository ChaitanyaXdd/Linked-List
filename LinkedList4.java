public class LinkedList4 {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList4(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size = size + 1;
    }

    public void insertAtLast(int val){
        if (tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;
    }

    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();
//        ll.insertAtFirst(3);
        ll.insertAtFirst(2);
        ll.insertAtFirst(8);
        ll.insertAtFirst(3);
        ll.insertAtFirst(7);
        ll.insertAtFirst(5);
        ll.insertAtFirst(1);
        ll.insertAtLast(3);
        ll.display();
        System.out.println("Size of the Linked List is: " + ll.size);
    }
}
