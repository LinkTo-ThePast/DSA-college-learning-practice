package lesson_05;

public class MergeSortedArrays {

    // establish input examples
    // test case 1
    final public int[] nums1 = {1, 2, 3, 0, 0, 0};
    final public int[] nums2 = {2, 5, 6};

    public int[] getMergeOfArrays(int[] nums1, int[] nums2) {
        int m = nums1.length - nums2.length;
        //
        for (int i = m; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i-1] > nums2[j]) {
                    int elementToSwap = nums1[i-1];
                    nums1[i] = elementToSwap;
                    nums1[i-1] = nums2[j];
                } else {
                    nums1[i] = nums2[j];
                }
            }
        }

        return nums1;
    }
}
