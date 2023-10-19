import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Get the player's names
        System.out.println("Player 1, what's your name? ");
        String p1 = in.nextLine();
        System.out.println("Player 2, what's your name? ");
        String p2 = in.nextLine();
        //3x3 Tic Tac Toe board
        //- empty space
        //x player 1
        //o player 2
        char[][] board = new char[3][3];
        //Fill the boards with dashes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        //Draw the board
        drawBoard(board);
    }

    //Printing out the board
    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}