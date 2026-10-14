package lesson_02;


public class TwoSumFor {

    // ATTRIBUTES
    // if the addition of two elements within the array, yield the objective, then return the indices of those numbers
    int objective;
    int nums[];

    /**
     *
     * @param nums: a non-empty static array of integers, non-decreasing order
     * @param objective: an integer objective
     * @return the indices of those two elements that when add up, the result is the objective integer
     */
    public int[] getIndices(int[] nums, int objective)
    {
        // safety check
        if (nums.length == 0)
        {
            throw new IllegalArgumentException("PLEASE, introduce only non-empty arrays");
        }

        // Strategy 2): using two pointers in just one cycle, the array must be sorted (for example: non-decreasing order)as previous condition
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        // when pointers begin in opposites sided, they converge towards the middle of the array
        while (leftPointer < rightPointer)
        {
            // check first for the objective
            if (nums[leftPointer] + nums[rightPointer] == objective) {
                return new int[]{leftPointer,rightPointer};
            }
            // case 1. sum is less than the objective
            else if (nums[leftPointer] + nums[rightPointer] < objective) {
                leftPointer++;
            }
            // case 2. sum is greater than objective
            else {
                rightPointer--;
            }
        }
        // return empty array if objective was not found
        return new int[]{};

    }
}