package lesson_05;

public class MergeSortedArrays {

    // establish input examples
    // test case 1
    final private int[] nums1 = {1, 2, 3, 0, 0, 0};
    final private int[] nums2 = {2, 5, 6};

    public int[] getMergeOfArrays(int[] nums1, int m, int[] nums2, int n) {
        m = nums1.length - nums2.length;
        //
        for (int i = m; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] > nums2[j]) {
                    nums1[i] = nums2[j];
                }
            }
        }

        return nums1;
    }
}
