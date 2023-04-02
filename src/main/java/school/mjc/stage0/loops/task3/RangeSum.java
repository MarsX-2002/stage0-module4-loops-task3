package school.mjc.stage0.loops.task3;

import org.w3c.dom.css.CSSImportRule;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder > secondBoarder) {
            int temp = firstBoarder;
            firstBoarder = secondBoarder;
            secondBoarder = temp;
        }
        if (firstBoarder >= 0) {
            for (int i = firstBoarder; i <= secondBoarder; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

