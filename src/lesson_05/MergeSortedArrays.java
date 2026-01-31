package lesson_05;

public class MergeSortedArrays {

    // establish input examples
    // test case 1
    final public int[] nums1 = {1, 2, 3, 0, 0, 0};
    final public int[] nums2 = {2, 5, 6};

    public int[] getMergeOfArrays(int[] nums1, int[] nums2, int m, int n) {

        //
            for (int i = m - 1; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int lastItem = nums1[i]; // 3
                    int comingItem = nums2[j]; // 5

                    // check if lastItem is greater than coming item
                    if (lastItem >= comingItem) {
                        nums1[i + 1] = lastItem;
                        nums1[i] = comingItem;
                    } else {
                        nums1[i] = lastItem;
                        nums1[i+1] = comingItem;
                    }
                }
            }
        return nums1;
    }
}
