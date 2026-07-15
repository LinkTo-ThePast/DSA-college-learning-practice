package lesson_01;


public class RemoveDuplicatesSortedArray {

    int[] nuns;

    public int returnNumberOfUniqueItems(int[] nums) {

        int uniqueItems;
        int leftPointer = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1])
            {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }

        uniqueItems = leftPointer;
        return leftPointer;

    }
}