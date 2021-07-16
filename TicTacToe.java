public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[10];

        System.out.println("Game Start!");

        //Display the initial board
        for(int i = 0; i < 9; i++) {

        }
        showboard(board);



    }
    //Display the board
    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);


    }
}