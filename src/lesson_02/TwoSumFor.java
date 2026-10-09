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
        if (nums.length == 0)
        {
            throw new IllegalArgumentException("Empty arrays are not allowed!");
        }

        // applying two pointers strategy
        // initialize a right pointer at the final position:
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (rightPointer > leftPointer) {
            if (nums[leftPointer] + nums[rightPointer] == objective) {
                return new int[]{leftPointer, rightPointer};
            }
            else if (nums[leftPointer] + nums[rightPointer] > objective) {
                rightPointer--;
            }
            else {
               leftPointer++;
            }
        }

        return new  int[]{};
    }
}