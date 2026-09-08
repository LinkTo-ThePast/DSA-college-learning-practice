package lesson_02;


public class TwoSumFor {

    // ATTRIBUTES
    // if the addition of two elements within the array, yield the objective, then return the indices of those numbers
    int objective;
    int nums[];

    /**
     *
     * @param nums: a non-empty static array of integers
     * @param objective: an integer objective
     * @return the indices of those two elements that when add up, the result is the objective integer
     */
    public int[] getIndices(int[] nums, int objective)
    {
        if (nums.length == 0)
        {
            throw new IllegalArgumentException("Empty arrays are not allowed!");
        }
        // worst case: algorithm must iterate over all the N elements, hence, the upper bound O(n) that is going to define or contain the complexity function f(n) is O(n)
        // hence: f(n) <= O(n) -> Linear running time complexity
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == objective)
                {
                    return new int[]{i, i+1};
                }
            }


        }
         return new int[]{};
    }
}