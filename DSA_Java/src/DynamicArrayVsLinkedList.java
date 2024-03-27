import java.util.ArrayList;
import java.util.LinkedList;

public class DynamicArrayVsLinkedList {
    public static void show() {

          var linkedList = new LinkedList<Integer>();
        var arrayList = new ArrayList<Integer>();

        long startTime, endTime, elapsedTime;
        
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i); // auto boxing feature
            arrayList.add(i);        
        } 
        
        //********************** Linked List ******************** */
       
        startTime = System.nanoTime();
         //do something
       // linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);

        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");

        //********************** ArrayList   ******************** */
      
        startTime = System.nanoTime();

        //do something
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);

        //arrayList.remove(0);
        //arrayList.remove(500000);
         arrayList.remove(999999);


        endTime = System.nanoTime();
    

        elapsedTime = endTime - startTime;

        System.out.println("arrayList: \t" + elapsedTime + " ns");

        // Obtain an element from anm arraylist is always fast than a linkedlist
    }
}
