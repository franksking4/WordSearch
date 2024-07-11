import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MediumBoard {
    private final int ROWS = 15;
    private final int COLS = 15;
    private final String letters;
    private char[][] board;
    private ArrayList<String> words;

    // Constructor to create a new medium word search board.
    public MediumBoard(){
        letters = "abcdefghijklmnopqrstuvwxyz";
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

        board[14][0] = 'a';
        board[14][1] = 'a';
        board[14][2] = 'd';
        board[14][3] = 'j';
        board[14][4] = 'o';
        board[14][5] = 't';

        board[0][2] = 'k';
        board[1][2] = 'a';
        board[2][2] = 'y';
        board[3][2] = 'd';
        board[4][2] = 'e';
        board[5][2] = 'n';

        board[1][2] = 'a';
        board[1][3] = 'i';
        board[1][4] = 'r';
        board[1][5] = 'p';
        board[1][6] = 'l';
        board[1][7] = 'a';
        board[1][8] = 'n';
        board[1][9] = 'e';

        board[2][3] = 'w';
        board[2][4] = 'a';
        board[2][5] = 't';
        board[2][6] = 'e';
        board[2][7] = 'r';

        board[5][9] = 'b';
        board[6][10] = 'a';
        board[7][11] = 'n';
        board[8][12] = 'a';
        board[9][13] = 'n';
        board[10][14] = 'a';

    }

    // Method to print the board.
    public void printBoard(){
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        char rowLabel = 'A';
        for (int i = 0; i < 15; i++){
            System.out.print(rowLabel + " ");
            for (int j = 0; j < 15; j++){
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
            if (firstLetterCoords.equalsIgnoreCase("C4") && secondLetterCoords.equalsIgnoreCase("C8")){
                if (words.contains("water")){
                    words.remove("water");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("A3") && secondLetterCoords.equalsIgnoreCase("F3")){
                if (words.contains("kayden")){
                    words.remove("kayden");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("O1") && secondLetterCoords.equalsIgnoreCase("O6")){
                if (words.contains("aadjot")){
                    words.remove("aadjot");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("F10") && secondLetterCoords.equalsIgnoreCase("K15")){
                if (words.contains("banana")){
                    words.remove("banana");
                    System.out.println("Correct! You have found "+(5-words.size())+" out of 5 words!");
                    getResponse();
                }else{
                    System.out.println("You have already found this word! Try again!");
                    getResponse();
                }
            }else if (firstLetterCoords.equalsIgnoreCase("B3") && secondLetterCoords.equalsIgnoreCase("B10")){
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
