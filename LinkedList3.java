import java.util.*;
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("this");
        System.out.println(ll);
        ll.addLast("list");
        System.out.println(ll);
        System.out.println(ll.size());

        for(int i = 0; i<ll.size(); i++){
            System.out.print(ll.get(i) + " -> ");
        }
        System.out.println("NULL");

        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
