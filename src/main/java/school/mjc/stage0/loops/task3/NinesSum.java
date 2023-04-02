package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int current = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            current = current * 10 + 1;
            sum += current;
        }
        System.out.println(9 * sum);
    }

//    public static void main(String[] args) {
//        calculateSum(2);
//    }
}
