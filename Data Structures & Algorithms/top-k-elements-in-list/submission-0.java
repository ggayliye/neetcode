class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var pq = new PriorityQueue<Map.Entry<Integer,Integer>>((a,b)->Integer.compare(b.getValue(),a.getValue()));
        var hm = new HashMap<Integer, Integer>();
        int left=0;
      //  hm.put(nums[0],1);
      //  while(left<nums.length){
          //  pq.add(new AbstractMap.SimpleEntry<>(nums[0],1));
          
       for(int n:nums){
        //    for(int i=left+1; i<nums.length;i++){
          //  if(n==nums[i]){
           //   if(hm.containsKey(n)){
                    hm.put(n,hm.getOrDefault(n,0)+1);
          //      }else{
               //     hm.put(n,1);
         //       }
         //   }
         //   }
       // left++;
        }
        

    pq.addAll(hm.entrySet());
    
    int [] result = new int[k];
    
    for(int i=0;i<k;i++){
       
           result[i] = pq.poll().getKey();
           
       
        
    }

        return result ;
    }
}
