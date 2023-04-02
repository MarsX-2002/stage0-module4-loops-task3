package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacciFirst = 0;
        int fibonacciSecond = 1;
        if (lastFibonacci == 1) {
            System.out.println(fibonacciFirst);
        } else {
            System.out.println(fibonacciFirst);
            System.out.println(fibonacciSecond);
            int i = 2;
            while (i < lastFibonacci) {
                int temp = fibonacciSecond;
                fibonacciSecond += fibonacciFirst;
                fibonacciFirst = temp;
                System.out.println(fibonacciSecond);
                i++;
            }
        }
    }
}
