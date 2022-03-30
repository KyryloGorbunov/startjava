public class MyFirstGame {
    public static void main(String[] args) {
        int numberRandom = (int)(Math.random() * 100);
        int numberInput = (int)(Math.random() * 100);
        boolean count = false;

        System.out.println("Computer guest: " + numberRandom);
        System.out.println("Enter the number: " + numberInput);
        while (count == false) {
            if (numberInput == numberRandom) {
                System.out.println(numberInput + " = " + numberRandom);
                System.out.println("You are win!");
                count = true;
            } else if (numberInput > numberRandom) {
                for (int i = numberInput; i > numberRandom; i--) {
                    System.out.println(numberInput +"This number is greater than what the computer guessed" );
                    numberInput--;
                }
            } else if (numberInput < numberRandom) {
                for (int i = numberInput; i < numberRandom; i++) {
                    System.out.println(numberInput + " This number is less than what the computer guessed");
                    numberInput++;
                }
            } else {
                System.out.println("Wrong number entered");
            }
        }
    }
}