public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int input = number, reverse = 0;

        while (number != 0) {

            reverse += number % 10;
            number /= 10;

            if (number != 0)
                reverse = reverse * 10;
        }

        return input == reverse;
    }
}
