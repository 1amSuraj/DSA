public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int currSum = 0;
        map.put(currSum, 1);

        for (int i = 0; i < n; i++) {
            currSum += (nums[i] % 2); // if odd - 1, even - 0

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
