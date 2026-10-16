 package lesson_07;


public class BinarySearch {
    // properties
    int nums[];
    int objective;


    public int findNumber(int[] nums, int objective) {

        if (nums.length == 0)
        {
            throw new IllegalArgumentException("Empty arrays are not allowed!");
        }

        // strategy: utilize left and right pointers strategy

        // left pointer begins at the beginning of the array --> index zero
        int leftPointer = 0;
        // right pointer begins at the end of the array -->
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {

            int middlePosition = Math.floorDiv((leftPointer + rightPointer), 2);
            int guess = nums[middlePosition];
            // 1) we found the objective
            if (guess == objective) {
                return guess;
            }
            // 2) the guess is less than the objective
            else if (guess < objective) {
                leftPointer = middlePosition + 1;
            }
            // 3) the guess is greater than the objective
            else {
                rightPointer = middlePosition - 1;
            }
        }
        // while cycle completes and no return, then return -1 to indicate that the objective was not found in the array
        return -1;
    }
}