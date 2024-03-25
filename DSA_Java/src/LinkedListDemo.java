
import java.util.LinkedList;

public class LinkedListDemo {

    public static void show(){
        LinkedList<String> stack = new LinkedList<>();
    
        
        // By using push and pop on a linkedList, we are treating it like a Stack, because the last inserted element will be processed first
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("F");
        System.out.println("stack.pop(): ");
        System.out.println(stack.pop());

        System.out.println("Printing the stack");
        System.out.println(stack);

        // By using offer and poll on a linkedList, we are treating it like a Stack,     
        // because the last inserted element will be processed first
        // System.out.println(list.pop());

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        // System.out.println("linkedList.poll(): ");
        // System.out.println(linkedList.poll());

        System.out.println("Printing the linkedList");
        System.out.println(linkedList);


        System.out.println("removing E from the linkedList");
        linkedList.remove("E");
        System.out.println("Printing the linkedList");
        System.out.println(linkedList);

        
        System.out.println("Peeking the first node of the linkedList: linkedList.peekFirst()");

        System.out.println(linkedList.peekFirst());

        System.out.println("Peeking the last node of the linkedList: linkedList.peekLast()");

        System.out.println(linkedList.peekLast());

        System.out.println("Inserting before the head of the linkedList with linkedList.addFirst()");

        linkedList.addFirst("0");

        System.out.println("Printing the linkedList");
        System.out.println(linkedList);

        System.out.println("Inserting after the tail of the linkedList with linkedList.addLast()");

        linkedList.addLast("Z");

        System.out.println("Printing the linkedList");
        System.out.println(linkedList);

        var first = linkedList.removeFirst();
        var last = linkedList.removeLast();


        System.out.println("Printing the linkedList after removing first and last elements");
        System.out.println(linkedList);


        // usage example / suggestion
        // GPS -> tracking the steps, and retracking for recalculation

        // Music Playlists, (doubly linked lists)
        return;
    }
}
