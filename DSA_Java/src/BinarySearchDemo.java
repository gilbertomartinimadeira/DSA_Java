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

        
        System.out.println("Interpolation Search");

        int[] secondArray = {1,2,3,14,5,6,7,8,9};

        index = interpolationSearch(array, 8);

        System.out.println(index);


    }


    /**
     * INterpolation Search - improvement over binary search best used for "uniformly" distributed data
     * "guesses" where a value might be based on calculated probe results
     * if probe is incorrect , search area is narrowed, and a new probe is calculated
     * 
     * average case: O(log(log(n)))
     * worst case: O(n) [values increase exponentially]
     * @return
     */
    private static int interpolationSearch(int[] array, int value) {
        

        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] & low <= high ) {
            int probe = low + (high - low) * (value - array[low]) 
                            / ( array[high] - array[low] );

            System.out.println("probe: " + probe);

            if(array[probe] == value) return probe;
            else if(array[probe] < value) low = probe + 1;
            else if(array[probe] > value) high = probe - 1; // maintaining if condition for didactics purposes

        
        }



        return 0;
        
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
