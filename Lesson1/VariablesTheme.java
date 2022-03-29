public class VariablesTheme {
    public static void main(String[] args) {
        // Creating Variables and Printing Their Values to the Console
        System.out.println("Creating variables and printing their values to the console:");
        byte cacheMemory = 12;
        short processorNumber = 9750;
        int ram = 16_000;
        long ssd = 536_870_912_000l;
        float clockSpeed = 2.6f;
        double turboSpeed = 4.500_000_000;
        char processorCores = '6';
        boolean osWin = true;
        System.out.println("Processor Intel Core i7 " + processorNumber + "H, processor cores Hexa-Core(" + processorCores + ")"
                + ". Clock speed " + clockSpeed + ". Turbo speed " + turboSpeed + ". CacheMemory " + cacheMemory + ". Internal RAM " + ram + ". SSS storage capacity " + ssd + " bite. Windows 11 " + osWin);
        System.out.println();

        // Calculation of the cost of goods with a discount
        System.out.println("Calculation of the cost of goods with a discount:");
        int x = 100;
        int y = 200;
        float discount = (x + y) * 0.11f;
        float sumWithDiscount = x + y - discount;
        System.out.println("Price with discount = " + sumWithDiscount);
        System.out.println("Discount amount = " + discount);
        System.out.println();

        // Output to the console word JAVA
        System.out.println("Output to the console word JAVA:");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        // Display min and max values of numeric data types
        System.out.println("Display min and max values of numeric data types:");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long ln = 9_223_372_036_854_775_807l;
        System.out.println("byte max value = " + b + ", short max value = " + s + ", int max value = " + i + ", long " +
                "max value = " + ln);
        b++;
        s++;
        i++;
        ln++;
        System.out.println("byte = " + b + ", short = " + s + ", int = " + i + ", long = " + ln);
        b--;
        s--;
        i--;
        ln--;
        System.out.println("byte = " + b + ", short = " + s + ", int = " + i + ", long = " + ln);
        System.out.println();

        // Rearranging variable values
        System.out.println("Rearranging Variable Values:");
        float f1 = 3.14f;
        float f2 = 1.5f;
        System.out.println("f1 = " + f1 + ", f2 = " + f2);
        float f3 = f1;
        f1 = f2;
        f2 = f3;
        System.out.println("f1 = " + f1 + ", f2 = " + f2);
        System.out.println();

        // Output of characters and their codes
        System.out.println("Output of characters and their codes:");
        int firstNumber = 35;
        int secondNumber = 38;
        int thirdNumber = 64;
        int fourthNumber = 94;
        int fifthNumber = 95;
        char firstChar = (char)firstNumber;
        char secondChar = (char)secondNumber;
        char thirdChar = (char)thirdNumber;
        char fourthChar = (char)fourthNumber;
        char fifthChar = (char)fifthNumber;
        System.out.println(firstNumber + " = " + firstChar);
        System.out.println(secondNumber + " = " + secondChar);
        System.out.println(thirdNumber + " = " + thirdChar);
        System.out.println(fourthNumber + " = " + fourthChar);
        System.out.println(fifthNumber + " = " + fifthChar);
        System.out.println();

        // Product and sum of digits of a number
        System.out.println("Product and sum of digits of a number:");
        int number = 345;
        int numberC = number % 10;
        number = number / 10;
        int numberB = number % 10;
        int numberA = number / 10;
        int sumOfNumbers = numberA + numberB + numberC;
        int productOfNumbers = numberA * numberB * numberC;
        System.out.println("Product of numbers 345 = " + productOfNumbers);
        System.out.println("Sum of numbers 345 = " + sumOfNumbers);
        System.out.println();
    }
}