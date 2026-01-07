// 162. Find Peak Element

// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

// You must write an algorithm that runs in O(log n) time.


class PeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        while(st < end) {
            int mid = (st + end) / 2;
            
            if(nums[mid] < nums[mid + 1]) st = mid + 1;
            else end = mid;
        }
        return st;
    }
}