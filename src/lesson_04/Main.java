package lesson_04;

public class Main {
    public static void main(String[] args) {
       String[] testArr = {"cat", "catapult", "catastrophic"};
        GetLongestCommonPrefix getPrefix = new GetLongestCommonPrefix();
        System.out.println("Longest common prefix in the array is: " + getPrefix.getCommonPrefix(testArr));
    }
}
