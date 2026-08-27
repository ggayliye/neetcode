class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }
       // Arrays.sort(nums);
        int[] result =new int[2];
        int start=nums.length/2;
        int find=0;
        int control=1;
        while(control<nums.length){
            find = target - nums[nums.length-control];
            
                for(int i=0; i<nums.length-control;i++){
                    if(i==nums.length-control){
                        continue;
                    }
                if(nums[i]==find){
                    result[0]=i;
                    result[1]=nums.length-control;
                    return result;
            }
                }
           


/*
            for(int i=0; i<nums.length;i++){
                if(i==nums.length-control){
                    continue;
                }
                if(nums[i]==find){
                    result[0]=Math.min(i,nums.length-control);
                    result[1]=Math.max(i,nums.length-control);
                    return result;
            }
            }
*/
        control++;
        }

    return result;
    }
}
