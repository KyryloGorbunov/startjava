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
        int price1 = 100;
        int price2 = 200;
        System.out.println("Discount amount = " + ((price1 + price2) * 11 / 100));
        System.out.println("Sum of price with discount = " + (price1 + price2 - ((price1 + price2) * 11 / 100)));

        // Output to the console word JAVA
        System.out.println("\nOutput to the console word JAVA:");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        // Display min and max values of numeric data types
        System.out.println("\nDisplay min and max values of numeric data types:");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long ln = 9_223_372_036_854_775_807l;
        System.out.println("byte max value = " + b + " short max value = " + s + " int max value = " + i + " long max value = " + ln);
        System.out.println("Increment:" + " byte = " + ++b + " short = " + ++s + " int = " + ++i + " long  = " + ++ln);
        System.out.println("Decrement:" + " byte = " + --b + " short = " + --s + " int = " + --i + " long  = " + --ln);

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
        int numberChar1 = 35;
        int numberChar2 = 38;
        int numberChar3 = 64;
        int numberChar4 = 94;
        int numberChar5 = 95;
        System.out.println(numberChar1 + " = " + (char) numberChar1);
        System.out.println(numberChar2 + " = " + (char) numberChar2);
        System.out.println(numberChar3 + " = " + (char) numberChar3);
        System.out.println(numberChar4 + " = " + (char) numberChar4);
        System.out.println(numberChar5 + " = " + (char) numberChar5);

        // Product and sum of digits of a number
        System.out.println("\nProduct and sum of digits of a number:");
        int srcNumber = 345;
        int units = srcNumber % 10;
        srcNumber /= 10;
        int tens = srcNumber % 10;
        int hundreds = srcNumber / 10;
        System.out.println("Product of numbers 345 = " + (hundreds * tens * units));
        System.out.println("Sum of numbers 345 = " + (hundreds + tens + units));

        // Duke's ASCII art console output
        System.out.println("\nDuke's ASCII art console output:");
        char symbolSpace = ' ';
        char symbolSlash = '/';
        char symbolBackSlash = '\\';
        char symbolUnderscore = '_';
        char symbolLeftParentheses = '(';
        char symbolRightParentheses = ')';
        System.out.println("" + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSlash + symbolBackSlash);
        System.out.println("" + symbolSpace + symbolSpace + symbolSpace + symbolSlash + symbolSpace + symbolSpace + symbolBackSlash);
        System.out.println("" + symbolSpace + symbolSpace + symbolSlash + symbolUnderscore + symbolLeftParentheses + symbolSpace + symbolRightParentheses + symbolBackSlash);
        System.out.println("" + symbolSpace + symbolSlash + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolSpace + symbolBackSlash);
        System.out.println("" + symbolSlash + symbolUnderscore + symbolUnderscore + symbolUnderscore + symbolUnderscore + symbolSlash + symbolBackSlash
                + symbolUnderscore + symbolUnderscore + symbolBackSlash);

        // Displaying the number of hundreds, tens and units of a number
        System.out.println("\nDisplaying the number of hundreds, tens and units of a number:");
        int numberToDivide = 123;
        System.out.println(numberToDivide + " Number for divide.");
        System.out.println(numberToDivide / 100 + " hundred. Divide by 100 to get hundreds.");
        System.out.println(numberToDivide / 10 % 10 + " tens. For find number of tens: divide by 10 and modulo divide by 10.");
        System.out.println(numberToDivide % 10 + " units. For find number of units: modulo divide by 10.");

        // Seconds conversion
        System.out.println("\nSeconds conversion:");
        int srcSeconds = 86399;
        int hours = srcSeconds / 3600;
        int minutes = srcSeconds % 3600 / 60;
        int seconds = srcSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}