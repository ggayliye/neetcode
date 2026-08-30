class Solution {
    public boolean isValidSudoku(char[][] board) {
            //8/30/2026
            //took 55:00 min

        var hs = new HashSet<Character>();

        //Row check
        for(int i=0; i<board.length;i++){
            hs.clear();
            for(char c:board[i]){
                if(c=='.'){
                    continue;
                }
                if(!hs.add(c)){
                    return false;
                }
            }
        }

                //Column check
        for(int i=0; i<board[0].length;i++){
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

        //3x3 check
        int i_rep=0;

        while(i_rep<board.length){
        int k_rep=0;
            while(k_rep<board[0].length){
            hs.clear();
        for(int i=i_rep; i<3+i_rep;i++){
            
            for(int k=k_rep; k<3+k_rep;k++){
        
                // for(int k=k_rep; k<board[0].length;k++){
                    if(board[i][k]=='.'){
                    continue;
                }
                if(!hs.add(board[i][k])){
                    return false;
                }

            }
        }
            k_rep=k_rep+3;
    }
        i_rep=i_rep+3;
    }
            //3x3 check
          //  int k_rep=0;
         //   int i_rep=0;
          //  int c=0;
          //  int r=0;
          //  int all=0;
           
           
     /*      
            while(c<board.length){

                     
                     hs.clear();
                     int c=0;
                     int prev=0;
                    while(c<3){


            for(int i=r; i<r+3;i++){
               // int c=0;
            
               // for(int k=k_rep; k<board[0].length;k++){
                    if(board[c][i]=='.'){
                    continue;
                }
                if(!hs.add(board[c][i])){
                    return false;
                }
               // k_rep++;
               // c++;
           
            
            }
            r=prev;
            c++;

    }
    c=c+;




    }  
            int i=0;
            int k=0;

*/


     /*       
          while(i<board.length){  

            int i_rep=0;
            int k_rep=0;
            hs.clear();
        while(i_rep<3){
            
            while(k_rep<3){
                  if(board[i_rep][k_rep]=='.'){
                    continue;
                }
                  if(!hs.add(board[i_rep][k_rep])){
                    return false;
                }

                k_rep=k_rep++;
        }
        k_rep=0;
        i_rep=i_rep++;
        }
            i_rep=0;
            k_rep=k_rep++;
          }


      */    
        return true;
    }
}
