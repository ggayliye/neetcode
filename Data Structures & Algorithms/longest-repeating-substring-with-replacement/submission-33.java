class Solution {
    public int characterReplacement(String s, int k) {

        //9/3/2026
       //took  7:40min





       
        if(s.length()==0){return 0;}

   int[] count = new int[26];

    int left = 0;
    int maxFrequency = 0;
    int result = 0;

    for (int right = 0; right < s.length(); right++) {

        count[s.charAt(right) - 'A']++;

        maxFrequency = Math.max(
            maxFrequency,
            count[s.charAt(right) - 'A']
        );

        int windowLength = right - left + 1;
        int changes = windowLength - maxFrequency;

        while (changes > k) {

            count[s.charAt(left) - 'A']--;
            left++;

            windowLength = right - left + 1;
            changes = windowLength - maxFrequency;
        }

        result = Math.max(result, windowLength);
    }

    return result;


/*
      
       //9/3/2026
       //took  7:40min
    int result=1;

    for(int start=0; start<s.length();start++){

        char target=s.charAt(start);
        int changes=0;
        for(int end=start+1; end<s.length();end++){

            if(s.charAt(end)!=target){
                changes++;

            }

            if(changes>k){
                break;
            }

            result=Math.max(result, end-start+1);


        }



    }

*/
//return result;



/*
        //8/30/2026
    //took  1:00:48min

        int maxStartIndex=0;
        int start=0;
        int maxEndIndex=maxStartIndex+1;
        char cCheck = s.charAt(0);
        char cMax=s.charAt(0);
        int count=1;
        int length=1;
        int result=0;
        char[] cArr=s.toCharArray();

        for(int i=1; i<s.length();i++){
            if(s.charAt(i)==cCheck){
                count++;
                if(i==s.length()-1){
                if(length<count){
                length=count;
                maxEndIndex =i;
                cMax=cCheck;
                maxStartIndex=start;
            }
                }
            }else{
            
 
            

            if(length<=count){
                length=count;

                maxStartIndex=start;
                maxEndIndex =i-1;
            cMax=cCheck;
            
            }

            cCheck=s.charAt(i);
                count=1;
                start=i;
  
            }

            
        }
        System.out.println("maxStartIndex: " + maxStartIndex + " maxEndIndex: "+maxEndIndex+ " cMax :" +cMax);
           
          
          
            int inc=maxStartIndex;
        
            while(inc>0 && k>0){

           if( cArr[inc-1] != cMax){
            cArr[inc-1] = cMax;
            k--;
           }
            inc--;
            
        }
System.out.println("k: "+ k + " charA: "+ String.valueOf(cArr));
        if(k !=0){
            while(k>0 && maxEndIndex+1<cArr.length){
                if(cArr[maxEndIndex+1]!=cMax){
                cArr[maxEndIndex+1]=cMax;
                k--;
                }
                
                maxEndIndex++;
            }
        }
            char newC=cArr[0];
            int c=1;
        for(int i=1; i<cArr.length;i++){
            if(cArr[i]==newC){
                c++;
                if(i==cArr.length-1){
                     System.out.println(" charA fin: "+ String.valueOf(cArr));
                    return Math.max(result,c);
                }
            }else{
                newC= cArr[i];
                
                result = Math.max(result, c);
                c=1;

            }
        }
  */     

    }
}
