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
     * CONSTRAINT: at least one element.
     */
    public int getTotalUniqueElements(int[] nums) {
        if (nums.length == 0)
        {
            throw new IllegalArgumentException("Please, use arrays that at least contains one element.");
        }


    }

}