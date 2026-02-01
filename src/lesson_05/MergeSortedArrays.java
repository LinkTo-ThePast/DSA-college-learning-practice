package lesson_05;

public class MergeSortedArrays {

    // establish input examples
    // test case 1
    final public int[] nums1 = {1, 2, 3, 0, 0, 0};
    final public int[] nums2 = {2, 5, 6};

    public int[] getMergeOfArrays(int[] nums1, int[] nums2, int m, int n) {

        if (m == 0 && n == 0) {
            return new int[]{};
        }

        // getting last item of nums1 [index]
        // lastItem is the '0' ELEMENT to be replaced/merged
        int lastItem = (m + n) - 1;

        // strategy: merging backwards
        while (m > 0 && n > 0) {
            // coming element from nums2 is smaller/lesser than last actual item from nums1, then move nums1's last item to the final position
            if (nums1[m-1] > nums2[n-1]) {
                nums1[lastItem] = nums1[m-1];
                m -= 1;
            }
            else {
                nums1[lastItem] = nums2[n-1];
                n -= 1;
            }
            lastItem -= 1;
        }


        return nums1;
    }
}
