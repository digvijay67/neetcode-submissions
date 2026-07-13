class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();     
         // its O(n squr 2 ) base Time complexity 
        // for(int i = 0 ; i < nums.length; i++){
        //   for(int j = i +1; j < nums.length; j++){
        //     if(nums[i] == nums[j]){
        //       return true;
        //     }
        //   }
        // }
        // return false;
          
           // its a O(n) base Solution
        for(int i = 0; i < nums.length; i++){

          if(set.contains(nums[i])){
            return true;
          }
          set.add(nums[i]);
        }
        return false;
    }
}