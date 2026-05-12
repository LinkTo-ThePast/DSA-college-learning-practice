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
    }
}
