// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


public int majorityElement(int[] nums) {
	HashMap<Integer, Integer> map = new HashMap<>();
	int n = nums.length;
	for(int num : nums) {
		map.put(num, map.getOrDefault(num, 0) + 1);
	}
	int ans = 0;
	for (Map.Entry<Integer, Integer> val : map.entrySet()) {
		if(val.getValue() > n/2) {
			ans = val.getKey();
			break;
		}
	}
	return ans;
}