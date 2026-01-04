package lesson_01;

public class RemoveDuplicatesSortedArray {
    // testing cases

    int[] numsTets1 = {0,0,0,1,1,1,2,2,3,3,4};
    int[] numsTest2 = {0,0,0,1,1,1,3,3,5,5,10};

    // final k = total unique elements within an array
    int k;

    public int getTotalUniqueElements(int[] nums) {

        // initialize a pointer to keep track of position
        int left_pointer = 1;
        //
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[left_pointer] = nums[i];
                left_pointer++;
            }
        }
        k = left_pointer;

        return k;
    }
}
