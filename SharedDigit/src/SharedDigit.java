public class SharedDigit {

    public static boolean hasSharedDigit(int start, int end) {

        if ((start < 10) || (start > 99)
                || (end < 10) || (end > 99))
            return false;

        int startFirstDigit = start % 10;
        start /= 10;
        int startSecondDigit = start % 10;

        int endFirstDigit = end % 10;
        end /= 10;
        int endSecondDigit = end % 10;

        return (startFirstDigit == endFirstDigit) || (startFirstDigit == endSecondDigit)
                || (startSecondDigit == endFirstDigit) || (startSecondDigit == endSecondDigit);

    }
}
