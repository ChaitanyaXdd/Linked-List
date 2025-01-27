// Insertion in LinkedList :- Practice
public class LinkedList7 {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    // Insert at Beginning
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size = size + 1;
    }

    public static void main(String[] args) {

    }
}
