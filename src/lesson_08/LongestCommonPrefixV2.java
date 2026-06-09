package lesson_08;

public class LongestCommonPrefixV2 {

    private final String[] strs = {"flow", "flower", "flight"};

    public String getLongestCommonPrefix(String[] strs)
    {
        // select arbitrary string
        // in this case, I will go with second ome
        String arbitraryStr = strs[1];

        // inner cycle: iterate over each character in our selected string
        for (int i = 0; i < arbitraryStr.length(); i++)
        {
            for (int j = 0; j < strs.length; j++)
            {
                if (i > strs[j].length() || (arbitraryStr.charAt(i) != strs[j].charAt(i))) {
                    break;
                }
            }
            // extract common character

        }
    }

}
