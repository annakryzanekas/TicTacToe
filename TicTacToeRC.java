import java.io.*; 
import java.util.*;
public class TicTacToe {

    public static void main(String[] args) {
        
        char[][] board = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};
    
        ArrayList <Integer> playerOnePlaces = new ArrayList<Integer>();
        ArrayList <Integer> playerTwoPlaces = new ArrayList<Integer>();
        String player = new String();
        
        printBoard(board);
        
        boolean gameOver = findWinner;

        int place = 0;
        int count = 0;
        while (gameOver == false) {
            findWinner(playerOnePlaces, playerTwoPlaces, gameOver);
            if (count%2 == 0) {
                System.out.println("Player One, please enter a number 1-9 for your placement: ");
                Scanner scan = new Scanner(System.in);
                place = scan.nextInt();
                playerOnePlaces.add(place);
                player = "Player One";
            }
            else {
                System.out.println("Player Two, please enter a number 1-9 for your placement: ");
                Scanner scan = new Scanner(System.in);
                place = scan.nextInt();
                playerTwoPlaces.add(place);
                player = "Player Two";
            }
            play(board, place, player);
            System.out.println(gameOver);
            //System.out.println(playerOnePlaces);
            //System.out.println(playerTwoPlaces);
            //printBoard(board);
            count++;
        }

    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i<5; i++) {
            for (int k = 0; k<5; k++) {
                System.out.print(board[i][k]);
            }
            System.out.println();
        }
    }

    public static void play(char[][] board, int place, String player) {
        
        char xOrO = 'X';
        if (player.equals("Player One")) {
            xOrO = 'X';
        }
        else {
            xOrO = 'O';
        }
        
        switch (place) {
            case 1:
                board[0][0] = xOrO;
                break;
            case 2:
                board[0][2] = xOrO;
                break;
            case 3:
                board[0][4] = xOrO;
                break;
            case 4:
                board[2][0] = xOrO;
                break;
            case 5:
                board[2][2] = xOrO;
                break;
            case 6:
                board[2][4] = xOrO;
                break;
            case 7:
                board[4][0] = xOrO;
                break;
            case 8:
                board[4][2] = xOrO;
                break;
            case 9:
                board[4][4] = xOrO;
                break;
            default:
                break;
        }
        printBoard(board);
    }

    public static bool findWinner(ArrayList<Integer> playerOnePlaces, ArrayList<Integer> playerTwoPlaces, boolean gameOver ) {
        if (playerOnePlaces.contains(1) && playerOnePlaces.contains(2) && playerOnePlaces.contains(3)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(4) && playerOnePlaces.contains(5) && playerOnePlaces.contains(6)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(7) && playerOnePlaces.contains(8) && playerOnePlaces.contains(9)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(1) && playerOnePlaces.contains(4) && playerOnePlaces.contains(7)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(2) && playerOnePlaces.contains(5) && playerOnePlaces.contains(8)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(3) && playerOnePlaces.contains(6) && playerOnePlaces.contains(9)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(1) && playerOnePlaces.contains(5) && playerOnePlaces.contains(9)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerOnePlaces.contains(3) && playerOnePlaces.contains(5) && playerOnePlaces.contains(7)) {
            System.out.println("X wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(1) && playerTwoPlaces.contains(2) && playerTwoPlaces.contains(3)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(4) && playerTwoPlaces.contains(5) && playerTwoPlaces.contains(6)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(7) && playerTwoPlaces.contains(8) && playerTwoPlaces.contains(9)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(1) && playerTwoPlaces.contains(4) && playerTwoPlaces.contains(7)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(2) && playerTwoPlaces.contains(5) && playerTwoPlaces.contains(8)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(3) && playerTwoPlaces.contains(6) && playerTwoPlaces.contains(9)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(1) && playerTwoPlaces.contains(5) && playerTwoPlaces.contains(9)) {
            System.out.println("O wins!");
            return true;
        }
        else if (playerTwoPlaces.contains(3) && playerTwoPlaces.contains(5) && playerTwoPlaces.contains(7)) {
            System.out.println("O wins!");
            return true;
        }
    }
}