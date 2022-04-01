public class VariablesTheme {
    public static void main(String[] args) {
        // Creating Variables and Printing Their Values to the Console
        System.out.println("Creating variables and printing their values to the console:");
        byte cacheMemory = 12;
        short cpuNumber = 9750;
        int ram = 16_000;
        long ssd = 536_870_912_000l;
        float clockSpeed = 2.6f;
        double turboSpeed = 4.500_000_000;
        char cpuCores = '6';
        boolean osWin = true;
        System.out.println("CPU Intel Core i7 " + cpuNumber + "H, CPU cores Hexa-Core(" + cpuCores + ")" + ". Clock speed " + clockSpeed + ". Turbo speed " + turboSpeed + ".CacheMemory " 
                + cacheMemory + ". \nInternal RAM " + ram + ". SSS storage capacity " + ssd 
                + " bite. Windows 11 " + osWin);

        // Calculation of the cost of goods with a discount
        System.out.println("\nCalculation of the cost of goods with a discount:");
        int productX = 100;
        int productY = 200;
        float discount = (productX + productY) * 0.11f;
        float sumWithDiscount = productX + productY - discount;
        System.out.println("Price with discount = " + (productX + productY - ((productX + productY) * 11 / 100))
                + "\nDiscount amount = " + ((productX + productY) * 11 / 100));

        // Output to the console word JAVA
        System.out.println("\nOutput to the console word JAVA:");
        System.out.println("   J    a  v     v  a   "
                + "\n   J   a a  v   v  a a  "
                + "\nJ  J  aaaaa  V V  aaaaa "
                + "\n JJ  a     a  V  a     a");

        // Display min and max values of numeric data types
        System.out.println("Display min and max values of numeric data types:");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long ln = 9_223_372_036_854_775_807l;
        System.out.println("byte max value = " + b + " short max value = " + s + " int max value = " + i + " long max value = " + ln
                + "\nIncrement:" + " byte = " + ++b + " short = " + ++s + " int = " + ++i + " long  = " + ++ln
                + "\nDecrement:" + " byte = " + --b + " short = " + --s + " int = " + --i + " long  = " + --ln);

        // Rearranging variable values
        System.out.println("\nRearranging Variable Values:");
        float f1 = 3.14f;
        float f2 = 1.5f;
        System.out.println("f1 = " + f1 + ", f2 = " + f2);
        float f3 = f1;
        f1 = f2;
        f2 = f3;
        System.out.println("f1 = " + f1 + ", f2 = " + f2);

        // Output of characters and their codes
        System.out.println("\nOutput of characters and their codes:");
        int NumberOfCharOne = 35;
        int NumberOfCharTwo = 38;
        int NumberOfCharThree = 64;
        int NumberOfCharFour = 94;
        int NumberOfCharFifth = 95;
        System.out.println(NumberOfCharOne + " = " + (char) NumberOfCharOne
                + "\n" + NumberOfCharTwo + " = " + (char) NumberOfCharTwo
                + "\n" + NumberOfCharThree + " = " + (char) NumberOfCharThree
                + "\n" + NumberOfCharFour + " = " + (char) NumberOfCharFour
                + "\n" + NumberOfCharFifth + " = " + (char) NumberOfCharFifth);

        // Product and sum of digits of a number
        System.out.println("\nProduct and sum of digits of a number:");
        int number = 345;
        int numberC = number % 10;
        number = number / 10;
        int numberB = number % 10;
        int numberA = number / 10;
        System.out.println("Product of numbers 345 = " + (numberA * numberB * numberC)
                + "\nSum of numbers 345 = " + (numberA + numberB + numberC));

        // Duke's ASCII art console output
        System.out.println("\nDuke's ASCII art console output:");
        char symbolSpace = ' ';
        char symbolSlash = '/';
        char symbolBackSlash = 92;
        char symbolUnderscore = '_';
        char symbolLeftParentheses = '(';
        char symbolRightParentheses = ')';
        System.out.println("\n" + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSlash + symbolBackSlash
                + "\n" + symbolSpace + symbolSpace + symbolSpace + symbolSlash + symbolSpace + symbolSpace + symbolBackSlash
                + "\n" + symbolSpace + symbolSpace + symbolSlash + symbolUnderscore + symbolLeftParentheses + symbolSpace + symbolRightParentheses + symbolBackSlash
                + "\n" + symbolSpace + symbolSlash + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolBackSlash
                + "\n" + symbolSlash + symbolUnderscore + symbolUnderscore + symbolUnderscore + symbolUnderscore + symbolSlash + symbolBackSlash
                + symbolUnderscore + symbolUnderscore + symbolBackSlash);

        // Displaying the number of hundreds, tens and units of a number
        System.out.println("\nDisplaying the number of hundreds, tens and units of a number:");
        int numberToDivide = 123;
        System.out.println(numberToDivide + " Number for divide."
                + "\n" + numberToDivide / 100 + " Divide by 100 to get hundreds."
                + "\n" + numberToDivide / 10 % 10 + " For find number of tens: divide by 10 and modulo divide by 10."
                + "\n" + numberToDivide % 10 + " For find number of units: modulo divide by 10.");

        // Seconds conversion
        System.out.println("\nSeconds conversion:");
        int numberOfSeconds = 86399;
        int hoursInSeconds = numberOfSeconds / 3600;
        int minutesInSeconds = numberOfSeconds % 3600 / 60;
        int restOfSeconds = numberOfSeconds % 60;
        System.out.println(hoursInSeconds + ":" +  minutesInSeconds + ":" +  restOfSeconds);
    }
}