public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if ((num1 < 10) || (num1 > 1000)
                || (num2 < 10) || (num2 > 1000)
                || (num3 < 10) || (num3 > 1000))
            return false;

        int num1SecondDigit = num1 % 10,
                num2SecondDigit = num2 % 10,
                num3SecondDigit = num3 % 10;

        return (num1SecondDigit == num2SecondDigit)
                || (num1SecondDigit == num3SecondDigit) || (num2SecondDigit == num3SecondDigit);

    }

    public static boolean isValid(int number) {

        if (number < 10 || number > 1000)
            return false;

        return true;
    }
}
