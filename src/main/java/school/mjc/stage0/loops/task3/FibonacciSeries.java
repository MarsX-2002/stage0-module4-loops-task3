package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int fibonacciFirst = 0;
        int fibonacciSecond = 1;
        if (lastFibonacci < 1) {
            System.out.println(fibonacciFirst);
        } else {
            for (int i = 0; i < lastFibonacci; i++) {
                int temp = fibonacciSecond;
                fibonacciSecond += fibonacciFirst;
                fibonacciFirst = temp;

                System.out.println(fibonacciSecond);
            }
        }
    }

//    public static void main(String[] args) {
//        printFibonacci(4);
//    }
}
