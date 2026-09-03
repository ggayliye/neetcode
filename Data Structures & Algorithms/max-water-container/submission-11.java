class Solution {
    public int maxArea(int[] heights) {
       // var hs= new HashSet<Integer>();
       // Arrays.sort(heights);

       //8/30/2026
      //took  22.57min
     
    int right =heights.length-1;
    int left=0;

int area = (right-(left))* Math.min(heights[right],heights[left]);

    while(left<right){
      //  int shiftOfRightArea= (right-1-(left))* Math.min(heights[right-1],heights[left]);
      //  int shiftOfLeftArea= (right-(left+1))* Math.min(heights[right],heights[left+1]);
        if(heights[right]< heights[left]){
            right--;
            
        }else{
            left++;
        }
        area = Math.max(area, (right-left)*Math.min(heights[right],heights[left]));
    }
 return area;

    /*
        int left=0;
        int right=left+1;
        
        right=right+1;
*/

/*
      for(int i=1; i<heights.length;i++){
            if(heights[i]>maxNum){
                maxIndex = i;
                maxNum=heights[i];
            }
        }
         
         int targetIndex=maxIndex-1;
         int area =0;
        if(targetIndex>=0){ area = (maxIndex-(targetIndex))* Math.min(heights[maxIndex],heights[targetIndex ]);}
   targetIndex = targetIndex-1;
   int rollIndex=targetIndex;
    //left Side
    while(rollIndex>=0){
        int newA = (maxIndex-(rollIndex))* Math.min(heights[maxIndex],heights[rollIndex ]);
        if(newA>=area){
            area =newA;
            targetIndex=rollIndex;
        }
        rollIndex--;
    }
        //right side
        rollIndex=maxIndex+1;
        while(rollIndex<heights.length){
        int newA = (rollIndex-maxIndex)* Math.min(heights[maxIndex],heights[rollIndex ]);
        if(newA>=area){
            area =newA;
            targetIndex=rollIndex;
        }
        rollIndex++;
    }
*/
 
/*
        while(right<heights.length){

            int newA = (right-left)* Math.min(heights[left],heights[right]);
            int newA1 = (right-(right-1))* Math.min(heights[right-1],heights[right]);
            if(newA1>area){
                if(newA1>newA){
                 area=newA1;
                left++;
                }

            }else{

            }

        right++;
        }
*/

/*
     while(right>0){
    for(int i=0; i<heights.length;i++){
     int min = Math.min(heights[right], heights[i]);
     areaMax =Math.max(areaMax, (right-i) * min);


    }
    right--;
     }
*/
       /*

       int maxNum =heights[0];

        for(int i=1; i<heights.length;i++){
            if(heights[i]>maxNum){
                maxIndex = i;
                maxNum=heights[i];
            }
        }
       int secMaxIndex=0;
       int secMaxNum =0;
       int dif = Math.abs(secMaxIndex-maxIndex);

        for(int i=0; i<heights.length;i++){
          if(i !=maxIndex && heights[i]<=maxNum && heights[i]>=secMaxNum && Math.abs(i-maxIndex)>=dif ){
            secMaxIndex=i;
            secMaxNum=heights[i];

            }
        }

        int area = Math.abs(secMaxIndex-maxIndex) * secMaxNum;


*/
      

    }
}
