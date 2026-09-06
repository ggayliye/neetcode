class Solution {
    public boolean checkInclusion(String s1, String s2) {
            //9/3/2026
            //took  56min
        int[] count =new int[26];
       // char[] cS1 = s1.toCharArray();
       // var arr =  new ArrayList <Character>();
        for(int i=0;i<s1.length();i++){
           count[s1.charAt(i)-'a']++;
        }

       // System.out.println("count: "+ Arrays.toString(count) );
        int j=0;
        

        while(j<s2.length()){
            int trackInt=0;
        for(int i=0;i<s1.length();i++){
            if(j>=s2.length() ){
                return false;
            }

            if(count[s2.charAt(j) -'a']==0){
               // System.out.println("count1: "+ Arrays.toString(count) + " j:" +j);
                
      
        for(int t=j-trackInt;t<j;t++){
           count[s2.charAt(t)-'a']++;
        }
       
        //j++;
                break;
            }
          
            count[s2.charAt(j)-'a']--;
            trackInt++;
            
           // System.out.println("count2: "+ Arrays.toString(count) + " j:" +j);
            if(i==s1.length()-1){
                return true;
            }
            j++;
        }
  j = j - trackInt + 1;
        
        }
        return  false;
        
   /*     

            //Arrays.sort(arr);
         var arr1 =  new ArrayList <Character>(arr);   
        int j=0;
    while(j<s2.length()){
        if(arr1.size() !=arr.size()){
            arr1.clear();
           arr1 =  new ArrayList <Character>(arr);
        }
       // System.out.println("arr1: "+arr1 );
        //var hs2 = new HashSet<Character>(hs);
        //!arr1.isEmpty() && 
        int i=0;
        while(i<s1.length() && j<s2.length() ){
        if(arr1.contains(s2.charAt(j))){
            arr1.remove((Character) s2.charAt(j));
           // j--;
            //break;
        }else{
            j++;
            break;
        }
        if(arr1.isEmpty()){
            return true;
        }
        i++;
        j++;
        }

        }

*/
    
    /**
    
        char[] cS1 = s1.toCharArray();
       // char[] cS2 = s2.toCharArray();

        var hs =  new HashSet <Character>();
        var hs1 =  new HashSet <Character>();

        for(char c :cS1){
            hs.add(c);
        }

        
        
        
        int j=0;

while(j<s2.length()){
    int i=0;
        while(i<s1.length() && j< s2.length()){
 System.out.println("above i: "+i+ " above j: "+ j+ "above hs1: "+ hs1+ " above hs: "+hs);
            if(hs.add(s2.charAt(j))){
                hs.remove(s2.charAt(j));
                j++;
                break;
            }else if(j< s2.length() && hs1.contains(s2.charAt(j))){
                j++;
                break;
            }
            hs1.add(s2.charAt(j));
            if(i==s1.length()-1 || (j==s2.length()-1 && hs1.size()==hs.size())){
               System.out.println("Last iter hs1: "+ hs1+ "hs: "+hs);
                return true;
            }
             
            i++;
            j++;
           
        }

        //hs.clear();
    }
/*
        for(int i=0; i<s2.length();i++){


        }
*/

       //  System.out.println(" hs1: "+ hs1+ "hs: "+hs);
         
        
    }
}
