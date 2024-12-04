
    // LinkedList: stored Nodes in 2 parts (data + address). Nodes are in  non-consecutive memory locations. Elements are linked using pointers

    //                      Singly Linked List
    //        Node               Node                Node
    //     [Data | address]-> [Data | address]-> [Data | address]
        
    //                       Doubly Linked List
    //        Node
    //     [prevAddress | Data | nextAddress]<->[prevAddress | Data | nextAddress]<


import java.util.LinkedList;

public class linkedList {
                  
    public static void main(String[] args) {
         LinkedList<String> linkedList = new LinkedList<>();

        //  linkedList.push("A");
        //  linkedList.push("B");
        //  linkedList.push("C");
        //  linkedList.push("D");

        linkedList.offer("A");
         linkedList.offer("B");
         linkedList.offer("C");
         linkedList.offer("D");

        //  linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        
        linkedList.addFirst("F");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList.indexOf("F"));

         System.out.println(linkedList);
    }
}
