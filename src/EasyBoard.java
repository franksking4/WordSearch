import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class EasyBoard {
    private final int ROWS = 10;
    private final int COLS = 10;
    private final String letters;
    private char[][] board;
    private ArrayList<String> words;

    // Constructor to create a new easy word search board.
    public EasyBoard() {
        letters = "abcdefghijklmnopqrstuvwxyz";
        board = new char[ROWS][COLS];
        Random rand = new Random();
        words = new ArrayList<String>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = letters.charAt(rand.nextInt(25));
            }
        }
        words.add("airplane");
        words.add("water");
        words.add("banana");
        words.add("aadjot");
        words.add("kayden");

        board[9][4] = 'w';
        board[9][5] = 'a';
        board[9][6] = 't';
        board[9][7] = 'e';
        board[9][8] = 'r';

        board[7][0] = 'a';
        board[7][1] = 'i';
        board[7][2] = 'r';
        board[7][3] = 'p';
        board[7][4] = 'l';
        board[7][5] = 'a';
        board[7][6] = 'n';
        board[7][7] = 'e';

        board[1][0] = 'b';
        board[2][0] = 'a';
        board[3][0] = 'n';
        board[4][0] = 'a';
        board[5][0] = 'n';
        board[6][0] = 'a';

        board[3][8] = 'k';
        board[4][8] = 'a';
        board[5][8] = 'y';
        board[6][8] = 'd';
        board[7][8] = 'e';
        board[8][8] = 'n';

        board[4][2] = 'a';
        board[4][3] = 'a';
        board[4][4] = 'd';
        board[4][5] = 'j';
        board[4][6] = 'o';
        board[4][7] = 't';

    }

    // Method to print the board
    public void printBoard(){
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10");
        char rowLabel = 'A';
        for (int i = 0; i < 10; i++){
            System.out.print(rowLabel + " ");
            for (int j = 0; j < 10; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            rowLabel++;
        }
        System.out.println("\nWords: "+words.toString());
    }

    // Method to get the response of the player and to check to see if the coordinates they enter are correct.
    public void getResponse(){
        while (!words.isEmpty()){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter the coordinates of the first letter: ");
            String firstLetterCoords = scan.next();
            System.out.print("Please enter the coordinates of the second letter: ");
            String secondLetterCoords = scan.next();
            if (firstLetterCoords.equalsIgnoreCase("J5") && secondLetterCoords.equalsIgnoreCase("J9")){
                if (words.contains("water")){
                    words.remove("water");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("D9") && secondLetterCoords.equalsIgnoreCase("I9")){
                if (words.contains("kayden")){
                    words.remove("kayden");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("E3") && secondLetterCoords.equalsIgnoreCase("E8")){
                if (words.contains("aadjot")){
                    words.remove("aadjot");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("B1") && secondLetterCoords.equalsIgnoreCase("G1")){
                if (words.contains("banana")){
                    words.remove("banana");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("H1") && secondLetterCoords.equalsIgnoreCase("H8")){
                if (words.contains("airplane")){
                    words.remove("airplane");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else{
                System.out.println("Incorrect! Try again!");
                getResponse();
            }
        }
    }
}
