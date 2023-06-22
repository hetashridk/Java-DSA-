// check if way exist and if it is exist print only 1 solution
public class N_Queens_Solution_possible {
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

    public static boolean nQueens(char board[][], int row){       //row can be also written as i

        // base case
        if(row == board.length){
            printBoard(board);
            count++;
            return true;
        }
        // kaam :- column loop

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){

                // place Q
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }
                
                // umplaced Q
                board[row][j] = 'X';
            }
        }
        return false;
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
        if(nQueens(board, 0)){
            System.out.println("Solutiom is possilbe");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possilbe");
        }
        // System.out.println("Total number of ways is: " + count);
    }    
}