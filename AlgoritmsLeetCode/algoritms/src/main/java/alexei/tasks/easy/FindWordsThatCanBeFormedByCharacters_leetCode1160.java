package alexei.tasks.easy;
//You are given an array of strings words and a string chars.
//A string is good if it can be formed by characters from chars (each character can only be used once).
//Return the sum of lengths of all good strings in words.
//
//        Example 1:
//        Input: words = ["cat","bt","hat","tree"], chars = "atach"
//        Output: 6
//        Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//
//        Example 2:
//        Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//        Output: 10
//        Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

import java.util.ArrayList;
import java.util.List;

public class FindWordsThatCanBeFormedByCharacters_leetCode1160 {


    public int countCharacters(String[] words, String chars) {
        boolean[] isUse = new boolean[chars.length()];
        List<String> newWords = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int l = 0; l < chars.length(); l++) {
                isUse[l] = false;
            }
            String currentWordByChars = "";
            for (int j = 0; j < words[i].length(); j++) {
                String str = String.valueOf(words[i].charAt(j));
                for (int k = 0; k < chars.length(); k++) {
                    if (str.equals(chars.substring(k, k + 1))) {
                        if (!isUse[k]) {
                            currentWordByChars = currentWordByChars + str;
                            isUse[k] = true;
                            break;
                        }
                    }
                }
            }
            if (currentWordByChars.equals(words[i])) {
                newWords.add(currentWordByChars);
            }
        }
        for (int g = 0; g < newWords.size(); g++) {
            count = count + newWords.get(g).length();
        }
        return count;
    }
}