import java.util.*;
class Tic_Tac_Toe_Game implements Board
{
    static char choice;
    static char player_choice;
    static char computer_choice;
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
        choice=sc.next().charAt(0);
        if(choice=='X' || choice=='x')
        {
            player_choice=choice;
            computer_choice='O';
            System.out.println("Your choose  "+player_choice);
            System.out.println("Computer choose "+computer_choice);
        }
        else if(choice=='O' || choice=='o')
        {
            player_choice=choice;
            computer_choice='X';
            System.out.println("You choose "+player_choice);
            System.out.println("Computer choose "+computer_choice);
        }
        else
            System.out.println("invalid char");
    }


    public void showBoard_UC3(){
        for(int i=1;i<board.length;i++)
        {
            System.out.println(board[i]+"|"+board[(++i)]+"|"+board[(++i)]);
            System.out.println("-+"+"-+-");
        }
    }

    public void playMove_UC4() {
        System.out.println("Where do you want to play?(1-9)");
        char position=sc.next().charAt(0);
        switch(position) {
            case '1':
                board[1] = player_choice;
                break;
            case '2':
                board[2] = player_choice;
                break;
            case '3':
                board[3] = player_choice;
                break;
            case '4':
                board[4] = player_choice;
                break;
            case '5':
                board[5] = player_choice;
                break;
            case '6':
                board[6] = player_choice;
                break;
            case '7':
                board[7] = player_choice;
                break;
            case '8':
                board[8] =player_choice;
                break;
            case '9':
                board[9] = player_choice;
                break;
            default:
                System.out.println(":(");
        }
        showBoard_UC3();
    }

    public static void main(String[] args)
    {
        Tic_Tac_Toe_Game t1=new Tic_Tac_Toe_Game();
        t1.creating_Board_UC1();
        t1.choose_X_O_UC2();
        t1.showBoard_UC3();
        t1.playMove_UC4();
    }
}

interface Board
{
    void creating_Board_UC1();
    void choose_X_O_UC2();
    void showBoard_UC3();
    void playMove_UC4();
}