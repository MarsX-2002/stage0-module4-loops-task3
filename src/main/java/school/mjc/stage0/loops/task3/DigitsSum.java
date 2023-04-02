package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t) {
        int sum = 0;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }

//    public static void main(String[] args) {
//        printDigitsSum(123);
//    }
}
