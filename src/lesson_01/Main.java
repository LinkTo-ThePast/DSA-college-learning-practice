package lesson_01;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray getRemove = new RemoveDuplicatesSortedArray();
        int[] testCase = getRemove.numsTets1;
        int uniqueElements = getRemove.getTotalUniqueElements(testCase);
        System.out.println("Unique elements in array: " + uniqueElements);
    }
}
