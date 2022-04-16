import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting game");
        System.out.println("Enter player1 name:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Enter player2 name:");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;

        do {
            System.out.println(player1.getName() + " enter the hidden number:");
            player1.setNumber(scanner.nextInt());
            game.player1Start();
            if (game.isWin() == false) {
                System.out.println(player2.getName() + " enter the hidden number:");
                player2.setNumber(scanner.nextInt());
                game.player2Start();
            }
            answer = scanner.nextLine();
            if (game.isWin() == true) {
                while (answer.equals("yes") == false && answer.equals("no") == false) {
                    System.out.println("Do you want to continue the game? [yes/no]:");
                    answer = scanner.nextLine();
                    game.setWin(false);
                }
            }
        } while (answer.equals("no") == false);
    }
}