package lesson_07;

public class BinarySearch {

    /**
     * Requirements for binary search: 1) a sorted array, 2) an item to find.
     * */
    int[] sorted_array;
    int item;

    public int findNumber(int[] sorted_array, int item) {

        if (sorted_array.length == 0) {
            throw new IllegalArgumentException("The sorted arrays needs to have at least one item. The array length provided was: " + sorted_array.length);
        }

        // select lowest possible value
        int lowestValue = sorted_array[0];
        // select maximum possible value
        int maximumValue = sorted_array[sorted_array.length - 1];


    }
}
