package lesson_04;

public class GetLongestCommonPrefix {
    // {'catapult', 'cat', 'catastrophic'}
    public String getCommonLongestPrefix(String[] words) {
        // if no items in the input array, then return an empty string
        if (words.length == 0) {
            return "";
        }

        // initialize stopping index outside both loops
        int stoppingIndex = 0;
        // initialize boolean flag to stop outer loop
        boolean shouldStop = false;
        // selection an arbitrary string to compare with the rest of the strings
        // outer loop definition: c = 0 -> 'c' ; c = 1 -> a : c = 2 -> 't'
        for (int c = 0; c < words[0].length(); c++) {

            // check for boolean flag to decide if continue with iterations
            if (shouldStop) {
                break;
            }
            // inner loop definition:
            for (int s = 0; s < words.length; s++) {
                //  c -> 'c' -> [0: 'c' == 'c', 1: 'c' == 'c' ; 2: 'c' == 'c']
                // c = 3 , 3 >= 3 -> break
                if (c >= words[s].length() || (words[s].charAt(c) != words[0].charAt(c))) {
                    stoppingIndex-= 1;
                    shouldStop = true;
                    break;
                }
            }
            // 'c' -> [0,1,2]
            stoppingIndex += 1;
        }

        return words[0].substring(0, stoppingIndex);
}
}
