package lesson_02;

public class TwoSumFor {

    // attributes
    int[] nums;
    int target;

    // methods
    public int[] getIndices(int[] nums, int target) {

        // check invalid input array
        if (nums.length == 0) {
            // return an empty array
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            // check for current value ( i = left pointer )
            int leftPointer = nums[i];
            // establish right pointer
            for (int j = i+1; j < nums.length; j++) {
                int rightPointer = nums[j];

                // check if sum result on target
                if (leftPointer + rightPointer == target) {
                    return new int[] {i,j};
                }
            }
        }

        // no solution found, return an empty array
        return new int[]{};
    }
}
