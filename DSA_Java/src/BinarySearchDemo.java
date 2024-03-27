import java.util.Arrays;

public class BinarySearchDemo {
    public static void run(){

        // Binary search is a search algorithm that finds the position 
        //  of a target element within a sorted array
        // Half of the array is eliminated during each "step"
        // O(log N)

        int array[] = new int[1000000];
        System.out.println("BINARY SEARCH");

        int target = 780717;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //built in binary search 
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if ( index > 0)
            System.out.println("Element found at: " + array[index]);
        else{
            System.out.println("Element not found.");
        }
        


    }

    private static int binarySearch(int[] array, int target) {
        // TODO Auto-generated method stub

        int lo = 0;
        int hi = array.length -1;

        

        while(lo <= hi){
            int mid = lo + ( hi - lo) /2;
            int value = array[mid];

            if (value < target) lo = mid + 1;
            else if( value > target) hi = mid - 1;

            else return mid;

            System.out.println("middle: " + array[mid]);
        }

        return -1; //target not found
        
    }
    
}
