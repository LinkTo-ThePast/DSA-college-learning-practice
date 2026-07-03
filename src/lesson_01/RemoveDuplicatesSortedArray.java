package lesson_01;

public class RemoveDuplicatesSortedArray {

    // define properties
    int[] nums;
    // method to return the total unique elements within the array
    // and modify the array in place, not creating a new one

    // input example:
    // NON - DECREASING ORDER == ASCENDING ORDER with == not going to decrease, is going to increment, but also it can contain repeated or equal numbers
    // CONSTRAINTS: at leats one item, and only natural numbers
    // int[] test = {0,0,1,1,1,2,2,3,3,4};

    public int getTotalUniqueElements(int[] nums)
    {
        // final unique elements
        int differentItems = 1;

        // strictly just one element
        if (nums.length == 0)
        {
            throw new IllegalArgumentException("Input array cannot be empty!");
        }

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1])
            {
                // counting that we have two different elements
                differentItems++;
            }
        }

        return differentItems;
    }
}