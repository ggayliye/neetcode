class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //8/30/2026
        //took  9:13min
        Arrays.sort(nums);
        var arr= new HashSet <List<Integer>>();

        int start=0;
       // int next1=start+1;
       // int next2=start +2;
        while(start<nums.length-2){
            for(int i=start+1; i<nums.length-1;i++){
                int j = nums.length-1;

                while(j>i){
                    if(nums[start]+nums[i]+nums[j]==0){
                           arr.add(Arrays.asList(nums[start], nums[i],nums[j]));
                           i++;
                           j--;
                    } else if(nums[start]+nums[i]+nums[j]<0){
                        i++;
                    }else{
                        j--;
                    }
                }
            }

            start++;
        }



        return new ArrayList<>(arr);
    }
}
/*
        int start=0;
         int ix1=start+1;
        int ix2=start+2;
        int prev1=ix1;
        int prev2=ix2;
        while(start+2<nums.length){
            while(ix2<nums.length && ix1<nums.length-1){
            for(int i=ix1;i<nums.length;i++){
                if(nums[start]+nums[i]+nums[ix2]==0){
                    int[] temp = {nums[start],nums[i],nums[ix2]};
                    Arrays.sort(temp);
                    arr.add(Arrays.asList(temp[0],temp[1],temp[2]));
                }
            }

            for(int i=ix2;i<nums.length;i++){
                if(nums[start]+nums[ix1]+nums[i]==0){
                   int[] temp = {nums[start],nums[i],nums[ix1]};
                    Arrays.sort(temp);
                    arr.add(Arrays.asList(temp[0],temp[1],temp[2]));
                }
            }
            ix1++;
            ix2++;
        }
            start++;
            ix1=start+1;
            ix2=start+2;

        }

        */
       // var arr1= new ArrayList <List<Integer>>();