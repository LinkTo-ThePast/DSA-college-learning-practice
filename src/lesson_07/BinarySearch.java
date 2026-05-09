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
           throw new IllegalArgumentException("Array must have at least one element.");
       }

       // selecting initial and ending index position
       int initialPositon = 0;
       int endingPosition = sorted_array.length - 1;

       while (initialPositon <= endingPosition) {
           int middlePosition = Math.floorDiv((initialPositon + endingPosition), 2);
           int guess = sorted_array[middlePosition];

           // guess is equal to the value we are searching for
           if (guess == item) {
               return middlePosition;
           }
           else if (guess > item) {
               endingPosition = middlePosition - 1;
           }
           else
           {
               initialPositon = middlePosition + 1;
           }
       }
        // item was not found
        return -1;
    }
}
