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
            System.out.println("Adult with age = " + age);
        } else {
            System.out.println("Young with age = " + age);
        }

        if (!male) {
            System.out.println("woman");
        }

        if (height < 1.80) {
            System.out.println("short with height = " + height);
        } else {
            System.out.println("tall with height =" + height);
        }

        char firstLetterOfName = name1.charAt(0);

        if (firstLetterOfName == 'M') {
            System.out.println("Name = " + name1);
        } else if (firstLetterOfName == 'I') {
            System.out.println("Name = " + name2);
        } else {
            System.out.println("Woman not found");
        }
        System.out.println();

        // Finding the maximum and minimum number
        System.out.println("Finding the maximum and minimum number:");
        int firstNumber = 47;
        int secondNumber = 15;

        if (firstNumber > secondNumber) {
            System.out.println("Max number = " + firstNumber + ". Min number = " + secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Max number = " + secondNumber + ". Min number = " + firstNumber);
        } else {
            System.out.println("The numbers are equal");
        }
        System.out.println();

        // Working with a number
        System.out.println("Working with a number:");
        int number = 37;

        if (number % 2 == 0) {
            System.out.println("Number is even = " + number);
        } else if (number % 2 != 0) {
            System.out.println("Number is odd = " + number);
        }

        if (number > 0) {
            System.out.println("Number is positive = " + number);
        } else if (number < 0) {
            System.out.println("Number is negative" + number);
        }

        if (number == 0) {
            System.out.println("Number is null = " + number);
        }
        System.out.println();

        // Finding a common digit in numbers
        System.out.println("Finding a common digit in numbers:");
        int commonNumberOne = 348;
        int commonNumberTwo = 143;
        String stringNUmberOne = String.valueOf(commonNumberOne);
        String stringNUmberTwo = String.valueOf(commonNumberTwo);
        char charNumberOne1 = stringNUmberOne.charAt(0);
        char charNumberOne2 = stringNUmberOne.charAt(1);
        char charNumberOne3 = stringNUmberOne.charAt(2);
        char charNumberTwo1 = stringNUmberTwo.charAt(0);
        char charNumberTwo2 = stringNUmberTwo.charAt(1);
        char charNumberTwo3 = stringNUmberTwo.charAt(2);

        if (charNumberOne1 == charNumberTwo1) {
            System.out.println("Same digits of " + commonNumberOne + " and " + commonNumberTwo + " = " + charNumberOne1);
        } else if (charNumberOne2 == charNumberTwo2) {
            System.out.println("Same digits of " + commonNumberOne + " and " + commonNumberTwo + " = " + charNumberOne2);
        } else if (charNumberOne3 == charNumberTwo3) {
            System.out.println("Same digits of " + commonNumberOne + " and " + commonNumberTwo + " = " + charNumberOne3);
        } else {
            System.out.println("Not found same digits");
        }
        System.out.println();

        // Determining a letter, number or symbol by their code
        System.out.println("Determining a letter, number or symbol by their code:");
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
        System.out.println();

        // Determining the amount of the deposit and the % accrued by the bank
        System.out.println("Determining the amount of the deposit and the % accrued by the bank:");
        int amountOfDeposit = 300_000;
        float interest = 0;

        if (amountOfDeposit < 100_000) {
            interest = amountOfDeposit * 0.05f;
        } else if (amountOfDeposit >= 100_000 && amountOfDeposit <= 300_000) {
            interest = amountOfDeposit * 0.07f;
        } else if (amountOfDeposit > 300_000) {
            interest = amountOfDeposit * 0.1f;
        }

        int sumAmountOfDepositWithInterest = amountOfDeposit + (int) interest;
        System.out.println("Amount of deposit  = " + amountOfDeposit + ", interest = " + interest + ",total amount " +
                "with interest = " + sumAmountOfDepositWithInterest);
        System.out.println();

        // Determination of grade in subjects
        System.out.println("Determination of grade in subjects:");
        int grade = 100;
        int historyPercentage = grade * 59 / 100;
        int programmingPercentage = grade * 91 / 100;
        int historyGrade = 0;
        int programmingGrade = 0;

        if (historyPercentage > grade * 0.91) {
            historyGrade = 5;
        } else if (historyPercentage > grade * 0.73) {
            historyGrade = 4;
        } else if (historyPercentage > grade * 0.60) {
            historyGrade = 3;
        } else if (historyPercentage <= grade * 0.60) {
            historyGrade = 2;
        }

        if (programmingPercentage > grade * 0.91) {
            programmingGrade = 5;
        } else if (programmingPercentage > grade * 0.73) {
            programmingGrade = 4;
        } else if (programmingPercentage > grade * 0.60) {
            programmingGrade = 3;
        } else if (programmingPercentage <= grade * 0.60) {
            programmingGrade = 2;
        }

        float averageGrade = (historyGrade + programmingGrade) / 2;
        float averagePercentage = (historyPercentage + programmingPercentage) / 2;

        System.out.println(historyGrade + " history");
        System.out.println(programmingGrade + " programming");
        System.out.println("Average grade = " + averageGrade);
        System.out.println("Average percentage = " + averagePercentage);
        System.out.println();

        // Calculation of profit (loss)
        System.out.println("Calculation of profit (loss):");
        int priceOfRent = 5_000;
        int saleOfGoods = 15_000;
        int priceOfGoods = 9_000;
        int priceOfRentInYear = priceOfRent * 12;
        int saleOfGoodsInYear = saleOfGoods * 12;
        int priceOfGoodsInYear = priceOfGoods * 12;
        char plus = 43;
        int profit = 0;
        int loss = 0;

        if (saleOfGoodsInYear > priceOfRentInYear + priceOfGoodsInYear) {
            profit = saleOfGoodsInYear - (priceOfRentInYear + priceOfGoodsInYear);
            System.out.println("Profit in one year = " + plus + profit);
        } else if (saleOfGoodsInYear < priceOfRentInYear + priceOfGoodsInYear) {
            loss = (priceOfRentInYear + priceOfGoodsInYear) - saleOfGoodsInYear;
            System.out.println("Loss in one year = " + loss);
        }

        System.out.println();
    }
}