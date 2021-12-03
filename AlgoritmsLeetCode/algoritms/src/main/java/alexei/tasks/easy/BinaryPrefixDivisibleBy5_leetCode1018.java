package alexei.tasks.easy;

// We define xi as the number whose binary representation is the subarray nums[0..i]
// (from most-significant-bit to least-significant-bit).
//
//        For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
//        Return an array of booleans answer where answer[i] is true if xi is divisible by 5.
//
//        Example 1:
//        Input: nums = [0,1,1]
//        Output: [true,false,false]
//        Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
//        Only the first number is divisible by 5, so answer[0] is true.

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5_leetCode1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            double sum = 0;
            double current = 0;
            double count = 0;
            for (int j = i; j >= 0; j--) {
                if (nums[j] == 1) {
                    current = Math.pow(2, count);
                    sum = nums[j] * current + sum;
                }
                count++;
            }
            if (sum % 5 == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}