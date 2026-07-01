package lesson_01;


public class RemoveDuplicatesSortedArray {

    int[] numsTestOne = {0,0,1,1,1,2,2,2,3,4,5};

    int k;

    public int getTotalUniqueElements(int[] nums)
    {
        int leftPointer = 1;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1]) {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }
        k = leftPointer;
        return k;
    }

}