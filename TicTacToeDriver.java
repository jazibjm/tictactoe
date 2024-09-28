import java.util.*;
public class TicTacToeDriver
{
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Tic-Tac-Toe!");
        while(playAgain)
        {
            TicTacToe play = new TicTacToe();
            play.startGame();
            System.out.println("Would you like to play again? Type 1 for yes and 2 for no.");
            int choice = sc.nextInt();
            if(choice == 2)
            {
                playAgain = false;
            }
        }
        
        
    }
}

