class Solution {
    public boolean hasDuplicate(int[] nums) {
        var hash = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            
            if(!hash.add(nums[i])){
                return true;
            }
        }
   /*
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
               
                if(nums[i]==nums[j]){
                    return true;
                }

        }  
        }
        return false;
        */
        return false;
    }
}