// LeetCode - 39. Combination Sum

// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where
// the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.


public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();

        helper(al, new ArrayList<>(), nums, target, 0);
        return al;
    }
    public void helper(List<List<Integer>> al, List<Integer> list, int nums[], int remain, int st) {
        int n = nums.length;
        if(remain < 0) return;
        else if(remain == 0) al.add(new ArrayList<>(list));
        else { 
            for(int i = st; i < n; i++){
                list.add(nums[i]);
                helper(al, list, nums, remain - nums[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}