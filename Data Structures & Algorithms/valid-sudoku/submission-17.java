class Solution {
    public boolean isValidSudoku(char[][] board) {
        var hs = new HashSet<Character>();
         //8/26/2026
        //took  1:20:59 min
       
       for(int i=0; i<board.length;i++){
       // System.out.println(i);
                hs.clear();
        for(char n: board[i]){
            
            if(n=='.'){
                
                continue;
            }else{
               // System.out.println(hs);
            if(!hs.add(n)){
                return false;
            }
            }

        }
       }
         //   System.out.println("board.length: " + board.length+ " board[0].length: " + board[0].length);
       for(int i=0; i<board[0].length;i++){
      // System.out.println(i);
                 hs.clear();
         for(int k=0; k<board.length;k++){
            if(board[k][i]=='.'){
                continue;
            }
            if(!hs.add(board[k][i])){
                return false;
            }


        }
       }

        int i_rep=0;
        int k_rep=0;
       while(i_rep+3<board.length){
        k_rep=0;
               while(k_rep+3<board[0].length ){  
                hs.clear();
               for(int i=i_rep; i<3+i_rep;i++){
                
      // System.out.println(i);
                
         for(int k=k_rep; k<3+k_rep;k++){
            if(board[i][k]=='.'){
                continue;
            }
            if(!hs.add(board[i][k])){
                return false;
            }
          //  System.out.println(hs);

        }
         
               }
               k_rep=k_rep+3;
       }  
       
     
    i_rep=i_rep+3;
       }

        return true;
    }
}
