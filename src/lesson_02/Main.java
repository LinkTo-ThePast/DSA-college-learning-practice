package lesson_02;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {

        TwoSumFor twoSumFor = new TwoSumFor();

        // test case
        int[] numsCase = {1,4,5,9,10,12};

        int[] resultIndices = twoSumFor.getIndices(numsCase, 19);

        System.out.println(Arrays.toString(resultIndices));
    }
}
