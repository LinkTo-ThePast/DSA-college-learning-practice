package lesson_08;

public class LongestCommonPrefixV2 {

    // ONE INPUT
    String[] strArray;

    public String getCommonPrefix(String[] strArray)
    {
        // CONSTANTS
        int stoppingIndex = 0;
        boolean shouldStop = false;


        // FIRST EDGE CASE DETECTED: to find a common sequence, we need more one item in the array
        if (strArray.length <= 1) {
            throw new IllegalArgumentException("Array of strings must contain at least two elements.");
        }

        // BEGIN WITH SOLUTION
        // 1. SELECT ONE ARBITRARY string, in this case, the first one
        String selectedString = strArray[0];
        // 2. ITERATE OVER EACH CHARACTER in that string
        for (int c = 0; c < strArray[0].length(); c++)
        {
            if (shouldStop)
            {
                break;
            }

            // FIRST CYCLE: start to build a sequence of characters
            char currentCharacter = selectedString.charAt(c);
            // THEN, compare currentCharacter: is that character in other strings?
            // 3. SELECT THE FIRST CHARACTER IN OTHER STRINGS
            for (int s = 0; s < strArray.length; s++)
            {
                // IF current character is not equal to the comparing character, then is not part of the common PREFIX if there is one
                if (strArray[0].charAt(c) != strArray[s].charAt(c)) {
                    shouldStop = true;
                    stoppingIndex -= 1;
                    break;
                }

            }
            // if the characters are EQUAL
            stoppingIndex += 1;
        }
        return strArray[0].substring(0, stoppingIndex);
    }
}
