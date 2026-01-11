// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


import java.util.*;
class DuplicateCheck {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
		
        for(int num : nums) {
            set.add(num);
        }
		
        if(set.size() == n ){
            return false;
        }
        return true;
    }
	public static void main(String args[]) {
		int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		
		boolean result = containsDuplicate(nums);
		System.out.println("Contains duplicate: " + result);
	}
}