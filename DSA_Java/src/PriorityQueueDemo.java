
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    
    public static void show() {

        //PRIORITY QUEUE 
        // A FIFO Collection in which elements are served in a high priority first    

        //Defining a priority using a custom comparator

        Comparator<String> sizeComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                // Define the comparison logic based on your priority criteria
                // For example, let's say we want to prioritize shorter strings
                //return Integer.compare(str1.length(), str2.length());

                //pioritize larger things
                return Integer.compare(str2.length(), str1.length());

            }
        };

        PriorityQueue<String> fruits = new PriorityQueue<String>(sizeComparator);

        
        fruits.offer("orange");
        fruits.offer("banana");

        fruits.offer("apple");
        fruits.offer("mango");
        fruits.offer("strawberry");

        print(fruits);

        print(fruits); // the list is empty so there will be no items shown
        
    }

    public static <T> void print(PriorityQueue<T> queue)
    {    
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    
}
