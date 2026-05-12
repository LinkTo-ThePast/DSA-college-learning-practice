package lesson_07;

public class BinarySearch {

    /**
     * Requirements for binary search: 1) a sorted array, 2) an item to find.
     * Returns -1 if the item was not found in the array.
     * */
    int[] sorted_array;
    int item;

    public int findNumber(int[] sorted_array, int item) {
       // array has to contain at least one element
        if (sorted_array.length == 0) {
            throw new IllegalArgumentException("The input array must contain at least one element.");
        }

        // implementation approach
        // select initial and ending position, so we can access to the middle position and with that, to the first guess
        int initialPosition = 0;
        int endingPosition = sorted_array.length - 1;

        // iterate until the initial position is reached by the ending position
        while (initialPosition <= endingPosition)
        {
            // iterate over the array and in each cycle, our guess is going to be right at the middle
            int middlePosition = Math.floorDiv(initialPosition + endingPosition, 2);
            // find item just at the middle as first try or attempt
            int guess = sorted_array[middlePosition];

            // then we can compare
            if (guess == item)
            {
                return middlePosition;
            }
            // if the guess is greater than the item, that means that any guess greater than the first guess is already invalid
            // no need to try with other items located to the right of the first guess, thus we need to update the ending position to the left of the first guess
            else if (guess > item)
            {
                endingPosition = middlePosition - 1;
            }
            else
            {
                initialPosition = middlePosition + 1;
            }
        }

        // item was not present in the array, so return a -1
        return  -1;
    }
}
