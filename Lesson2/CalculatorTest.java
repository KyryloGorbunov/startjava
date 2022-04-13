import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean calculate = true;
        do {
            System.out.println("Enter the first number: ");
            calculator.setA(scanner.nextFloat());
            System.out.println("Enter the sign of the mathematical operation: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Enter the second number: ");
            calculator.setB(scanner.nextFloat());
            System.out.println(calculator.getResult());
            boolean answer = true;
            while (answer == true) {
                String string = scanner.nextLine();
                if (string.equals("yes") == true) {
                    answer = false;
                } else if (string.equals("no") == true) {
                    calculate = false;
                    answer = false;
                } else {
                    System.out.println("Would you like to continue computing? [yes/no]:");
                }
            }
        } while (calculate == true);
    }
}