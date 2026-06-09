package lesson_08;

public class LongestCommonPrefixV2 {

    private final String[] strs = {"flow", "flower", "flight"};

    public String getLongestCommonPrefix(String[] strs)
    {
        // FINAL INDEX TO TRACK COMMON PREFIX
        int stoppingIndex = 0;

        // STOP OUTER CYCLE TO PREVENT out of bounds exception
        boolean isOutOfBounds = false;

        // select arbitrary string
        // in this case, I will go with second ome
        String arbitraryStr = strs[1];

        // inner cycle: iterate over each character in our selected string
        for (int i = 0; i < arbitraryStr.length(); i++)
        {
            if (isOutOfBounds)
            {
                break;
            }

            for (int j = 0; j < strs.length; j++)
            {
                if (i >= strs[j].length() || (arbitraryStr.charAt(i) != strs[j].charAt(i))) {
                    isOutOfBounds = true;
                    // 0 -> f, 1 -> l, 2 -> o,o,i
                    stoppingIndex -= 1;
                    break;
                }
            }
            // extract common character
            stoppingIndex += 1;
        }
        return arbitraryStr.substring(0, stoppingIndex);
    }

}
