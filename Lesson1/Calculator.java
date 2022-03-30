public class Calculator {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        float result = 0;
        char sign = '+';
        char signPlus = '+';
        char signMinus = '-';
        char signMultiplication = '*';
        char signDivision = '/';
        char signModuloDivision = '%';
        char signExponentiationA = '^';
        char singExponentiationB = '~';
        int exponentiation = 3;
        int exponentiationA = 1;
        int exponentiationB = 1;

        for (int i = 0; i < exponentiation; i++) {
            exponentiationA = (exponentiationA * a);
        }

        for (int i = 0; i < exponentiation; i++) {
            exponentiationB = (exponentiationB * b);
        }

        if (sign == signPlus) {
            result = a + b;
        } else if (sign == signMinus) {
            result = a - b;
        } else if (sign == signMultiplication) {
            result = a * b;
        } else if (sign == signDivision) {
            result = a / b;
        } else if (sign == signModuloDivision) {
            result = a % b;
        } else if (sign == signExponentiationA) {
            result = exponentiationA;
        } else if (sign == singExponentiationB) {
            result = exponentiationB;
        } else {
            System.out.println("Invalid operation entered");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
        // System.out.println(a + " " + sign + exponentiation + " = " + result); //Exponentiation of the number A
        // System.out.println(b + " " + sign + exponentiation + " = " + result); //Exponentiation of the number B
    }
}