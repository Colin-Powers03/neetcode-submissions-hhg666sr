class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lp = i + 1;
            int rp = nums.length - 1;
            while(lp < rp) {
                int sum = nums[i] + nums[lp] + nums[rp];
                if(sum < 0) {
                    lp++;
                }
                else if(sum > 0) {
                    rp--;
                }
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[lp]);
                    triplet.add(nums[rp]);
                    sums.add(triplet);
                    lp++;
                    while(nums[lp] == nums[lp - 1] && (lp < rp)) {
                        lp++;
                    }
                }
            }
        }
        return sums;
    }
}
