class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();     
         //Brute Force
        // Time Complexity: O(n²)
        // Space Complexity: O(1)
        // for(int i = 0 ; i < nums.length; i++){
        //   for(int j = i +1; j < nums.length; j++){
        //     if(nums[i] == nums[j]){
        //       return true;
        //     }
        //   }
        // }
        // return false;
          
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