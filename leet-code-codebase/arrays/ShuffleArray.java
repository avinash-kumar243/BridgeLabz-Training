// 1470. Shuffle the Array

// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].


class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int i=0, j=0; 
        while(i < n) {
            ans[j++] = nums[i];
            ans[j++] = nums[n+i];
            i++;
        }
        return ans;
    }
}