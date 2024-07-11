import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HardBoard{
    private final int ROWS = 30;
    private final int COLS = 30;
    private final String letters = "abcdefghijklmnopqrstuvwxyz";
    private char[][] board;
    private ArrayList<String> words;

    // Constructor to create a new hard word search board.
    public HardBoard(){
        board = new char[ROWS][COLS];
        Random rand = new Random();
        words = new ArrayList<>();

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

        // Q6 | Q11
        board[16][7] = 'a';
        board[16][8] = 'a';
        board[16][9] = 'd';
        board[16][10] = 'j';
        board[16][11] = 'o';
        board[16][12] = 't';

        // D11 | I11
        board[3][12] = 'k';
        board[4][12] = 'a';
        board[5][12] = 'y';
        board[6][12] = 'd';
        board[7][12] = 'e';
        board[8][12] = 'n';

        // T5 | [12
        board[19][6] = 'a';
        board[20][7] = 'i';
        board[21][8] = 'r';
        board[22][9] = 'p';
        board[23][10] = 'l';
        board[24][11] = 'a';
        board[25][12] = 'n';
        board[26][13] = 'e';

        // S21 | W21
        board[18][22] = 'w';
        board[19][22] = 'a';
        board[20][22] = 't';
        board[21][22] = 'e';
        board[22][22] = 'r';

        // Y2 | Y7
        board[24][1] = 'b';
        board[24][2] = 'a';
        board[24][3] = 'n';
        board[24][4] = 'a';
        board[24][5] = 'n';
        board[24][6] = 'a';
    }

    // Method to print the board
    public void printBoard(){
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
        char rowLabel = 'A';
        for (int i = 0; i < 30; i++){
            System.out.print(rowLabel + " ");
            for (int j = 0; j < 30; j++){
                if (j < 9){
                    System.out.print(board[i][j] + " ");
                }else{
                    System.out.print(" "+board[i][j] + " ");
                }
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
            if (firstLetterCoords.equalsIgnoreCase("S21") && secondLetterCoords.equalsIgnoreCase("W21")){
                if (words.contains("water")){
                    words.remove("water");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("D11") && secondLetterCoords.equalsIgnoreCase("I11")){
                if (words.contains("kayden")){
                    words.remove("kayden");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("Q6") && secondLetterCoords.equalsIgnoreCase("Q11")){
                if (words.contains("aadjot")){
                    words.remove("aadjot");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("Y2") && secondLetterCoords.equalsIgnoreCase("Y7")){
                if (words.contains("banana")){
                    words.remove("banana");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("T5") && secondLetterCoords.equalsIgnoreCase("[11")){
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
