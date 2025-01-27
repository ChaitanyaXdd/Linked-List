// Convert Array to a Linked List
public class LinkedList8 {
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

    public Node convertArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // extra
    public Node insertAtHead(int val){
        if (head == null){
            return new Node(val);
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    public Node insertAtLast(Node head, int val){
        if (head == null){
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public Node insertAtKthNode(Node head,int val,int k){
        if (k == 1){
            return insertAtHead(val);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            cnt++;
            if (cnt == k-1){
                Node node = new Node(val);
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public  Node deleteHead(Node head){
        if (head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    public Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
           temp = temp.next;
       }
        temp.next = null;
        return head;
    }

    public Node deleteKthNode(Node head,int k){
        Node temp = head;
        int size = 0;
        while (temp != null){
            size = size + 1;
            temp = temp.next;
        }
        temp = head;
        if (size < k){
            return head;
        }
        if (head == null){
            return null;
        }
        if (k == 1){
            head = head.next;
            return head;
        }
        for (int i = 2; i < k; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public Node deleteTheValue(Node head,int val){
        if (head == null){
            return null;
        }
        if (head.value == val){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.value == val){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList8 ll = new LinkedList8();
        int[] arr = {12,5,6,8};
        Node temp1 = ll.convertArrayToLinkedList(arr);
        ll.printList(temp1);
//        temp1 = ll.deleteHead(temp1);
//        ll.printList(temp1);
//        temp1 = ll.deleteTail(temp1);
//        ll.printList(temp1);
//        temp1 = ll.deleteKthNode(temp1,3);
//        ll.printList(temp1);
//        temp1 = ll.deleteTheValue(temp1,6);
//        ll.printList(temp1);
//        temp1 = ll.insertAtHead(10);
//        ll.printList(temp1);
//        temp1 = ll.insertAtLast(temp1,100);
//        ll.printList(temp1);
        temp1 = ll.insertAtKthNode(temp1,100,3);
        ll.printList(temp1);


    }
}
