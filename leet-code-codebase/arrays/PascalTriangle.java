// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// Problem link :- https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows == 1) return ans;

        for(int i=2; i<=numRows; i++) {
            List<Integer> temp = ans.get(i-2);
            List<Integer> al = new ArrayList<>();
            for(int j=0; j<i; j++) {
                if(j==0 || j==i-1) {
                    al.add(1);
                } else {
                    al.add(temp.get(j-1) + temp.get(j));
                }
            }
            ans.add(al);
        }
        return ans;
    }
}