public class LinearSearchDemo {
    
    public static int find(int[] numbers, int value ) {

        for (int i = 0; i < numbers.length; i++) {
            if(value == numbers[i]) {
                return i;            
            } 
        }
        return -1;
    }


    public static int sumOfAllNumbers(int value ) {
        return value * (value + 1) / 2;
        

    }
}
