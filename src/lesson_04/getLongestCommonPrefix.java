package lesson_04;

public class getLongestCommonPrefix {
    public String getCommonLongestPrefix(String[] words) {
        if (words.length == 0) {
            return "";
        }
        String commonPrefix = "";
        for(int i = 0; i < words[0].length(); i++) {
            for(int s = 0; s < words.length; s++) {
                if (words[s].charAt(i) != words[0].charAt(i) || i == words[s].length()) {
                    return commonPrefix;
                }
                commonPrefix = commonPrefix + words[0].charAt(i);
            }
        }
        return commonPrefix;

    }
}
