public class Calculator {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        char sign = '^';
        char plus = '+';
        char minus = '-';
        char multiplication = '*';
        char division = '/';
        char moduloDivision = '%';
        char signExponentiationA = '^';
        int exponentiation = 3;

        if (sign == plus) {
            int result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == minus) {
            int result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == multiplication) {
            int result = (a * b);
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == division) {
            float result = (float) a / (float) b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == moduloDivision) {
            int result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == signExponentiationA) {
            int result = 1;
            for (int i = 0; i < exponentiation; i++) {
                result *= a;
            }
            System.out.println(a + " " + sign + exponentiation + " = " + result);
        } else {
            System.out.println("Invalid operation entered");
        }
    }
}