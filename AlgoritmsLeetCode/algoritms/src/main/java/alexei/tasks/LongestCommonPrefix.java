package alexei.tasks;
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//
//        Example 2:
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] inputString) {
        String result = "";
        boolean isTrue = true;
        for (int i = 0; i < inputString[0].length(); i++) {
            String stringTemp = String.valueOf(inputString[0].charAt(i));
            for (int j = 1; j < inputString.length; j++) {
                if (i<inputString[j].length()) {
                    String str1 = String.valueOf(inputString[j].charAt(i));
                    if (!str1.equals(stringTemp)) {
                        isTrue = false;
                        break;
                    }
                } else {
                    isTrue = false;
                }
            }
            if (isTrue) {
                result = result + stringTemp;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] str = {"ab","a"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(str));
    }
}