class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0 ; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int cur = 1;
                int curval = val;
                while(set.contains(curval + 1)) {
                    curval++;
                    cur++;
                }
                max = Math.max(cur, max);
            }
        }
        return max;
    }
}
