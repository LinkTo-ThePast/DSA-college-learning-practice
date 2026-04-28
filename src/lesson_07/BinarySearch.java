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
            throw new IllegalArgumentException("The sorted arrays needs to have at least one item. The array length provided was: " + sorted_array.length);
        }

        // lowest item in the array
        int lowValue = 0; // representing index 0 of the array
        // select maximum possible value
        int highValue = sorted_array.length - 1;

        while (lowValue <= highValue) {
            // search through in the middle of the array
            int middleValue = Math.floorDiv(highValue + lowValue, 2);
            int guess = sorted_array[middleValue];

            System.out.println(lowValue); // 0
            System.out.println(highValue); // 5
            System.out.println(middleValue); // 2


            // check if the guess is correct
            if (guess == item) {
                //  2 == 5?
                return middleValue;
            }

            // first search: item is greater than middle value, if so, increment low value up to middle value
            if (guess < item) {
                lowValue = middleValue + 1;
            } else {
                highValue = middleValue - 1;
            }
        }

        return -1;

    }
}
