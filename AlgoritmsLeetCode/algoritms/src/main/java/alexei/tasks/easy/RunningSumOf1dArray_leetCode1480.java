package alexei.tasks.easy;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//
//        Example 1:
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//
//        Example 2:
//        Input: nums = [1,1,1,1,1]
//        Output: [1,2,3,4,5]
//        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//
//        Example 3:
//        Input: nums = [3,1,2,10,1]
//        Output: [3,4,6,16,17]
public class RunningSumOf1dArray_leetCode1480 {

    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                count = count + nums[j];
            }
            newArr[i] = count;
        }
        return newArr;
    }
}