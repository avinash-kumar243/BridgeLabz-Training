// 169. Majority Element

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


import java.util.*;
public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int result = 0;
        for(Map.Entry<Integer, Integer> emt : map.entrySet()) {
            if(emt.getValue() > n / 2) {
                result = emt.getKey();
                break;
            }
        }
        return result;
    }
	public static void main(String args[]) {
		int nums[] = {2, 2, 1, 1, 3, 1, 2, 6, 2};
		
		int result = majorityElement(nums);
		System.out.println("Majority Element is: " + result);
	}
}