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
        //Keep track of whose turn it is
        boolean isPlayer1 = true;
        //Keep track of what symbol we are using to play
        char symbol = ' ';
        if (isPlayer1) {
            symbol = 'x';
        } else {
            symbol = 'o';
        }
        //Row & col variables
        int row = 0;
        int col = 0;
        while (true) {
            //Get row & column from user
            System.out.print("Enter a row (0, 1 or 2): ");
            row = in.nextInt();
            System.out.print("Enter a column (0, 1 or 2): ");
            col = in.nextInt();
            //
            if (row < 0 || col < 0 || row > 2 || col > 2) {
                //Row & column out of bounds
                System.out.println("Your row & col ate out of bounds!");
            } else if (board[row][col] != '-') {
                //Board position has an x or o
                System.out.println("Someone has already made a move there!");
            } else {
                //Row & col are valid!
                break;
            }
        }

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