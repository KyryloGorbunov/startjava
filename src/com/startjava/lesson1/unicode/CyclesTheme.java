package com.startjava.lesson1.unicode;

public class CyclesTheme {
    public static void main(String[] args) {
        // Calculating the sum of even and odd numbers
        System.out.println("Calculating the sum of even and odd numbers:");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("Sum of even number = " + sumEven);
        System.out.println("Sum of even odd = " + sumOdd);

        // Printing numbers between max and min
        System.out.println("\nPrinting numbers between max and min:");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;

        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else if (number3 > number1 && number3 > number2) {
            max = number3;
        }

        int min = 0;

        if (number1 < number2 && number1 < number3) {
            min = number1;
        } else if (number2 < number1 && number2 < number3) {
            min = number2;
        } else if (number3 < number1 && number3 < number2) {
            min = number3;
        }
        System.out.println("Min numbers is " + min + ". Max number is " + max);
        System.out.println("All numbers between max and min:");
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        // Output of a reversible number and the sum of its digits
        System.out.println("\n\nOutput of a reversible number and the sum of its digits:");
        int srcNumber = 1234;
        int sum = 0;

        while (srcNumber != 0) {
            counter = srcNumber % 10;
            System.out.print(counter);
            sum += counter;
            srcNumber /= 10;
        }
        System.out.println("\nSum of numbers is " + sum);

        // Printing numbers to the console in multiple lines
        System.out.println("\nPrinting numbers to the console in multiple lines:");
        int number;
        for (number = 1, counter = 1; number < 24; number += 2, counter++) {
            System.out.format("%02d" + " ", number);
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        while (counter <= 5) {
            System.out.format("%02d" + " ", 0);
            counter++;
        }

        // Checking the number of ones for even parity
        System.out.println("\n\nChecking the number of ones for even parity:");
        srcNumber = 3141591;
        int count = 0;
        while (srcNumber != 0) {
            if (srcNumber % 10 == 1) {
                count++;
            }
            srcNumber /= 10;
        }
        System.out.println("Numbers of ones is " + count);
        if (count % 2 == 0) {
            System.out.println("Sum of ones is even");
        } else {
            System.out.println("Sum of ones is odd");
        }

        // Showing figures in the console
        System.out.println("\nShowing figures in the console:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int triangle = 0;

        while (triangle < 5) {
            int j = 5;
            while (j > triangle) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            triangle++;
        }
        System.out.println();

        count = 0;

        do {
            count++;
            if (count == 1 || count == 5) {
                System.out.println("$");
            } else if (count == 2 || count == 4) {
                int i = 0;
                do {
                    System.out.print("$");
                    i++;
                }while (i < 2);
                System.out.println();
            } else if (count == 3) {
                int i = 0;
                do {
                    System.out.print("$");
                    i++;
                }while (i < 3);
                System.out.println();
            }
        } while (count < 5);

        // Display ASCII characters
        System.out.println("\nDisplay ASCII characters:");
        System.out.println("Dec Char");
        for (int i = 0; i <= 127; i++) {
            System.out.println(String.format("%3d", i) + "  " + (char) i );
        }

        // Checking if a number is a palindrome
        System.out.println("\nChecking if a number is a palindrome:");
        srcNumber = 12321;
        number1 = srcNumber;
        number2 = 0;
        while (srcNumber / 1 != 0) {
            number2 *= 10;
            number2 += srcNumber % 10;
            srcNumber /= 10;
        }
        System.out.println("Number 12321 is palindrome = " + (number1 == number2));

        // Determining if a number is lucky
        System.out.println("\nDetermining if a number is lucky:");
        srcNumber = 257914;
        System.out.println(srcNumber);
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        int digit5 = 0;
        int digit6 = 0;

        for (int i = 1; i < 7; i++) {
            int digit = srcNumber % 10;
            srcNumber /= 10;
            if (i == 1) {
                digit6 = digit;
            } else if (i == 2) {
                digit5 = digit;
            } else if (i == 3) {
                digit4 = digit;
            } else if (i == 4) {
                digit3 = digit;
            } else if (i == 5) {
                digit2 = digit;
            } else if (i == 6) {
                digit1 = digit;
            }
        }

        int sum1 = digit1 + digit2 + digit3;
        int sum2 = digit4 + digit5 + digit6;
        System.out.println(digit1 + "" + digit2 + "" + digit3 + " = " + sum1);
        System.out.println(digit4 + "" + digit5 + "" + digit6 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Number is lucky");
        } else {
            System.out.println("Number is unlucky");
        }

        // Derivation of the Pythagorean multiplication table
        System.out.println("\nDerivation of the Pythagorean multiplication table:");
        System.out.print("   ");
        for (int i = 2; i < 10; i++) {
            System.out.format("%2d" + " ", i);
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.format("%2d" + " ", (j * i));
            }
            System.out.println();
        }
    }
}