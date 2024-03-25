package com.gilmartmd;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

        public static void Show(){
             var queue = new LinkedList<String>();

        print("Creating a queue in Java: Queue<String> queue = new LinkedList<>();");

        queue.offer("Gilberto");
        queue.offer("Joselia");
        queue.offer("João");
        
        print("Printing the queue: ");
        print(queue);
        
        print("");
        print("Check to see the first element in the queue without removing it");
        print("queue.peek()");    

        print(queue.peek());

        print("");
        print("removing the element to be processed with poll");
        print("queue.poll()");    

        var element = queue.poll();

        print(element);

        print("Printing the queue: ");
        print(queue);

        print("");    
        print("How many elements are in the queue");
        print("queue.size(): " + queue.size());

        }

         public static void print(String s) 
    {
         System.out.println(s); 
    }

    public static void print(Queue q) 
    {
         System.out.println(q); 
    }

}
