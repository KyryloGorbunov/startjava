public class GuessNumber {

    private int hiddenNumber = (int) (Math.random() * 100);
    private String player1Name;
    private String player2Name;
    private int player1Number;
    private int player2Number;
    private boolean win = false;

    public void setPlayer1Number(int player1Number) {
        this.player1Number = player1Number;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public void setPlayer2Number(int player2Number) {
        this.player2Number = player2Number;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void player1Start() {
        if (player1Number == hiddenNumber) {
            System.out.println("Win " + player1Name);
            win = true;
        } else if (player1Number < hiddenNumber) {
            System.out.println(player1Name + " This number is less than what the computer guessed");
        } else if (player1Number > hiddenNumber) {
            System.out.println(player1Name + " This number is greater than what the computer guessed");
        }
    }

    public void player2Star() {
        if (player2Number == hiddenNumber) {
            System.out.println("Win " + player2Name);
            win = true;
        } else if (player2Number < hiddenNumber) {
            System.out.println(player2Name + " This number is less than what the computer guessed");
        } else if (player2Number > hiddenNumber) {
            System.out.println(player2Name + " This number is greater than what the computer guessed");
        }
    }
}