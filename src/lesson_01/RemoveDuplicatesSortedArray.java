package lesson_01;


public class RemoveDuplicatesSortedArray {

    // data structure used in this problem
    int[] nums = {1,1,1,2,2,2,3,3,3,4};

    int k; // final K is going to represent total unique elements within the array

    public int getTotalUniqueElements(int[] nums)
    {
        // structure to study: pointer
        int pointer = 1;

        for (int i = 1; i < nums.length; i++)
        {
            // i = 1 -> 1 != 1 ? FALSE
            // i = 3
            if (nums[i] != nums[i-1]) {

                nums[pointer] = i;
            }
        }


        return 0;
    }




}