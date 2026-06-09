package lesson_08;

public class Main {

    public static void main(String[] args)
    {
        LongestCommonPrefixV2 getPrefix = new LongestCommonPrefixV2();

        String[] words = {"cat", "catapult", "catherine"};
        String result = getPrefix.getLongestCommonPrefix(words);
        System.out.println("Common prefix is " + result);
    }

}
