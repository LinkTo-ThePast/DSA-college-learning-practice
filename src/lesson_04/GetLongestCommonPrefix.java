package lesson_04;

public class GetLongestCommonPrefix {
    /**
     * This method receives a non-empty static array of Strings and returns the longest valid prefix
     * @param words: non-empty static array of strings
     * @return the longest common prefix within the words in the array
     */
    public String getCommonPrefix(String[] words)
    {
        // strategy: 1) select an arbitrary string and iterate over all its characters
        // 2) at the same time, iterate over the characters in the remaining strings

        // keep track and update every time an inner cycle complete without breaking, that means
        // we found a common character among all the strings
        int finalStoppingIndex = 0;

        // common prefix means: a common character among ALL THE STRINGS, if even one check fails, then there is no common prefix
        boolean thereIsCommonPrefix = true;

        // outer for cycle: iterating over the characters of an arbitrary string = words[0]
        for (int c = 0; c < words[0].length(); c++)
        {
            for (int j = 0; j < words.length; j++)
            {
                // 3) compare characters: if they are not the same, then there is no longer common prefix
                // note: caution with out of bounds exception
                // for arbitrary string there is no problem, but for other strings maybe a shorter string that index c
                if (c >= words[j].length() || (words[0].charAt(c) != words[j].charAt(c)))
                {
                    thereIsCommonPrefix = false;
                    break;
                }
            }
            finalStoppingIndex++;
        }

        return words[0].substring(0, finalStoppingIndex);
    }
}