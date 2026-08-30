class Solution {
    public int longestConsecutive(int[] nums) {
            //8/30/2026
            //took  min
            if(nums.length==0){
                return 0;
            }
        Arrays.sort(nums);
        int c=0;
       // int prev=0;
        int result =0;

        for(int i=0; i+1<nums.length;i++){

            if(nums[i+1] - nums[i]==1    ){
                c++;
                // System.out.println("i: " + i + " c: "+c);

                if(i+1==nums.length-1   ){
                result = Math.max(result, c);
               // System.out.println("i: " + i + " c: "+c);
                //return result !=0 ? result+1 : result ; 
                }
            }else if(nums[i+1] - nums[i]==0){
                  if(i+1==nums.length-1   ){
                result = Math.max(result, c);
               // System.out.println("i: " + i + " c: "+c);
                //return result !=0 ? result+1 : result ; 
                }
                continue;
            }else{

                result = Math.max(result, c);
                c=0;
                //prev=c;
            }

            
          //  System.out.println(Arrays.toString(nums));
        }



        //(result !=0 )  ? result+1 : result ;  

      return result+1;
    }
}
