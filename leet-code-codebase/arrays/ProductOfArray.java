// 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.


class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int countZero = 0;
        int prod = 1;
        for(int num : nums) {
            if(num == 0) countZero++;
            else prod = prod * num;
            if(countZero == 2){
                Arrays.fill(nums, 0);
                return nums;
            }

        } 
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) nums[i] = prod;
            else if(countZero == 1) nums[i] = 0;
            else nums[i] = prod / nums[i];
        }
        return nums;
    }
}