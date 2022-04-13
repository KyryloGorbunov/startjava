import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(null, 0);
        Player player2 = new Player(null, 0);
        GuessNumber game = new GuessNumber();
        System.out.println("Starting game");
        System.out.println("Enter player1 name:");
        player1.setName(scanner.nextLine());
        game.setPlayer1Name(player1.getName());
        System.out.println("Enter player2 name:");
        player2.setName(scanner.nextLine());
        game.setPlayer2Name(player2.getName());

        do {
            System.out.println(player1.getName() + " enter the hidden number:");
            player1.setNumber(scanner.nextInt());
            game.setPlayer1Number(player1.getNumber());
            System.out.println(player2.getName() + " enter the hidden number:");
            player2.setNumber(scanner.nextInt());
            game.setPlayer2Number(player2.getNumber());
            game.player1Start();
            game.player2Star();
            boolean answer = true;
            while (answer == true && game.isWin() == false) {
                String string = scanner.nextLine();
                if (string.equals("yes") == true) {
                    answer = false;
                } else if (string.equals("no") == true) {
                    System.out.println("End of the game");
                    game.setWin(true);
                    answer = false;
                } else {
                    System.out.println("Do you want to continue the game? [yes/no]:");
                }
            }
        } while (game.isWin() == false);
    }
}