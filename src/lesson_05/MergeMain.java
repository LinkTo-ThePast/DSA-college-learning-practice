package lesson_05;

import java.util.Arrays;

public class MergeMain {
    public static void main(String[] args) {
        MergeSortedArrays mergeArrays = new MergeSortedArrays();
        int[] nums1 = mergeArrays.nums1;
        int[] nums2 = mergeArrays.nums2;

        System.out.println(Arrays.toString(mergeArrays.getMergeOfArrays(nums1, nums2, 3, 3)));
    }
}
