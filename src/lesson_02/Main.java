package lesson_02;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {

        TwoSumFor twoSumFor = new TwoSumFor();

        // test case
        int[] numsCase = {2,3,4,5,6};

        int[] resultIndices = twoSumFor.getIndices(numsCase, 5);

        System.out.println(Arrays.toString(resultIndices));
    }
}
