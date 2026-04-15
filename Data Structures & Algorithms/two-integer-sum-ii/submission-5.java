class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length - 1;
        while(lp < rp) {
            int sum = numbers[lp] + numbers[rp];
            if(target > sum) {
                lp++;
            }
            else if(target < sum) {
                rp--;
            }
            else {
                int[] ans = new int[2];
                ans[0] = lp + 1;
                ans[1] = rp + 1;
                return ans;
            }
        }
        return new int[2];
    }
}
