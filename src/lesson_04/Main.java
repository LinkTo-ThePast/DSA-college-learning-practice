package lesson_04;

public class Main {
    public static void main(String[] args) {
       String[] testArr = {"car", "red", "yellowstone"};
        GetLongestCommonPrefix getPrefix = new GetLongestCommonPrefix();
        System.out.println("Longest common prefix in the array is: " + getPrefix.getCommonLongestPrefix(testArr));
    }
}
