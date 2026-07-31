class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> finder = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            finder.put(complement, i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (finder.containsKey(nums[i])) {
                int complementIndex = finder.get(nums[i]);
                if (i!=complementIndex) {
                    int[] answer= {i, complementIndex};
                    return answer;
                }
            }
        }
        int[] answer= {-1, -1};
        return answer;
    }
}
