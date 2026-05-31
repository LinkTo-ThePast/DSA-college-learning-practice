package lesson_08;

public class LongestCommonPrefixV2 {

    // ONE INPUT
    String[] strArray;

    public string getCommonPrefix(String[] strArray)
    {
        // FIRST EDGE CASE DETECTED: to find a common sequence, we need more one item in the array
        if (strArray.length <= 1) {
            throw new IllegalArgumentException("Array of strings must contain at least two elements.");
        }

        // BEGIN WITH SOLUTION
        // 1. SELECT ONE ARBITRARY string, in this case, the first one
        for (int i = 0; i < strArray[0].length(); i++)
        {
            // 2. comparison between each subsequent character in the next strings
            for (int s = 0; s < strArray.length; i++) {
                if (strArray[0][i] =! strArray[i][s])
                {

                }
            }
        }

    }
}
