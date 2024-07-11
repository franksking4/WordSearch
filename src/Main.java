import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Tutorial
        System.out.println("\nHello and welcome to Frank's Word Search Game! \nTo play, you first need to choose either easy, medium, hard, or impossible difficulty. \n - Pick EASY difficulty if you want no challenge at all. \n - Pick MEDIUM difficulty if you want a bit of a challenge. \n - Pick HARD difficulty if you want a big challenge. \nPlaying the game is fairly simple. \nWhen you find a word, use the grid to enter the coordinates of the first and last letters. \nThe coordinates start with the letter or symbol on the left and end with the number on the top. \nThe game is over once all 5 words have been found.\n");
        System.out.println("Here is an example of correct and incorrect coordinates:");
        System.out.println("\n  1 2 3 4 5");
        System.out.println("A f p q m q");
        System.out.println("B r n m r a");
        System.out.println("C a r e m l");
        System.out.println("D n w p l q");
        System.out.println("E k m n b c");
        System.out.println("\nWords: frank");
        System.out.println("Correct Coordinates: A1, E1");
        System.out.println("Incorrect Coordinates: E1, A1");

        // The player hits the ENTER key when they are ready to begin playing the game.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPress ENTER when you are ready to choose a difficulty and start playing");
        scan.nextLine();
        chooseDifficulty();
    }

    // Method for choosing the difficulty of the game.
    public static void chooseDifficulty(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a difficulty: (0=Easy,1=Medium,2=Hard)");
        int difficultySelection = scan.nextInt();
        if (difficultySelection == 0){
            System.out.println("You have picked easy mode.");
            EasyBoard board = new EasyBoard();
            board.printBoard();
            board.getResponse();
            System.out.println("Congratulations! You have won the game! Rerun the program to play again.");
        }else if (difficultySelection == 1){
            System.out.println("You have picked medium mode.");
            MediumBoard board = new MediumBoard();
            board.printBoard();
            board.getResponse();
            System.out.println("Congratulations! You have won the game! Rerun the program to play again.");
        }else if (difficultySelection == 2){
            System.out.println("You have picked hard mode.");
            HardBoard board = new HardBoard();
            board.printBoard();
            board.getResponse();
        }else{
            System.out.println("Incorrect selection. Please try again!");
            chooseDifficulty();
        }
    }
}