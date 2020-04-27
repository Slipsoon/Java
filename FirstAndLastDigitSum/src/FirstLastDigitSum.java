public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0)
            return -1;

        int firstDigit = number % 10, lastDigit = 0, input = number;

        while (number != 0) {

            lastDigit = number % 10;
            number /= 10;
        }

        System.out.println("firstDigit: " + firstDigit + ", secondDigit " + lastDigit);
        return firstDigit + lastDigit;
    }
}
