package lesson_10;

/**
 * Lesson: running time considers NOT physical time, but fundamental operations
 *  Let's make an example with simple or linear search within a non-decreasing sorted array
 */
public class CountingOperations {

    // 1 fundamental operation = variable assignation
    int[] testingArray = {1,2,3,4,5,6,7};

    /**
     *
     * @param sortedArray
     * @param objective
     *  Fundamental operations:
     *  variable assignation
     *  arithmetic operation
     *  calling a function
     *  returning a function
     *  boolean comparisons
     *  accessing a structure
     * @return True if the objective is found within the array
     */
    public boolean containsNumber(int[] sortedArray, int objective) {

        // two fundamental operations for calling this method: 2 variable assignation cases
        for (int i = 0; i < sortedArray.length; i++)
        // 1 variable assignation, 1 boolean comparison, one increment + one assignation = 4 fundamental operations to initialize the for cycle
        {

        }

    }

}
