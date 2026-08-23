package lesson_01;


public class RemoveDuplicatesSortedArray {

    /*
    *  OOP concepts: a class is a blueprint for objects. Objects can be instantiated from Classes
    * */
    /*
    *  DS concepts: data structure studied in this problem ---> static array ---> solves: static sequence
    * a static sequence does not increment sequence's size
    * */
    int nums[];

    /**
     * PUBLIC method: returns the total unique elements counts
     * @param nums: static array in non-decreasing order and AT least it needs to contain two items
     * @return total count for unique elements within the static array
     */
    public int getTotalUniqueElements(int[] nums)
    {
        // store occasions where unique elements were found
        int uniqueElements = 0;

        // safety
        if (nums.length < 2)
        {
            throw new IllegalArgumentException("Static array needs to have at least two elements.");
        }

        // 1. begin to iterate array
        for (int i = 0; i < nums.length; i++)
        {
            if (i == nums.length - 1)
            {
                break;
            }

            if (nums[i] != nums[i+1])
            {
                uniqueElements++;
            }
        }

        return uniqueElements + 1;
    }
}