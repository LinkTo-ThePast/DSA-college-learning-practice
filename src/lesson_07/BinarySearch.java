package lesson_07;

/**
 * Takes a sorted array and an objective/number to find
 * @param nums: sorted array of integers
 * @param objective: integer to find within the array
 * @return index position of the objective
 */
public class BinarySearch {
    // data structure used in this problem
    int[] nums;
    int objective;

    public int findNumber(int[] nums, int objective) {
        // initial position within the array
        int leftPointer = 0;
        // ending position within the array
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer)
        {
            int middlePosition = Math.floorDiv(leftPointer + rightPointer, 2);
            int guess = nums[middlePosition];

            // if guess is equal to objective, return index
            if (guess == objective)
            {
                return middlePosition;
            }

            // if guess is less than objective, increment and update left pointer == initial positon
            else if (guess < objective)
            {
                leftPointer = middlePosition + 1;
            }

            else
            {
              //  guess is greater than objective, decrease and update right pointer == ending position
              rightPointer = middlePosition - 1;
            }
        }
        // if the objective was not in the array, then return -1
        return -1;
    }

}