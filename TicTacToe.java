import java.util.*;
public class TicTacToe
{
    int moveCount = 0;
    Scanner sc = new Scanner(System.in);
    boolean gameOver = false;
    int[][] board = {{0,0,0}, {0,0,0}, {0,0,0}};   //set up initial board. 0 represents empty, 1 represents player 1, 2 represents player 2
    public void startGame()
    {
        System.out.println("Player 1 will be O's while Player 2 will be X's");
        while(!gameOver)
        {
            if(!gameOver)
            {
                player1Move();
                printBoard();
            }
            if(!gameOver)
            {
                player2Move();
                printBoard();
            }
        }
    }
    public void player1Move()
    {
        int column;
        int row;
        boolean valid = false;
        do
        {
            do
            {
                System.out.println("What row would you like to do your move, Player 1? (Enter 1 to 3)");
                row = sc.nextInt();
            }
            while(row > 3 || row < 1);
            do
            {
                System.out.println("What column would you like to do your move, Player 1? (Enter 1 to 3)");
                column = sc.nextInt();
            }
            while(column > 3 || column < 1);          
            if(board[row-1][column-1] != 0)
            {
                System.out.println("Already used row or column. Try again.");
            }
            else
            {
                valid = true;
            }
        }
        while(!valid);
        board[row-1][column-1] = 1;
        moveCount++;
        checkGameCondition();
    }
    public void player2Move()
    {
        int column;
        int row;
        boolean valid = false;
        do
        {
            do
            {
                System.out.println("What row would you like to do your move, Player 2? (Enter 1 to 3)");
                row = sc.nextInt();
            }
            while(row > 3 || row < 1);
            do
            {
                System.out.println("What column would you like to do your move, Player 2? (Enter 1 to 3)");
                column = sc.nextInt();
            }
            while(column > 3 || column < 1);          
            if(board[row-1][column-1] != 0)
            {
                System.out.println("Already used row or column. Try again.");
            } 
            else
            {
                valid = true;
            }
        }
        while(!valid);
        board[row-1][column-1] = 2;
        moveCount++;
        checkGameCondition();
    }
    public void printBoard()
    {
        System.out.println();
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == 1)
                {
                    System.out.print("O ");
                }
                else if(board[i][j] == 2)
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
    }
    public void checkGameCondition()
    {
        if((board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) || (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) || (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) || (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) || (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) || (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) || (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1))
        {
            System.out.println("\nPlayer 1 won!");
            gameOver = true;
        }
        if((board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) || (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) || (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) || (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) || (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) || (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) || (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) || (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2))
        {
            System.out.println("\nPlayer 2 won!");
            gameOver = true;
        }
        if(moveCount==9)
        {
            System.out.println("\nDraw!");
            gameOver = true;
        }
    }
}