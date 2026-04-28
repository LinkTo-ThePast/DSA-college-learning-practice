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

        // lowest item in the array
        int lowValue = 0; // representing index 0 of the array
        // select maximum possible value
        int highValue = sorted_array[sorted_array.length - 1];

        // search through in the middle of the array
        int middleValue = Math.floorDiv(highValue + lowValue, 2);

        // begin to search
        //  1st case: middleValue is less than the item, then update the lowest value so now can be more than previous middleValue
        if (middleValue < item) {
            lowValue = middleValue + 1;
        }




    }
}
