package lesson_01;

public class RemoveDuplicatesSortedArray {
    // data structure studied in this problem: array.

    int[] arr = {1,1,1,2,2,2,3,3,3,4};

    int itemOne = arr[0]; // ---> itemOne = 1

    // arr [i] == arr[j] , then remove i and j
    public int[] getUniqueElements(int[] duplicatesArray)
    {
        // duplicated items
        int[] duplicatedItems;

        for (int i = 0; i < duplicatesArray.length; i++)
        {
            int currentItem = duplicatesArray[i];
            int nextItem = duplicatesArray[i+1];

            if (currentItem == nextItem)
            {
                // remove both current and next item

            }

            else
            {
                continue;
            }

        }

        return new int[]{};
    }

}