class Solution {
    public int trap(int[] height) {
        //8/30/2026
        //took  23.55min
        int leftMax=0;
        int rightMax=0;
        int water=0;
        int left=0;
        int right = height.length-1;

        while(left<right){

  if(height[left]<=height[right]){

if(height[left]>=leftMax){
    leftMax=height[left];

}else{
    water=water + leftMax- height[left];
}
left++;
  } else{

if(height[right]>=rightMax){
    rightMax=height[right];

}else{
        water=water + rightMax- height[right];
}

right--;

  }
   

  }


        
return water;
        /*
        while(right<height.length){
            if(height[left]==0 && height[right]>height[left]){
                left++;
                right++;

            } else if(height[left]!=0 && height[right]>height[left]){
                water=water+ height[right]-height[left];
                left++;
                right++;
            }else{
                water=water + height[left]-height[right];
                left++;
                right++;
            }
        }
        */
    
    }

}
