package lesson_01;

public class Main {
    public static void main(String[] args) {

        // testing
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicatesSortedArray getUniqueItems = new RemoveDuplicatesSortedArray();
        int uniqueItems = getUniqueItems.returnNumberOfUniqueItems(nums);
        System.out.println("Total unique elements within the testing array: " + uniqueItems);
    }
}
