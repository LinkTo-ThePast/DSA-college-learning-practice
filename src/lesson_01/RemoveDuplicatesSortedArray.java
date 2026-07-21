package lesson_01;

public class RemoveDuplicatesSortedArray {

    // properties
    // consideration: sorted array, in this case, non-decreasing order
    // data stucture used in this exercise: static array -> solves static sequence
    int[] nums;

    /**
     * PUBLIC METHOD:
     * @param nums: array of integers, sorted in non-decreasing order
     * @return total count of unique elements within array
     * CONSTRAINT: at least TWO element.
     */
    public int getTotalUniqueElements(int[] nums) {

        // auxiliary properties
        int uniqueElements;
        int leftPointer = 1;

        if (nums.length <= 1)
        {
            throw new IllegalArgumentException("Please, use arrays that at least contains two elements.");
        }

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[i-1])
            {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }
        // the time we found a different item, and leftPointer was incremented is also equal the unique items we found within the array
        uniqueElements = leftPointer;
        return  uniqueElements;
    }

}