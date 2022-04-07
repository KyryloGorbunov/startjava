public class Calculator {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        char sign = '/';
        float result = 0;
        int exponentiation = 3;

        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%') {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = (a * b);
            } else if (sign == '/') {
                result = (float) a / (float) b;
            } else if (sign == '%') {
                result = a % b;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < exponentiation; i++) {
                result *= a;
            }
            System.out.println(a + " " + sign + exponentiation + " = " + result);
        } else {
            System.out.println("Invalid operation entered");
        }
    }
}