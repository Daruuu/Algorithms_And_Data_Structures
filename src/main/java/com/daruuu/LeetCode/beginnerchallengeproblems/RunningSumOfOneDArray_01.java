package com.daruuu.LeetCode.beginnerchallengeproblems;

public class RunningSumOfOneDArray_01 {
    /*
    https://leetcode.com/problems/running-sum-of-1d-array/description/
    1480. Running Sum of 1d Array
    Hint
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.

    Example 1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    Example 2:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

    Example 3:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]

    Constraints:
        1 <= nums.length <= 1000
        -10^6 <= nums[i] <= 10^6
     */

    /**
     * The space complexity of this function is O(n):
     * because we declare a new array RESULT of size N to store the running of
     * SUM and access the previous value to calculate the next value.
     */
    public static int []    runningSum(int [] nums)
    {
        if (nums == null || nums.length == 0)
            return (new int[0]);

        int []  result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return (result);
    }

    public static int[] runningSumV1(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int[] result = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

}
