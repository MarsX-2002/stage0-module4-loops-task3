package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        if (first < second){
            int temp = first;
            first = second;
            second = temp;
        }
        int remainder = 0;
        while (second != 0){
            remainder = first % second;
            first = second;
            second = remainder;

        }
        System.out.println(first);
    }

    public static void main(String[] args) {
        printGCD(12, 18);
    }
}
