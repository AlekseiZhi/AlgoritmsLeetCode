package alexei.tasks;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfHomogenousSubstrings1759 {

    /**
     * Input: lowerString = "abbcccaa"
     * Output: 13
     * Explanation: The homogenous substrings are listed as below:
     * "a"   appears 3 times.
     * "aa"  appears 1 time.
     * "b"   appears 2 times.
     * "bb"  appears 1 time.
     * "c"   appears 3 times.
     * "cc"  appears 2 times.
     * "ccc" appears 1 time.
     * 3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
     */

    public int countHomogenous(String s) {
        int count = 0;
        Set<String> setChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            while (i < s.length() - 1) {
                setChars.add(str);
                i++;
                if (s.substring(i, i + 1).equals(s.substring(i - 1, i))) {
                    str = str + s.charAt(i);
                } else {
                    str = s.substring(i, i + 1);
                }
            }
            setChars.add(str);
        }
        for (String as : setChars) {
            for (int k = 0; k < s.length(); k++) {
                if (!(s.indexOf(as, k) == -1)) {
                    k = s.indexOf(as, k);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfHomogenousSubstrings1759 co = new CountNumberOfHomogenousSubstrings1759();
        String str = "abbcccaa";
        System.out.println(co.countHomogenous(str));
    }
}