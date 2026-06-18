package lesson_04;

public class GetLongestCommonPrefix {
    // {'catapult', 'cat', 'catastrophic'}
    public String getCommonLongestPrefix(String[] words)
    {
        // exception: input from user type of error
        if ( words == null  || words.length <=  1) {
            throw new IllegalArgumentException("Empty arrays or with just one item are not allowed. Please, try again.");
        }

        // initialize a finalIndex to use in substring method
        int finalIndex = 0;
        // shouldStop
        boolean shouldStop = false;

        // approach: select an arbitrary string and iterate over all its characters
        // in this case, arbitrary string == words[0]
        // outer for cycle: keep track of arbitrary string characters

        // all strings in the array (n)
        for (int i = 0; i < words[0].length(); i++)
        {

            if (shouldStop)
            {
                break;
            }

             // inner for cycle: keep track of characters from all the remaining strings
            for (int j = 0; j < words.length; j++)
            {
                // i = 0 and j = 0 --> 'c' / 'c' / 'c'
                // i = 3, j = 3
                if (i >= words[j].length() || (words[0].charAt(i) != words[j].charAt(i)))
                {
                    // current character of arbitrary string != current character of current string
                    // if the cycle is being broken at this iteration, subtract by one finalIndex because current character is no longer part of a common prefix
                    finalIndex -= 1;
                    shouldStop = true;
                    break;
                }
                finalIndex += 1;
            }
        }

        return words[0].substring(0, finalIndex);
    }
}
