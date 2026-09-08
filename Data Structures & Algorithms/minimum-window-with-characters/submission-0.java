class Solution {
    public String minWindow(String s, String t) {
//9/6/2026
//took  2:35:58min
           
   int[] count = new int[52];

for (char c : t.toCharArray()) {
    if (Character.isUpperCase(c)) {
        count[c - 'A']++;
    } else {
        count[c - 'a' + 26]++;
    }
}

int left = 0;
int need = t.length();

int minLeft = 0;
int minRight = 0;
int minLen = Integer.MAX_VALUE;

for (int right = 0; right < s.length(); right++) {

    int index = Character.isUpperCase(s.charAt(right))
        ? s.charAt(right) - 'A'
        : s.charAt(right) - 'a' + 26;

    if (count[index] > 0) {
        need--;
    }

    count[index]--;

    while (need == 0) {

        if (right - left + 1 < minLen) {
            minLen = right - left + 1;
            minLeft = left;
            minRight = right;
        }

        int leftIndex = Character.isUpperCase(s.charAt(left))
            ? s.charAt(left) - 'A'
            : s.charAt(left) - 'a' + 26;

        count[leftIndex]++;

        if (count[leftIndex] > 0) {
            need++;
        }

        left++;
    }
}

if (minLen == Integer.MAX_VALUE) {
    return "";
}

return s.substring(minLeft, minRight + 1);
   
   /*
   
   
   
            if(s.length()==t.length()){
                char[] cc1 = s.toCharArray();
                char[] cc2 = t.toCharArray();
                    Arrays.sort(cc1);
                    Arrays.sort(cc2);
                    String s1=new String(cc1 );
                    String s2=new String(cc2);
                if(!s1.equals(s2)){
                    return "";
                }
                return s;
            }
            if(s.length()<t.length()){
                return "";
            }
            int left=0;

            int minLeft=0;
            int minRight=0;
            String result="";
            
            int minVal=Integer.MAX_VALUE;
            var arr= new ArrayList<Integer>();
            //int minVal = 0;
            int[] cArr= new int[52] ;
            for(char c:t.toCharArray()){
           if(Character.isUpperCase(c)){
                cArr[c-'A']++;
           } else{
            cArr[c-'a'+26]++;
           }
           
         }

char temp = s.charAt(0);
int n=0;

if(Character.isLowerCase(temp) ? cArr[temp-'a'+26] > 0 :cArr[temp-'A']>0 ){

for (int i=1; i<s.length(); i++){
    if(s.charAt(i)==temp){
        n++;
    }else{
        break;
    }

}

}
if(Character.isLowerCase(temp) ? cArr[temp-'a'+26] < n :cArr[temp-'A']<n ){
    if(Character.isLowerCase(temp) ){
       left = n-cArr[temp-'a'+26];
    }else{
        left = n-cArr[temp-'A'];
    }
}


        while(left<=s.length()-t.length()){
            
       
            int c=t.length();

        for(int right=left; right<s.length();right++){
 
            if((Character.isUpperCase(s.charAt(right)) &&  cArr[s.charAt(right)-'A'] ==0 ) || (Character.isLowerCase(s.charAt(right)) &&  cArr[s.charAt(right)-'a'+26] ==0 )){



             if(c==t.length()){
                 
     

               if(right==s.length()-1 && left>=s.length()-t.length()){
                 
                    for(int i=minLeft; i<minRight+1;i++){
                    result=result + s.charAt(i);
                                                 }
                                                 
                 return minVal==Integer.MAX_VALUE ? "" : result;


               }

                break;
             }
               if(c==0){

                if(minVal>right-left+1){
                    minLeft= left;
                    minRight= right;
                }

                minVal=Math.min(minVal, right-left+1);

                //System.out.println("minLeft Top: " +minLeft + " minRight: "+ minRight);
           
            left++;
            
                break;
               
               }


                continue;
                
               
                
            }

           if(Character.isLowerCase(s.charAt(right) ) ){
        arr.add( s.charAt(right)-'a' +26);
                cArr[s.charAt(right)-'a'+26]-- ;

           } else{
            arr.add( s.charAt(right)-'A' );
        cArr[s.charAt(right)-'A']-- ;
           }

           
             c--;
          if(c==0) {
            // System.out.println("left0: " + left);
            if(minVal>right-left+1){
                 
                    minLeft= left;
                    minRight= right;
                }
    System.out.println("left2: " + left + " right2: " + right);
    
             minVal=Math.min(minVal, right-left+1);
              System.out.println("minLeft1: " +minLeft + " minRight: "+ minRight);
            
         for(int c1:arr){
            cArr[c1]++;

        }
        
         arr.clear();
           if(s.charAt(right) !=s.charAt(left) ){
            left++;
           }  
             
             break;
          }
          
        }
       

       left++;
        }

    for(int i=minLeft; i<minRight+1;i++){
        result=result + s.charAt(i);

    }
return minVal==Integer.MAX_VALUE ? "" : result;

*/
         
    }
   
}
