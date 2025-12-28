// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Problem Link :- https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array


class SingleNumber {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int i=0; i<nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}