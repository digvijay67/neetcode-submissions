class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();     
           // Optimized using HashSet
           // Time Complexity: O(n)
           // Space Complexity: O(n)
        for(int i = 0; i < nums.length; i++){

          if(set.contains(nums[i])){
            return true;
          }
          set.add(nums[i]);
        }
        return false;
    }
}