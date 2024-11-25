package org.karthik;

import java.util.HashMap;
import java.util.Map;

/**
 * Finds two indices in the array that sum up to  target value.
 *
 * This solution uses a HashMap to store the values encountered throughout iteration.
 * The complement (target - current number) is checked in the map for each number.
 * If found the current number and its complement are returned as a result.
 *
 * @param nums   An array of integers representing the numbers.
 * @param target The target sum we are trying to find.
 * @return An array of two integers representing the indices of the numbers that sum up to the target.
 *         Returns an empty array if no solution exists.
 *
 * Time Complexity: O(n), where n is the number of elements in the array.
 * Space Complexity: O(n), due to the space required by the HashMap.
 */

public class TwoSum {
        public int[] twoSum(int[] nums, int target){
            Map<Integer, Integer> numMap = new HashMap<>();
            int n = nums.length;

            for(int i = 0; i < n; i++){
                int complement = target - nums[i];

                if(numMap.containsKey(complement)){
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }
            return new int[]{};
        }
    }
