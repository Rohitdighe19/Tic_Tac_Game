import java.util.*;
class Tic_Tac_Toe_Game
{
    static char symbol;
    static char player_symbol;
    static char computer_symbol;
    static char [] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    static Scanner sc=new Scanner(System.in);


    public void creating_Board_UC1(){
        System.out.println("Board with number position ");
        for(int i=1;i<board.length;i++)
        {
            System.out.println(i+"|"+(++i)+"|"+(++i));
            System.out.println("-+"+"-+-");
        }
    }

    public void choose_X_O_UC2(){
        System.out.println("Want you want X or O");
        symbol=sc.next().charAt(0);
        if(symbol=='X' || symbol=='x')
        {
            player_symbol=symbol;
            computer_symbol='O';
            System.out.println("Your choose  "+player_symbol);
            System.out.println("Computer choose "+computer_symbol);
        }
        else if(symbol=='O' || symbol=='o')
        {
            player_symbol=symbol;
            computer_symbol='X';
            System.out.println("You choose "+player_symbol);
            System.out.println("Computer choose "+computer_symbol);
        }
        else
            System.out.println("invalid char");
    }


    public void showBoard(){
        for(int i=1;i<board.length;i++)
        {
            System.out.println(board[i]+"|"+board[(++i)]+"|"+board[(++i)]);
            System.out.println("-+"+"-+-");
        }
    }

    public void placeMove(int position,char symbol) {
        switch(position) {
            case 1:
                board[1] = symbol;
                break;
            case 2:
                board[2] = symbol;
                break;
            case 3:
                board[3] = symbol;
                break;
            case 4:
                board[4] = symbol;
                break;
            case 5:
                board[5] = symbol;
                break;
            case 6:
                board[6] = symbol;
                break;
            case 7:
                board[7] = symbol;
                break;
            case 8:
                board[8] =symbol;
                break;
            case 9:
                board[9] =symbol;
                break;
            default:
                System.out.println(":(");
        }
        showBoard();
    }


    public  boolean isValidMove(int position){
        switch(position) {
            case 1:
                return(board[1] == ' ');
            case 2:
                return(board[2] == ' ');
            case 3:
                return(board[3] == ' ');
            case 4:
                return(board[4] == ' ');
            case 5:
                return(board[5] == ' ');
            case 6:
                return(board[6] == ' ');
            case 7:
                return(board[7] == ' ');
            case 8:
                return(board[8] ==' ');
            case 9:
                return(board[9] ==' ');
            default:
                return false;
        }
    }

    public void playerTurn(){
        int playerInput;
        while (true) {
            System.out.println("Where would you like to play? (1-9)");
            playerInput=sc.nextInt();
            if (isValidMove(playerInput)){
                break;
            } else {
                System.out.println(playerInput + " is not a valid move.");
            }
        }
        placeMove(playerInput, player_symbol);
    }




    public static void main(String[] args)
    {
        Tic_Tac_Toe_Game t1=new Tic_Tac_Toe_Game();
        t1.creating_Board_UC1();
        t1.choose_X_O_UC2();
        t1.playerTurn();

    }
}