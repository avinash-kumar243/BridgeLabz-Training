// Given an integer array nums, return true if any value appears at least twice
// in the array, and return false if every element is distinct
// Problem Link :- https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array


class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
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
}