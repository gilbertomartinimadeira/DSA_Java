
public class BubbleSortDemo {

    public static void run() {


        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("BUBBLE SORT DEMO!");

        System.out.println("--------------------");

        int[] array = {2,7,3,6,9,4,1,4,6};

        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        bubbleSort(array);
        System.out.println("AFTER BUBBLE SORTING");
        System.out.println("--------------------");
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();


    }

    /***
     * 
     * Pairs of adjacent elements are compared, and the elements
     * swapped if they are not in order
     * 
     * Quadratic time O(N^2) 
     * small data set - okay- ish
     * large data set - DON't use it
     * @param array
     */
    private static void bubbleSort(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
    
}


