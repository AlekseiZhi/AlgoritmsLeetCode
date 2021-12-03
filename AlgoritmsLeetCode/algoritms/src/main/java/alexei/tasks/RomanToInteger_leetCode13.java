package alexei.tasks;
//For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//
//        Example 1:
//        Input: s = "III"
//        Output: 3
//
//        Example 2:
//        Input: s = "IV"
//        Output: 4

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_leetCode13 {

    public int romanToInt(String s) {
        int count = 0;
        Map<Integer, String> romanMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            romanMap.put(i, str);
            if (i < s.length() - 1) {
                if ((str + s.charAt(i + 1)).equals("IV") || (str + s.charAt(i + 1)).equals("IX") ||
                        (str + s.charAt(i + 1)).equals("XL") || (str + s.charAt(i + 1)).equals("XC")
                        || (str + s.charAt(i + 1)).equals("CD") || (str + s.charAt(i + 1)).equals("CM")) {
                    str = str + s.charAt(i + 1);
                    romanMap.put(i, str);
                    i++;
                }
            }
        }
        for (String str : romanMap.values()) {
            switch (str) {
                case "I":
                    count = count + 1;
                    break;
                case "V":
                    count = count + 5;
                    break;
                case "X":
                    count = count + 10;
                    break;
                case "L":
                    count = count + 50;
                    break;
                case "C":
                    count = count + 100;
                    break;
                case "D":
                    count = count + 500;
                    break;
                case "M":
                    count = count + 1000;
                    break;
                case "IV":
                    count = count + 4;
                    break;
                case "IX":
                    count = count + 9;
                    break;
                case "XL":
                    count = count + 40;
                    break;
                case "XC":
                    count = count + 90;
                    break;
                case "CD":
                    count = count + 400;
                    break;
                case "CM":
                    count = count + 900;
                    break;
            }
        }
        return count;
    }
}