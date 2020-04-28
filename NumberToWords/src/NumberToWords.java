public class NumberToWords {

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0)
            return 1;

        int totalDigits = 0;

        while (number > 0) {

            totalDigits++;
            number /= 10;
        }

        return totalDigits;
    }

    public static int reverse(int input) {

        int reverseNumber = 0, number = input;

        while (number != 0) {

            reverseNumber += number % 10;
            number /= 10;

            if (number != 0)
                reverseNumber *= 10;
        }

        return reverseNumber;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.print("Invalid Value");
        } else if (number == 0) {
            System.out.print("Zero");
        }

        int lastDigit, output = reverse(number), digitCount = output;

        while (output > 0) {
            lastDigit = output % 10;

            switch (lastDigit) {

                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            output /= 10;
        }

        while ((getDigitCount(digitCount) != getDigitCount(number))) {
                System.out.print("Zero ");
                digitCount *= 10;
        }

        System.out.println();
    }
}
