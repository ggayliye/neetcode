class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //8/30/2026
        //took  min
        var hm=new HashMap<Integer,Integer>();

   for(int i=0; i<numbers.length;i++){
    hm.put(numbers[i], i );
   }
        int index=numbers.length-1;
        //index=numbers.length/2;
            System.out.println(hm);
        int find = target-numbers[index];
        while(index>=0){
            
             //   if(numbers[index]>target){}
                  //  index--;
               //  else{
                   // 
                    find = target-numbers[index];
        if(hm.containsKey(find)){
            if(hm.get(find)==index){
                index--;
                continue;
            }

             return new int[]{Math.min(hm.get(find)+1,index+1),Math.max(hm.get(find)+1,index+1)};
                
                }                  
                index--;
               // }

                /*
                if(index>=0 && numbers[index]<=target){
                    int find = target-numbers[index];
                    for(int i=0; i<index;i++){
                        if(numbers[i]==find){
                            return new int[]{i+1,index+1};
                        }
                    }
                    index--;
                }
*/
        }
        return new int[]{1,2};
    }
}

/*
    public int[] twoSum(int[] numbers, int target) {
        //8/30/2026
        //took  15min

        int index=0;
        index=numbers.length/2;

        while(index>=0 && index<numbers.length){
                if(numbers[index]>target){
                    index--;
                }
                if(index>=0 && numbers[index]<=target){
                    int find = target-numbers[index];
                    for(int i=0; i<index;i++){
                        if(numbers[i]==find){
                            return new int[]{i+1,index+1};
                        }
                    }
                    index--;
                }

        }
        return new int[]{1,index+1};
    }
    */