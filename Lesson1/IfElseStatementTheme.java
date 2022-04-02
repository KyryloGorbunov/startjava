public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Translation of pseudocode into Java language
        System.out.println("Translation of pseudocode into Java language:");
        int age = 30;
        boolean male = false;
        float height = 1.83f;
        String name1 = "Maria";
        String name2 = "Irina";

        if (age > 20) {
            System.out.println("Adult human with age = " + age);
        } else {
            System.out.println("Young human with age = " + age);
        }

        if (!male) {
            System.out.println("Gender: woman");
        }

        if (height < 1.80) {
            System.out.println("Average growth = " + height);
        } else {
            System.out.println("High growth = " + height);
        }

        char firstLetterOfName = name1.charAt(0);

        if (firstLetterOfName == 'M') {
            System.out.println("Name = " + name1);
        } else if (firstLetterOfName == 'I') {
            System.out.println("Name = " + name2);
        } else {
            System.out.println("Woman not found");
        }

        // Finding the maximum and minimum number
        System.out.println("\nFinding the maximum and minimum number:");
        int number1 = 47;
        int number2 = 15;

        if (number1 > number2) {
            System.out.println("Max number = " + number1 + ". Min number = " + number2);
        } else if (number2 > number1) {
            System.out.println("Max number = " + number2 + ". Min number = " + number1);
        } else {
            System.out.println("The numbers are equal");
        }

        // Working with a number
        System.out.println("\nWorking with a number:");
        int srcNumber = 37;

        if (srcNumber % 2 == 0) {
            System.out.println("Number is even = " + srcNumber);
        } else {
            System.out.println("Number is odd = " + srcNumber);
        }

        if (srcNumber > 0) {
            System.out.println("Number is positive = " + srcNumber);
        } else if (srcNumber < 0) {
            System.out.println("Number is negative" + srcNumber);
        } else {
            System.out.println("Number is null = " + srcNumber);
        }

        // Finding a common digit in numbers
        System.out.println("\nFinding a common digit in numbers:");
        int numberCompare1 = 348;
        int numberCompare2 = 343;
        System.out.println("Same digits in numbers " + numberCompare1 + " and " + numberCompare2 + ":");

        if (numberCompare1 / 100 == numberCompare2 / 100) {
            System.out.print(numberCompare1 / 100);
        }

        if (numberCompare1 / 10 % 10 == numberCompare2 / 10 % 10) {
            System.out.print(numberCompare1 / 10 % 10);
        }

        if (numberCompare1 % 10 == numberCompare2 % 10) {
            System.out.print(numberCompare1 % 10);
        }


        // Determining a letter, number or symbol by their code
        System.out.println("\n" + "\nDetermining a letter, number or symbol by their code:");
        char ch1 = '\u005A';

        if (ch1 >= '0' && ch1 <= 9) {
            System.out.println(ch1 + " is a number.");
        } else if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println(ch1 + " is a small letter.");
        } else if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println(ch1 + " is a capital letter.");
        } else {
            System.out.println(ch1 + " is not a letter or a number");
        }

        // Determining the amount of the deposit and the % accrued by the bank
        System.out.println("\nDetermining the amount of the deposit and the % accrued by the bank:");
        int deposit = 300_000;
        int interest = 0;

        if (deposit < 100_000) {
            interest = deposit * 5 / 100;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            interest = deposit * 7 / 100;
        } else if (deposit > 300_000) {
            interest = deposit * 10 / 100;
        }
        System.out.println("Amount of deposit  = " + deposit + ", interest = " + interest + ",total amount " +
                "with interest = " + (deposit + interest));

        // Determination of grade in subjects
        System.out.println("\nDetermination of grade in subjects:");
        int grade = 100;
        int historyPercent = grade * 59 / 100;
        int csPercent = grade * 91 / 100;
        int historyScore = 0;
        int csScore = 0;

        if (historyPercent > grade * 91 / 100) {
            historyScore = 5;
        } else if (historyPercent > grade * 73 / 100) {
            historyScore = 4;
        } else if (historyPercent > grade * 60 / 100) {
            historyScore = 3;
        } else if (historyPercent <= grade * 60 / 100) {
            historyScore = 2;
        }

        if (csPercent > grade * 91 / 100) {
            csScore = 5;
        } else if (csPercent > grade * 73 / 100) {
            csScore = 4;
        } else if (csPercent > grade * 60 / 100) {
            csScore = 3;
        } else if (csPercent <= grade * 60 / 100) {
            csScore = 2;
        }

        System.out.println("History: " + historyScore + "; CS: " + csScore);
        System.out.println("Average grade: " + (historyScore + csScore) / 2);
        System.out.println("Average percent: " + (historyPercent + csPercent) / 2 + "%");

        // Calculation of profit (loss)
        System.out.println("\nCalculation of profit (loss):");
        int rent = 5_000;
        int sales = 15_000;
        int purchase = 9_000;
        int months = 12;

        if (sales * months > (rent * months) + (purchase * months)) {
            System.out.println("Profit in one year = " + "+" + (sales * months - ((rent * months) + (purchase * months))));
        } else if (sales * months < (rent * months) + (purchase * months)) {
            System.out.println("Loss in one year = " + ((rent * months) + (purchase * months) - (sales * months)));
        }

        // Determining the existence of a triangle
        System.out.println("\nDetermining the existence of a triangle:");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        if (sideA < sideB + sideC || sideB < sideA + sideC || sideC < sideA + sideB) {
            System.out.println("Triangle exist");
        } else {
            System.out.println("Triangle doesn't exist");
        }

        if (sideA * sideA == (sideB * sideB) + (sideC * sideC)) {
            System.out.println("SideA is hypotenuse, sideB and sideC is legs");
            System.out.println("S = " + (sideB * sideC) / 2);
        } else if (sideB * sideB == (sideA * sideA) + (sideC * sideC)) {
            System.out.println("sideB is hypotenuse, sideA and sideC is legs");
            System.out.println("S = " + (sideA * sideC) / 2);
        } else if (sideC * sideC == (sideA * sideA) + (sideB * sideB)) {
            System.out.println("sideC is hypotenuse, sideA and sideB is legs");
            System.out.println("S = " + (sideA * sideB) / 2);
        }
        System.out.println("|" + "\\");
        System.out.println("|" + " " + "\\");
        System.out.println("|" + " " + " " + "\\");
        System.out.println("|" + "_" + "_" + "_" + "\\");

        // Counting the number of banknotes
        System.out.println("\nCounting the number of banknotes:");
        deposit = 567;
        int bills = 50;

        if (bills == 50) {
            int fifties = deposit / 50;
            int tenners = deposit % 50 / 10;
            int ones = deposit % 10;
            System.out.println("Fifties = 50, tenners = 10, ones = 1");
            System.out.println("We have " + fifties + " fifties and " + tenners + " tenners and " + ones + " ones." );
            System.out.println("Reverse calculation of the initial amount: " + ((fifties * 50) + (tenners * 10) + (ones * 1)));
        } else if (bills == 10) {
            int tenners = deposit / 10;
            int ones = deposit % 10;
            System.out.println("Tenners = 10, ones = 1");
            System.out.println("We have " + tenners + " tenners and " + ones + " ones.");
            System.out.println("Reverse calculation of the initial amount: " + ((tenners * 10) + (ones * 1)));
        } else if (bills == 1) {
            System.out.println("We have " + deposit + "ones");
        }
    }
}