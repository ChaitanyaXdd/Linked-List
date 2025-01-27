public class LinkedList2 {

    Node head;
    private int size;
    public LinkedList2(){
        this.size = 0;
    }
    private class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first,last
    public void addFirst(String data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(String data){
        Node node = new Node(data);
       if (head == null)
       {
           head = node;
           return;
       }
       Node temp = head;
       while (temp.next != null){
           temp = temp.next;
       }
       temp.next = node;
    }

    // delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public  void deleteLast(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

//    print
    public void printList()
    {
        if (head == null){
            System.out.println("List is empty.");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst("17");
        ll.addFirst("19");
        ll.addFirst("87");
        ll.addLast("91");
        ll.printList();
        ll.deleteFirst();
        ll.printList();
        ll.deleteLast();
        ll.printList();
        System.out.println(ll.getSize());

    }
}
