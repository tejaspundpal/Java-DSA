package Java_DSA.Backtracking;
import java.util.*;

public class NQueen
{
    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0;i < board.length;i++){
            row = "";
            for(int j = 0;j < board.length;j++){
                if(board[i][j] == 'Q')
                    row = row + 'Q';
                else
                    row = row + '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static boolean isSafe(int row,int col,char[][] board){
        //checking horizontally
        for(int j = 0;j < board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //checking verically
        for(int i = 0;i < board.length;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //checking upper left
        int r = row;
        for(int c = col;c >= 0 && r >= 0 ;c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking upper right
        r = row;
        for(int c = col;c < board.length && r >= 0 ;c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking lower left
        r = row;
        for(int c = col;c >= 0 && r < board.length ;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking lower right
        r = row;
        for(int c = col;c < board.length && r < board.length ;c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row = 0;row < board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>>calcNQueen(int n){
        List<List<String>>allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);

        return allBoards;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> result = new ArrayList<>();
        System.out.println("Enter the degree of the chess : ");
        int n = sc.nextInt();
        result = calcNQueen(n);
        System.out.println(result);
    }
}
