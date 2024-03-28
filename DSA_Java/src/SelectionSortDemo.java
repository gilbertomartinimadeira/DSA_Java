public class SelectionSortDemo {
    public static void run(){
        
        System.out.println("Selection Sort Demo");

        int[] array = {8,7,9,2,3,1,5,4,6};

        for (int i : array) {
            System.out.print(i);
        }

        System.out.println();
        selectionSort(array);

        System.out.println("after selection sort the array:");

        System.out.println();
        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {        
            int min = i;        
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]){
                    min = j;
                }
            }
            // good old XOR Swap

            // array[min] ^= array[i];
            // array[i] ^= array[min];
            // array[min] ^= array[i]; 

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp; 
        }    
    }


}
