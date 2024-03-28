import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        clearScreen();
        
        //QueueDemo.Show();
        //PriorityQueueDemo.show();
        //LinkedListDemo.show();
        //DynamicArrayDemo.show();    
        //DynamicArrayVsLinkedList.show();

        // int numbers[] = {0,10,20,30,40,50,60,70,80,90};

        // int index = LinearSearchDemo.find(numbers, 12);

        // if( index != -1){
        //     System.out.println("Fount at index:" + index);
        // }
        // else{
        //     System.out.println("Value not found");
        // }

    
        // var sumOfAll = LinearSearchDemo.sumOfAllNumbers(6);

        // System.out.println(sumOfAll);

        //BinarySearchDemo.run();

        //BubbleSortDemo.run();

        SelectionSortDemo.run();

        






         System.out.println("");
    }

    private static void clearScreen() {
    
        System.out.print("\033[H\033[2J");
        System.out.flush();  

    }
}
