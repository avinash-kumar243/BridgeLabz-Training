public int removeElement(int[] nums, int val){
	Scanner sc=new Scanner (System.in);
	int count=0;
	for(int i=0; i<nums.length; i++){
		if(nums[i] != val){
			nums[count] = nums[i];
			count++;
		}
	}
	return count;
}