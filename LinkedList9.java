public class LinkedList9 {
    private Node head;
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public Node insertAtHead(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;
       return head;
    }
    public Node insertAtLast(int val,Node head){
        if (head == null){
            return new Node(val);
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
    public Node insertAtPosition(int val,Node head, int pos){
        if (head == null){
            return new Node(val);
        }
        if (pos == 0){
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public void display(Node head){
        if (head == null){
            System.out.println("List is empty.");
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList9 ll = new LinkedList9();
        Node temp1 = ll.insertAtHead(7);
        temp1 = ll.insertAtHead(8);
        temp1 = ll.insertAtHead(9);

        ll.display(temp1);
    }
}
