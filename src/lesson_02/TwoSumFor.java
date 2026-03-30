package lesson_02;

public class TwoSumFor {

    private int[] nums;
    private int target;

    public int[] twoSum(int[] nums, int target) {
        // case 1. nums is empty or just one element, then early return
        if (nums.length <= 1 ) {
            return new int[]{};
        }

        // case 2. general case
        // base case: nums = [2,4,5,1,6], target = 6
        for(int i = 0; i < nums.length; i++) {
            // left pointer = i
            int leftPointer = nums[i];
            System.out.println(nums[i]);
            // second or right pointer is j
            for (int j = i + 1; j < nums.length; j++) {
                int rightPointer = nums[j];
                System.out.println(nums[j]);
                System.out.println("Adding up: " + nums[i] + " + " + nums[j]);
                System.out.println("Indices: " + i + j);
                if (leftPointer + rightPointer != target) {
                    continue;
                }
                return new int[]{i,j};
            }
        }

        // case 3. any solution was found, return an empty array
        return new int[]{};
}}
