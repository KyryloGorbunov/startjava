public class CyclesTheme {
    public static void main(String[] args) {
        // Calculating the sum of even and odd numbers
        System.out.println("Calculating the sum of even and odd numbers:");
        int number = -11;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        do {
            number++;
            if (number % 2 == 0) {
                sumEvenNumbers = sumEvenNumbers + number;
            } else {
                sumOddNumbers = sumOddNumbers + number;
            }
        } while (number < 21);

        System.out.println("Sum of even number = " + sumEvenNumbers);
        System.out.println("Sum of even odd = " + sumOddNumbers);
        System.out.println();

        // Printing numbers between max and min
        System.out.println("Printing numbers between max and min:");
        int firstNUmber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int maxNumber = 0;
        int minNumber = 0;

        if (firstNUmber > secondNumber && firstNUmber > thirdNumber) {
            maxNumber = firstNUmber;
        } else if (secondNumber > firstNUmber && secondNumber > thirdNumber) {
            maxNumber = secondNumber;
        } else if (thirdNumber > firstNUmber && thirdNumber > secondNumber) {
            maxNumber = thirdNumber;
        }

        if (firstNUmber < secondNumber && firstNUmber < thirdNumber) {
            minNumber = firstNUmber;
        } else if (secondNumber < firstNUmber && secondNumber < thirdNumber) {
            minNumber = secondNumber;
        } else if (thirdNumber < firstNUmber && thirdNumber < secondNumber) {
            minNumber = thirdNumber;
        }
        System.out.println("Min numbers is " + minNumber + ". Max number is " + maxNumber);

        for (int i = minNumber; i <= maxNumber; i++) {
            System.out.println("All numbers between max and min = " + i);
        }
        System.out.println();

        // Output of a reversible number and the sum of its digits
        System.out.println("Output of a reversible number and the sum of its digits:");
        int reversibleNumber = 1234;
        int reversibleSum = 0;
        int reversibleNumberA = 0;

        while (reversibleNumber != 0) {
            reversibleNumberA = reversibleNumber % 10;
            System.out.print(reversibleNumberA);
            reversibleSum += reversibleNumberA;
            reversibleNumber /= 10;
        }
        System.out.println();
        System.out.println("Sum of numbers is " + reversibleSum);
        System.out.println();

        // Printing numbers to the console in multiple lines
        System.out.println("Printing numbers to the console in multiple lines:");
        int numberI = 0;
        int numberJ = 0;
        for (numberI = 1, numberJ = 1; numberI <= 24; numberI += 2, numberJ++) {
            System.out.format("%02d" + " ", numberI);
            if (numberJ % 5 == 0) {
                System.out.println();
            }
        }
        System.out.print("00" + " 00" + " 00");
        System.out.println();
        System.out.println();

        // Checking the number of ones for even parity
        System.out.println("Checking the number of ones for even parity:");
        int numberOne = 3141591;
        int countNumbersOne = 0;
        while (numberOne != 0) {
            if (numberOne % 10 == 1) {
                countNumbersOne++;
            }
            numberOne = numberOne / 10;
        }
        System.out.println("Numbers of ones is " + countNumbersOne);
        if (countNumbersOne % 2 == 0) {
            System.out.println("Sum of ones is even");
        } else {
            System.out.println("Sum of ones is odd");
        }
        System.out.println();

        // Showing figures in the console
        System.out.println("Showing figures in the console:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int numberT = 0;
        int numberTJ = 0;
        while (numberT < 5) {
            for (numberTJ = numberT; numberTJ < 5; numberTJ++) {
                System.out.print("#");
            }
            System.out.println();
            numberT++;
        }
        System.out.println();

        int numberOfRhombus = 1;
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            for (int i = 3; i > 0; i--) {
                for (int j = 2; j <= i; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            numberOfRhombus++;
        } while (numberOfRhombus == 1);

        // Display ASCII characters
        System.out.println("Display ASCII characters:");

        for (int i = 0; i <= 127; i++) {
            char ch1 = (char)i;
            System.out.print(i);
            System.out.print(" " + ch1);
            System.out.println();
        }
    }
}