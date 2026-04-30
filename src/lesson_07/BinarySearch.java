package lesson_07;

public class BinarySearch {

    /**
     * Requirements for binary search: 1) a sorted array, 2) an item to find.
     * Returns -1 if the item was not found in the array.
     * */
    int[] sorted_array;
    int item;

    public int findNumber(int[] sorted_array, int item) {
        if (sorted_array.length == 0) {
            throw new IllegalArgumentException("The array needs to have at least one element!");
        }

        int initialPosition = 0;
        int endingPosition = sorted_array.length - 1;

        while (initialPosition  <=  endingPosition) {

            // middle position
            int middlePositon = Math.floorDiv(initialPosition + endingPosition, 2);
            int guess = sorted_array[middlePositon];

            if (guess == item) {
                return middlePositon;
            }

            if (item < guess) {
                endingPosition  = middlePositon - 1;
            } else {
                initialPosition = middlePositon + 1;
            }
        }

        return -1;
    }
}
