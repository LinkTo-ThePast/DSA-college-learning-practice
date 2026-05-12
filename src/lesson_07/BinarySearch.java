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

        // iterate over the array and in each cycle, our guess is going to be right at the middle
        int middlePosition = Math.floorDiv(initialPosition + endingPosition, 2);
    }
}
