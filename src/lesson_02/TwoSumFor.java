package lesson_02;

public class TwoSumFor {
    // methods
    public int[] getIndices(int[] arr, int target) {

        // 1. assure we actually have items on arr
        if (arr.length == 0) {
            return new int[]{};
        }

        // iterate over array
        for (int i = 0; i < arr.length; i++) {
            int left_pointer = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int right_pointer = arr[j];

                if (left_pointer + right_pointer == target) {
                    return new int[]{i,j};
                }
            }
        }

        // no solution found
        return new int[]{};
    }
}
