public class LinkedList6 {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList6(){
        this.size = 0;
    }

    private class Node{
        private int value;
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
    public void insertAtBeginning(int val){
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
            insertAtBeginning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;
    }

    public void reverseLinkedList(){
        Node current = head;
        Node prev = null;
        while (current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
//        head.next = null;
        head = prev;
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
        LinkedList6 ll = new LinkedList6();
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.display();
        ll.reverseLinkedList();
        ll.display();
    }
}
