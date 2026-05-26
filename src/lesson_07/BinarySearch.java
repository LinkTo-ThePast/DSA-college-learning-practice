package lesson_07;

public class BinarySearch {

    /**
     * Requirements for binary search: 1) a sorted array, 2) an item to find.
     * Returns found item index
     * Returns -1 if the item was not found in the array.
     * */
    int[] sorted_array; // TODO: learn how to use encapsulation
    int item;

    public int findNumber(int[] sorted_array, int item) {

        // let´s track initial state for indices
        int initialPosition = 0;
        int endingPositon = sorted_array.length - 1;

        while (initialPosition >= endingPositon) {

            int middlePosition = Math.floorDiv((initialPosition + endingPositon), 2);
            int guess = sorted_array[middlePosition];

            if (guess == item) {
                return middlePosition;
            }
        }
    }
}
