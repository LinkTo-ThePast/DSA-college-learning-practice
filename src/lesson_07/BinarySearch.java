package lesson_07;


public class BinarySearch {
    // data structure used in this problem -> static sequence
    int[] nums;
    int objective;

    public int findNumber(int[] nums, int objective) {
        // initial position within the array
        int leftPointer = 0;
        // ending position within the array
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer)
        {

            int middlePosition = Math.floorDiv((leftPointer + rightPointer), 2);
            int guess = nums[middlePosition];

            // success case: guess is equal to objective
            if (guess == objective) {
                return middlePosition;
            }
            // case 1: guess is greater than objective, hence we update right pointer
            else if (guess >  objective) {
                rightPointer = middlePosition - 1;
            }
            // case 2: guess is less than objective, hence we update left pointer
            else {
                leftPointer = middlePosition + 1;
            }
        }

        return -1;
    }

}