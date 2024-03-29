public class RecursionDemo {
    public static void run() {

        walk(-5);
        System.out.println(factorial(7));
        System.out.println(power(2,8));


    }

    private static void walk(int steps) {

        steps = Math.abs(steps);
    
        if(steps < 1) return;
        System.out.println("You took a step");
        walk(steps - 1);
    }


    private static int factorial (int number){
        if(number < 1 ) return 1;
        return number * factorial(number -1);
    }

    private static int power(int base, int exponent){
        if(exponent < 1) return 1; //stop condition
        return base * power(base, exponent - 1);

    }



}
