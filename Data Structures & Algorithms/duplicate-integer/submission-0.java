class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (exist.contains(nums[i])) {
                return true;
            }
            exist.add(nums[i]);
        }
        return false;
    }
}