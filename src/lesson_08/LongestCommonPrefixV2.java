package lesson_08;

public class LongestCommonPrefixV2 {

    private final String[] strs = {"flow", "flower", "flight"};

    public String getLongestCommonPrefixV2(String[] strs)
    {
        // 1. extract the first character of an arbitrary string,
        // ARBITRARY STRING = FIRST ONE
        // COMPARE EVERY character of ARBITRARY STRING
        String arbitraryString = strs[0];
        for (int i = 0; i < arbitraryString.length(); i++) {
            for (int j = 0; j < strs.length; j++)
            {
                // IF THE CHARACTER IS THE SAME FOR EVERY OTHER STRING, STORE IT OR KEEP TRACK
                    if ((strs[j].charAt(i) != arbitraryString.charAt(i)) || c >= strs[j].length())
                    {
                        break;
                    }
            }
        }
    }

}
