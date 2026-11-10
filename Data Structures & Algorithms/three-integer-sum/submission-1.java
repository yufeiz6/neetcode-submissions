class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); //排序
        for (int i = 0; i < nums.length - 2; i ++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;   // 去重i
            int val = 0 - nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[j] + nums[k];
                if (total < val) {
                    j ++;
                } else if (total > val) {
                    k --;
                } else {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[k]);
                    res.add(cur);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k+ 1]) k--;
                }
            }
        }
        return res;
    }
}
