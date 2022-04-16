public class GuessNumber {

    private int hiddenNumber = (int) (Math.random() * 100);
    private Player player1;
    private Player player2;
    private boolean win = false;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void player1Start() {
        if (player1.getNumber() == hiddenNumber) {
            System.out.println("Win " + player1.getName());
            hiddenNumber = (int) (Math.random() * 100);
            win = true;
        } else if (player1.getNumber() < hiddenNumber) {
            System.out.println(player1.getName() + ": This number is less than what the computer guessed");
        } else if (player1.getNumber() > hiddenNumber) {
            System.out.println(player1.getName() + ": This number is greater than what the computer guessed");
        }
    }

    public void player2Start() {
        if (player2.getNumber() == hiddenNumber) {
            System.out.println("Win " + player2.getName());
            hiddenNumber = (int) (Math.random() * 100);
            win = true;
        } else if (player2.getNumber() < hiddenNumber) {
            System.out.println(player2.getName() + ": This number is less than what the computer guessed");
        } else if (player2.getNumber() > hiddenNumber) {
            System.out.println(player2.getName() + ": This number is greater than what the computer guessed");
        }
    }
}