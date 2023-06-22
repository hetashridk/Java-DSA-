public class N_Queens {
    // Function to print board
    public static void printBoard(char board[][]){
        System.out.println("------------------chessboard-----------------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // isSafe condition
    public static boolean isSafe(char board[][], int row, int col){

        // vertical up
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left diagonal up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal up
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){       //row can be also written as i

        // base case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        // kaam :- column loop

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){

                // place Q
                board[row][j] = 'Q';
                nQueens(board, row + 1);

                // backtracking
                // ek vaar queens assign thy gayi ek row ek place par pan pachi biji place par assign karva mate X lagai didu..     jenathi Q ae row ma nai hoi
                // unplace Q
                board[row][j] = 'X';
            }
        }
    }


    // to count number of ways
    static int count = 0;
    public static void main(String args[]){
        int n = 2;
        char board[][] = new char[n][n];

        // intialize board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                // Firstly no Queens
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Total number of ways is: " + count);
    }    
}