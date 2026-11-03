class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

//(a, b) -> a - b    // 从小到大（升序）
//(a, b) -> b - a    // 从大到小（降序）

//(a, b) -> Integer.compare(a, b)    // 升序，不会溢出
//(a, b) -> Integer.compare(b, a)    // 降序
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for (int key : map.keySet()) {
            heap.offer(key); // offer not add
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i ++) {
            res[i] = heap.poll();
        }
        return res;
    }
}
