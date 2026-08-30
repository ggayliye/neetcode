class Solution {
    public boolean isPalindrome(String s) {
        //8/30/2026
        //took 12:50 min
        String newS =s;
       newS= newS.replaceAll("[^a-zA-Z0-9]", "");
       newS= newS.toLowerCase();
        char[] c = newS.toCharArray();
        int left=0;
        int right=c.length-1;
       // System.out.println(newS);
        while(left<right){
            if(c[left] !=c[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;















    }
}
