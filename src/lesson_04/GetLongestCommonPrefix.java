package lesson_04;

public class GetLongestCommonPrefix {
    // {'catapult', 'cat', 'catastrophic'}
    public String getCommonLongestPrefix(String[] words) {
        if (words.length == 0) {
            return "";
        }

        // break condition
        boolean isMismatch = false;
        // stopping index == i; words[0] get -> chars from (0,i)
        int stoppingIndex = 0;
        // decision: arbitrary string to compare with the rest of the strings: words[0]
        // outer loop: iterate over arbitrary string ['c'] --> lock up character
        for (int c = 0; c < words[0].length(); c++) {
            if (isMismatch) {
                break;
            }
            // let's check on every character for every string
            char currentArbitraryChar = words[0].charAt(c);
            // inner loop: verify if the locked up char is the same in every word
            for (int s = 0; s < words.length; s++) {
                if (c == words[s].length() || words[s].charAt(c) != currentArbitraryChar) {
                    isMismatch = true;
                    stoppingIndex -= 1;
                    break;
                }
            }
            // if inner loops didn't  break, then update stopping index equal to i;
            stoppingIndex = c;
        }
        return words[0].substring(0,stoppingIndex);
    }
}
