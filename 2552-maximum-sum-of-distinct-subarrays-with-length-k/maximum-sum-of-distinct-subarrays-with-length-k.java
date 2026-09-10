class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        long windowSum = 0;
        long maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.size() == k) {
            maxSum = windowSum;
        }

        for (int i = k; i < n; i++) {

            int remove = nums[i - k];

            windowSum -= remove;

            map.put(remove, map.get(remove) - 1);

            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            int add = nums[i];

            windowSum += add;

            map.put(add, map.getOrDefault(add, 0) + 1);

            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}