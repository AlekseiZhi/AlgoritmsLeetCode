package alexei.tasks;
//For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given an integer, convert it to a roman numeral.
//
//        Example 1:
//        Input: num = 3
//        Output: "III"
//
//        Example 2:
//        Input: num = 4
//        Output: "IV"
//
//        Example 3:
//        Input: num = 9
//        Output: "IX"

import java.util.HashMap;
import java.util.Map;


public class IntegerToRoman_leetCOde12 {

    public String intToRoman(int number) {
        String sum = "";
        Map<String, Map<Integer, String>> romanMap = new HashMap<>();
        Map<Integer, String> romanMapUnits = getRomanMapUnits();
        Map<Integer, String> romanMapTens = getRomanMapTens();
        Map<Integer, String> romanMapHundreds = getRomanMapHundreds();
        Map<Integer, String> romanMapThousands = getRomanMapThousands();

        romanMap.put("units", romanMapUnits);
        romanMap.put("tens", romanMapTens);
        romanMap.put("hundreds", romanMapHundreds);
        romanMap.put("thousands", romanMapThousands);
        String str = String.valueOf(number);
        if (str.length() == 4) {
            sum = romanMap.get("thousands").get(number / 1000);
            number = number - number / 1000 * 1000;
            sum = sum + romanMap.get("hundreds").get(number / 100);
            number = number - number / 100 * 100;
            sum = sum + romanMap.get("tens").get(number / 10);
            number = number - number / 10 * 10;
            sum = sum + romanMap.get("units").get(number);
        }
        if (str.length() == 3) {
            sum = romanMap.get("hundreds").get(number / 100);
            number = number - number / 100 * 100;
            sum = sum + romanMap.get("tens").get(number / 10);
            number = number - number / 10 * 10;
            sum = sum + romanMap.get("units").get(number);
        }
        if (str.length() == 2) {
            sum = sum + romanMap.get("tens").get(number / 10);
            number = number - number / 10 * 10;
            sum = sum + romanMap.get("units").get(number);
        }
        if (str.length() == 1) {
            sum = sum + romanMap.get("units").get(number);
        }

        return sum;
    }

    private Map<Integer, String> getRomanMapThousands() {
        Map<Integer, String> romanMapThousands = new HashMap<>();
        romanMapThousands.put(0, "");
        romanMapThousands.put(1, "M");
        romanMapThousands.put(2, "MM");
        romanMapThousands.put(3, "MMM");
        return romanMapThousands;
    }

    private Map<Integer, String> getRomanMapHundreds() {
        Map<Integer, String> romanMapHundreds = new HashMap<>();
        romanMapHundreds.put(0, "");
        romanMapHundreds.put(1, "C");
        romanMapHundreds.put(2, "CC");
        romanMapHundreds.put(3, "CCC");
        romanMapHundreds.put(4, "CD");
        romanMapHundreds.put(5, "D");
        romanMapHundreds.put(6, "DC");
        romanMapHundreds.put(7, "DCC");
        romanMapHundreds.put(8, "DCCC");
        romanMapHundreds.put(9, "CM");
        return romanMapHundreds;
    }

    private Map<Integer, String> getRomanMapTens() {
        Map<Integer, String> romanMapTens = new HashMap<>();
        romanMapTens.put(0, "");
        romanMapTens.put(1, "X");
        romanMapTens.put(2, "XX");
        romanMapTens.put(3, "XXX");
        romanMapTens.put(4, "XL");
        romanMapTens.put(5, "L");
        romanMapTens.put(6, "LX");
        romanMapTens.put(7, "LXX");
        romanMapTens.put(8, "LXXX");
        romanMapTens.put(9, "XC");
        return romanMapTens;
    }

    private Map<Integer, String> getRomanMapUnits() {
        Map<Integer, String> romanMapUnits = new HashMap<>();
        romanMapUnits.put(0, "");
        romanMapUnits.put(1, "I");
        romanMapUnits.put(2, "II");
        romanMapUnits.put(3, "III");
        romanMapUnits.put(4, "IV");
        romanMapUnits.put(5, "V");
        romanMapUnits.put(6, "VI");
        romanMapUnits.put(7, "VII");
        romanMapUnits.put(8, "VIII");
        romanMapUnits.put(9, "IX");
        return romanMapUnits;
    }

    public static void main(String[] args) {
        int number = 3994;
        String s = String.valueOf(number);
        System.out.println(number / 1000);
        IntegerToRoman_leetCOde12 integerToRomanLeetCOde12 = new IntegerToRoman_leetCOde12();
        System.out.println(integerToRomanLeetCOde12.intToRoman(number));
    }
}
