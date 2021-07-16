import java.util.*;
class Tic_Tac_Toe_Game implements Board
{
    char choice;
    char player_choice;
    char computer_choice;
    Scanner sc=new Scanner(System.in);


    public void Creating_Board_UC1(){
        char [] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        System.out.println("Board with number position ");
        for(int i=1;i<board.length;i++)
        {
            System.out.println(i+"|"+(++i)+"|"+(++i));
            System.out.println("-+"+"-+-");
        }
    }
    
    public char Choose_X_O_UC2(){
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
            player_choice='X';
            System.out.println("Your choose "+player_choice);
            System.out.println("Computer choose "+computer_choice);
        }
        else
            System.out.println("invalid char");
        return player_choice;
    }

    public static void main(String[] args)
    {
        Tic_Tac_Toe_Game t1=new Tic_Tac_Toe_Game();
        t1.Creating_Board_UC1();
        t1.Choose_X_O_UC2();
    }
}

interface Board
{
    void Creating_Board_UC1();
    char Choose_X_O_UC2();
}