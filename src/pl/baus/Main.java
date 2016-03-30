package pl.baus;

public class Main {

    public static void main(String[] args) {

        char board [][] = new char[10][10];
        fillBoard(board);

        printLetters();
        printBoard(board);
        printLetters();
        printBoard(board);

    }

    private static void fillBoard(char[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = getRandomShips(Math.random());
            }
        }
    }

    static void printLetters(){
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print((char)('A' + i));
        }
        System.out.print('\n');
    }

    static void printBoard(char [][] board){
        for (int i = 0; i <= 9; i++) {
            int numberToPrint = i + 1;
            if(numberToPrint < 10){
                System.out.print(' ');
            }
            System.out.print(numberToPrint);
            for (int j = 0; j < 10; j++) {
                char shipValue = board[i][j];
                System.out.print(shipValue);
            }
            System.out.print('\n');
        }
    }

    private static char getRandomShips(double random) {
        if(random < 0.2) {
            return ('O');
        }else {
            return (' ');
        }
    }
}
