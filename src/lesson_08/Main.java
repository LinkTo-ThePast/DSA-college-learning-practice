package lesson_08;

public class Main {

    public static void main(String[] args)
    {
        LongestCommonPrefixV2 getPrefix = new LongestCommonPrefixV2();

        String[] words = {"car", "thalamus", "flight", "flower", "flow"};
        String result = getPrefix.getCommonPrefix(words);3
        System.out.println("Common prefix is " + result);
    }

}
