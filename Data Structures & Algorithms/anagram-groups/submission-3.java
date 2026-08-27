class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 1) {
            return new ArrayList<>(List.of(new ArrayList<>(List.of(strs))));
        }
        var arrList = new ArrayList<Integer>();
        var hm=new HashMap <String, List<String>>();
       

        for(String s: strs){
                char[] c= s.toCharArray();
                Arrays.sort(c);
           String sorted = new String (c);
           
            if(hm.containsKey(sorted)){
                    hm.get(sorted).add(s);
        }else{
             hm.put(sorted, new ArrayList<>(List.of(s)));
        }
         }
/*
        for(String s: strs){
            count=0;
            char[] c= s.toCharArray();
            for(char single : c){
                count = count+ single -'a';
               // System.out.print(count + " ");
            }
            if(hm.containsKey(count)){
                hm.get(count).add(s);
            }else{
                hm.put(count,new ArrayList<>(List.of(s)));
            }
            
        }



        for(String s: strs){
                char[] c = s.toCharArray();
             Arrays.sort(c);
                if(hm.put(c, hm.get(c).add(strs[count]))){
                    
                }

            count++;
     }

        for(int i=0;i<strs.length;i++){
         arrList.add(i);
        }
       
     */      

        return new ArrayList<>(hm.values());
    }
}
