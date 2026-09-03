class Solution {
    public int lengthOfLongestSubstring(String s) {
        //9/02/2026
        //took 52.57 min
  /*   
        if(s.length()==0){
            return 0;
        }
                if(s.length()==1){
            return 1;
        }
        */
int left = 0;
int length = 0;

var hs = new HashSet<Character>();

for (int right = 0; right < s.length(); right++) {

    while (hs.contains(s.charAt(right))) {
        hs.remove(s.charAt(left));
        left++;
    }

    hs.add(s.charAt(right));

    length = Math.max(length, right - left + 1);
}

return length;

/* CORRECT ALSO
        char[] c = s.toCharArray();
        var hs = new HashSet<Character>();

            int initialIndex=0;
            char start =c[initialIndex];
            int count=1;
            int length=0;
            int startIndex=1;
            hs.add(c[0]);
    for(int i=startIndex; i<c.length;i++){
        if(c[i]!=start){
           if(hs.add(c[i])) {count++;
                   if(i == c.length-1){
                return Math.max(length,count);
            }   
           
           
           }else{
            length= Math.max(length,count);
            initialIndex++;
            start=c[initialIndex];
           // startIndex++;
            i=initialIndex;

            count=1;
            hs.clear();
           }

        }else{
            
            length= Math.max(length,count);
            initialIndex++;
            start=c[initialIndex];
            count=1;
            i=initialIndex;
           // System.out.println("i:"+i+" initialIndex:"+initialIndex+" start:"+start);
            hs.clear();
        }


    }


return length;
*/
    }
}
