// Given two arrays of strings list1 and list2, find the common strings with the least index sum.

// A common string is a string that appeared in both list1 and list2.

// A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

// Return all the common strings with the least index sum. Return the answer in any order.


public String[] findRestaurant(String[] list1, String[] list2) {
	int n = list1.length;
	int m = list2.length;
	HashMap<String,Integer> map1 = new HashMap<>();
	for(int i=0; i<n; i++) {
		String s = list1[i];
		map1.put(s, i);
	}

	HashMap<String, Integer> map2 = new HashMap<>();
	for(int i=0; i<m; i++) {
		String s = list2[i];
		if(map1.containsKey(s)) {
			int idx1 = map1.get(s);
			int idx2 = i;
			map2.put(s, idx1 + idx2);
		}
	}
	ArrayList<String> ans = new ArrayList<>();
	int idx = Integer.MAX_VALUE;
	for(Map.Entry<String, Integer> entry : map2.entrySet()) {
		String key = entry.getKey();
		Integer val = entry.getValue();

		if(val < idx) {
			ans.clear();
			ans.add(key);
			idx = val;
		} else if (val == idx) {
			ans.add(key);
			idx = val;
		}
	}
	return ans.toArray(new String[0]);
}