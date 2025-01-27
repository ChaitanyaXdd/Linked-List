//Reverse a LinkedList
public class LinkedList5 {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList5(){
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

    public void insertAtEnd(int val){
        if (tail == null){
            insertAtBeginning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;
    }

    public void insertAtPos(int val,int index){
        if (size < index){
            return;
        }
        if (index == 0){
            insertAtBeginning(val);
        } else if (index == size) {
            insertAtEnd(val);
        }
        else {
            Node temp = head;
            for(int i = 1; i < index; i++){
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size = size + 1;
        }
    }
    public void reverseLinkedList(){
        if (head == null){
            return;
        }
        if (head.next == null){
            return;
        }
        Node previous = head;
        Node current = head.next;
        while (current != null){
            Node nextNode = current.next;
            current.next = previous;

            //update
            previous = current;
            current = nextNode;
        }
        head.next = null;
        head = previous;
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
        LinkedList5 ll = new LinkedList5();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);

        ll.display();

        ll.reverseLinkedList();
        ll.display();
    }

}
