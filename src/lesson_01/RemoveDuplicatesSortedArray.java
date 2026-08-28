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
        // fundamental operation (1) => assign variable
        int uniqueElements = 0;

        // safety
        // fundamental operation (2) => boolean comparison
        if (nums.length < 2)
        {
            throw new IllegalArgumentException("Static array needs to have at least two elements.");
        }

        // 1. begin to iterate array
        // iterate over a static array, in the worst case scenario, takes N iterations
        // fundamental operations = N operations as per item in the static array PLUS the respective operation made in that iteration, in this case, two boolean comparisons
        // fundamental operation for an array of arr.length == 5, then N  x 3 respective operations inside each iteration = 15 fundamental operations
        // in terms of big O notation, kg(n) being a asymptotic upper bound defined by this worst scenario, this algorithm is never going to take MORE running time
        // that kg(n) of 15 fundamental operations?
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