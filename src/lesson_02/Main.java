package lesson_02;

import java.util.Arrays;

public class Main {
    public static void main(String [] args) {

        TwoSumFor twoSumFor = new TwoSumFor();

        // test case
        int[] numsCase = {2,5,5,11};

        int[] resultIndices = twoSumFor.twoSum(numsCase, 10);

        System.out.println(Arrays.toString(resultIndices));
    }
}
