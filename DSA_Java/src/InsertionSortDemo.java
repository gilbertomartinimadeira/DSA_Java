public class InsertionSortDemo {
    public static void run() {


        System.out.println("INSERTION SORT DEMO");

        int array[] = {9,1,8,2,7,3,6,5,4};

        for (int i : array) {
            System.err.print(i+ " ");
        }
        System.err.println();

        insertionSort(array);
        
        System.err.println();
        for (int i : array) {
            System.err.print(i+ " ");
        }
        System.err.println();

    }

    /***
     * Insertion Sort = after comparing elements to the left
     *                  shifts elements to the right to make room to insert a value
     *                  
     *                  Quadratic time O(N²)
     *                  Less steps than bubble sort
     *                  Best case is O(N) compared to selection sort O(N²)
     * 
     * @param array
     */

    private static void insertionSort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

        
    }
}
