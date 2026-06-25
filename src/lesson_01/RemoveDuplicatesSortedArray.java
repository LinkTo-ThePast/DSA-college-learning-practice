package lesson_01;

public class RemoveDuplicatesSortedArray {
    // data structure studied in this problem: array.

    int[] arr = {1,1,1,2,2,2,3,3,3,4};

    int itemOne = arr[0]; // ---> itemOne = 1
    int k;
    public int getTotalUniqueElements(int[] nums) {
        int leftPointer = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1]) {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }
        k = leftPointer;
        return leftPointer;
    }

}